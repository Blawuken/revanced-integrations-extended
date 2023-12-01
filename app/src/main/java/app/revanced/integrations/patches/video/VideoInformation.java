package app.revanced.integrations.patches.video;

import static app.revanced.integrations.utils.StringRef.str;

import androidx.annotation.NonNull;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Objects;

import app.revanced.integrations.settings.SettingsEnum;
import app.revanced.integrations.shared.VideoState;
import app.revanced.integrations.utils.LogHelper;
import app.revanced.integrations.utils.ReVancedUtils;
import app.revanced.integrations.utils.VideoHelpers;

/**
 * Hooking class for the current playing video.
 */
public final class VideoInformation {
    private static final String SEEK_METHOD_NAME = "seekTo";
    /**
     * Injection point.
     */
    public static boolean isLiveStream = false;

    private static WeakReference<Object> playerControllerRef;
    private static Method seekMethod;

    @NonNull
    private static String videoId = "";

    private static long videoLength = 0;
    private static long videoTime = -1;

    /**
     * Injection point.
     *
     * @param playerController player controller object.
     */
    public static void initialize(@NonNull Object playerController) {
        try {
            playerControllerRef = new WeakReference<>(Objects.requireNonNull(playerController));
            videoLength = 0;
            videoTime = -1;

            seekMethod = playerController.getClass().getMethod(SEEK_METHOD_NAME, Long.TYPE);
            seekMethod.setAccessible(true);
        } catch (Exception ex) {
            LogHelper.printException(() -> "Failed to initialize", ex);
        }
    }

    /**
     * Seek on the current video.
     * <b>Currently this does not function for Shorts playback.</b>
     * <p>
     * Caution: If called from a videoTimeHook() callback,
     * this will cause a recursive call into the same videoTimeHook() callback.
     *
     * @param millisecond The millisecond to seek the video to.
     * @return if the seek was successful
     */
    public static boolean seekTo(long millisecond) {
        final long videoLength = getVideoLength();

        // Don't seek more than the video length to prevent issues such as
        // Play pause button or autoplay not working.
        // TODO: These are arbitrarily chosen values and should be subject to be adjusted.
        final long seekToMilliseconds = millisecond <= videoLength - 500 ? millisecond : millisecond - 100;

        ReVancedUtils.verifyOnMainThread();
        try {
            //noinspection DataFlowIssue
            return (Boolean) seekMethod.invoke(playerControllerRef.get(), seekToMilliseconds);
        } catch (Exception ex) {
            LogHelper.printException(() -> "Failed to seek", ex);
        }
        return false;
    }

    public static void seekToRelative(long millisecondsRelative) {
        seekTo(videoTime + millisecondsRelative);
    }

    public static void reloadVideo() {
        ReVancedUtils.runOnMainThreadDelayed(() -> {
                    if (videoLength < 10000 || isLiveStream)
                        return;

                    final long lastVideoTime = videoTime;
                    final float playbackSpeed = VideoHelpers.getCurrentSpeed();
                    final long speedAdjustedTimeThreshold = (long) (playbackSpeed * 1000);
                    seekTo(10000);
                    seekTo(lastVideoTime + speedAdjustedTimeThreshold);

                    if (!SettingsEnum.SKIP_PRELOADED_BUFFER_TOAST.getBoolean())
                        return;

                    ReVancedUtils.showToastShort(str("revanced_skipped_preloaded_buffer"));
                }, 700
        );
    }

    public static boolean videoEnded() {
        return SettingsEnum.ALWAYS_REPEAT.getBoolean() && seekTo(0);
    }

    /**
     * Id of the current video playing.  Includes Shorts.
     *
     * @return The id of the video. Empty string if not set yet.
     */
    @NonNull
    public static String getVideoId() {
        return videoId;
    }

    /**
     * Injection point.
     *
     * @param newlyLoadedVideoId id of the current video
     */
    public static void setVideoId(@NonNull String newlyLoadedVideoId) {
        if (videoId.equals(newlyLoadedVideoId))
            return;

        videoId = newlyLoadedVideoId;
    }

    /**
     * Length of the current video playing.  Includes Shorts.
     *
     * @return The length of the video in milliseconds.
     * If the video is not yet loaded, or if the video is playing in the background with no video visible,
     * then this returns zero.
     */
    public static long getVideoLength() {
        return videoLength;
    }

    /**
     * Injection point.
     *
     * @param length The length of the video in milliseconds.
     */
    public static void setVideoLength(final long length) {
        videoLength = length;
    }

    /**
     * Playback time of the current video playing.  Includes Shorts.
     * <p>
     * Value will lag behind the actual playback time by a variable amount based on the playback speed.
     * <p>
     * If playback speed is 2.0x, this value may be up to 2000ms behind the actual playback time.
     * If playback speed is 1.0x, this value may be up to 1000ms behind the actual playback time.
     * If playback speed is 0.5x, this value may be up to 500ms behind the actual playback time.
     * Etc.
     *
     * @return The time of the video in milliseconds. -1 if not set yet.
     */
    public static long getVideoTime() {
        return videoTime;
    }

    /**
     * Injection point.
     * Called on the main thread every 1000ms.
     *
     * @param time The current playback time of the video in milliseconds.
     */
    public static void setVideoTime(final long time) {
        videoTime = time;
    }

    /**
     * @return If the playback is not at the end of the video.
     * <p>
     * If video is playing in the background with no video visible,
     * this always returns false (even if the video is not actually at the end).
     * <p>
     * This is equivalent to checking for {@link VideoState#ENDED},
     * but can give a more up to date result for code calling from some hooks.
     * @see VideoState
     */
    public static boolean isNotAtEndOfVideo() {
        return videoTime < videoLength && videoLength > 0;
    }
}
