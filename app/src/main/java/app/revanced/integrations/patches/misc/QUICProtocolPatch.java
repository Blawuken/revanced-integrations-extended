package app.revanced.integrations.patches.misc;

import app.revanced.integrations.settings.SettingsEnum;

@SuppressWarnings("unused")
public class QUICProtocolPatch {

    public static boolean disableQUICProtocol(boolean original) {
        return !SettingsEnum.DISABLE_QUIC_PROTOCOL.getBoolean() && original;
    }
}
