# [1.9.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.8.0...v1.9.0) (2024-01-04)


### Bug Fixes

* **YouTube/Settings:** settings are not initialized properly ([01174ab](https://github.com/Blawuken/revanced-integrations-extended/commit/01174abf84618935e992d79fc63610850f667501))
* **YouTube/YouTube Music:** change default value ([40d3623](https://github.com/Blawuken/revanced-integrations-extended/commit/40d3623d671b45b2cfdf0951db29028798bc2f9f))


### Features

* **YouTube Music:** add `Disable overlay filter` patch ([ce35ade](https://github.com/Blawuken/revanced-integrations-extended/commit/ce35adead229f920313bd9ac7af6e997d122c943))

# [1.8.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.7.0...v1.8.0) (2023-12-31)


### Bug Fixes

* **YouTube Music/Disable auto captions:** captions are always disabled when `Disable auto captions` is on ([43b78c4](https://github.com/Blawuken/revanced-integrations-extended/commit/43b78c424fb97fa6939f4ca490e84c5b70847bbb))
* **YouTube/Disable auto captions:** patch does not work when A/B testing is applied ([c10ce92](https://github.com/Blawuken/revanced-integrations-extended/commit/c10ce9240e3df429be4583ecd32980b242446a53))
* **YouTube/Hide captions button:** patch does not work when A/B testing is applied ([d0c93ff](https://github.com/Blawuken/revanced-integrations-extended/commit/d0c93ff4d32bc42c623a83369b8f21b9f9f23bc0))
* **YouTube/Remove viewer discretion dialog:** `Remove viewer discretion dialog` settings close unintended dialog ([c3b9ee9](https://github.com/Blawuken/revanced-integrations-extended/commit/c3b9ee956d230c432c377b4647d8f37f0c065497))
* **YouTube/SponsorBlock:** do not auto skip end segments more than once if using a slow playback speed ([6ab8078](https://github.com/Blawuken/revanced-integrations-extended/commit/6ab8078acc1b81344e807d29bd6ee634fb6b159a))
* **YouTube/VideoInformation:** Ignore video seek attempts during the last 250ms of video playback ([1656a7d](https://github.com/Blawuken/revanced-integrations-extended/commit/1656a7dc41c7a6d0549938e131478a351a3748dc))


### Features

* **YouTube Music/Hide flyout menu:** add unimplemented settings ([d536b2d](https://github.com/Blawuken/revanced-integrations-extended/commit/d536b2dab2a36a83d0e057f3b31488da77865fbf))
* **YouTube Music:** add `Remove viewer discretion dialog` patch ([eda63cb](https://github.com/Blawuken/revanced-integrations-extended/commit/eda63cb9ee70d6dede99d4bb7dd5a4f0d00cb48c))
* **YouTube:** add `Remove viewer discretion dialog` patch ([93798b4](https://github.com/Blawuken/revanced-integrations-extended/commit/93798b4f249c0ef2e52859053ebfe9639138f0a4))

# [1.7.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.6.0...v1.7.0) (2023-12-25)


### Bug Fixes

* error toast is shown when not connected to the network or playing a device file ([e269724](https://github.com/Blawuken/revanced-integrations-extended/commit/e269724331c8e14fae341c71952ba1a7dfc04ed5))
* **YouTube Music/Hide flyout panel:** `Watch on YouTube` menu works even when playing a device file ([1b75132](https://github.com/Blawuken/revanced-integrations-extended/commit/1b75132281ccc53085c07cc601545af0a8ef19b9))
* **YouTube Music/Hide flyout panel:** restart dialog is missing ([1e5d559](https://github.com/Blawuken/revanced-integrations-extended/commit/1e5d559ef0fc3e4e55fa9367f55767c46b3effc5))
* **YouTube Music/Settings:** change default value of `Enable new player background` setting in YT Music v6.31.55+ ([f6542ea](https://github.com/Blawuken/revanced-integrations-extended/commit/f6542ea8c4327fe2c8a91248a216dbef024b072c))
* **YouTube Music/SponsorBlock:** segments not skipping during background play ([7641103](https://github.com/Blawuken/revanced-integrations-extended/commit/7641103fd8f06f634d44101649f62009986e5e04))
* **YouTube/Enable wide search bar:** layout breaks on devices above 720 dpi ([72c0426](https://github.com/Blawuken/revanced-integrations-extended/commit/72c04265e268b850b7bec3789df51bb8206995e7))
* **YouTube/Hide comment component:** Thanks button isn't hidden ([ea4917f](https://github.com/Blawuken/revanced-integrations-extended/commit/ea4917f26b211308e8d4fc70f48b789fe24d3cb7))
* **YouTube/Hide general ads:** `Close interstitial ads` setting hides `interstitial ads` ([0a73982](https://github.com/Blawuken/revanced-integrations-extended/commit/0a739825f37423a3ac4d52a21fe265d4ceae1967))
* **YouTube/Settings:** specifies a fallback string as a summary if an invalid value is specified in list preference ([3b0344d](https://github.com/Blawuken/revanced-integrations-extended/commit/3b0344d5b955661bb698ac6c29feb905dbadbbfb))
* **YouTube/Settings:** when exporting settings to the file, wrong app name is used in Android 13+ ([55bedd5](https://github.com/Blawuken/revanced-integrations-extended/commit/55bedd56c2827174df0c4c622421a1fcde3ff7f2))


### Features

* **YouTube Music/Hide action bar component:** add `Hide add to playlist button`, `Hide comment button`, `Hide download button`, `Hide share button` settings ([60949e1](https://github.com/Blawuken/revanced-integrations-extended/commit/60949e192c3a7ee8cf110e98da9ec08f9b7bd6ea))
* **YouTube Music/Hide general ads:** add `Hide interstitial ads` settings ([7ffb3f3](https://github.com/Blawuken/revanced-integrations-extended/commit/7ffb3f375e2d56033117a91938315015189bc615))
* **YouTube Music/Hide general ads:** remove `Close interstitial ads` settings ([f332a04](https://github.com/Blawuken/revanced-integrations-extended/commit/f332a04cec5278501f3d6934dcea08edaf4c6473))
* **YouTube/Hide layout components:** add `Hide videos with gray description` settings ([2a0eb20](https://github.com/Blawuken/revanced-integrations-extended/commit/2a0eb207277c01dd5eb37f1be390da85bb47e813))

# [1.6.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.5.0...v1.6.0) (2023-12-18)


### Bug Fixes

* **YouTube/Hide button container:** `Hide save to playlist button` setting hides the save to playlist button in quick actions ([410ae5d](https://github.com/Blawuken/revanced-integrations-extended/commit/410ae5d0fb0538a6dffd9cc554e15648aac30bdd))
* **YouTube/Hide general ads:** `Close interstitial ads` setting hides `interstitial ads` ([1fa05b4](https://github.com/Blawuken/revanced-integrations-extended/commit/1fa05b4e6dfe111f0ccaf99f513e10445473d5a4))
* **YouTube/Litho filter:** integrate filter ([e751d06](https://github.com/Blawuken/revanced-integrations-extended/commit/e751d067af04e47956b8dbf67840e7ba7f09084b))
* **YouTube/Quick actions components:** `Hide save to playlist button` setting does not support new icon (A/B tests) ([acb0962](https://github.com/Blawuken/revanced-integrations-extended/commit/acb09627d605c7bfac415e1e811bffc8376c9399))
* **YouTube/Return YouTube Dislike:** do not prefetch Shorts shelf items on app startup ([e3f31f0](https://github.com/Blawuken/revanced-integrations-extended/commit/e3f31f01764e6e4ead5857ffbe44ee22e1e2e824))
* **YouTube/Settings:** default value does not match ([71604c7](https://github.com/Blawuken/revanced-integrations-extended/commit/71604c7b760047129fab0272174b93458a0aac1d))
* **YouTube/SponsorBlock:** export local statistics with saved settings ([fd68bc0](https://github.com/Blawuken/revanced-integrations-extended/commit/fd68bc0d28b5ff7afc54c1a1cd0dd63d29e88031))
* **YouTube/SponsorBlock:** export local statistics with saved settings ([dae9640](https://github.com/Blawuken/revanced-integrations-extended/commit/dae964094a959da66caf2bdde649ac6275c690c2))


### Features

* **YouTube/Hide comment component:** add `Hide comments by members banner` settings ([1916a31](https://github.com/Blawuken/revanced-integrations-extended/commit/1916a310ba20d69dbfa79e935df3ba7e3b1fafe1))
* **YouTube:** add `Enable bottom player gestures` patch ([35421f3](https://github.com/Blawuken/revanced-integrations-extended/commit/35421f3506ab7756bc2d6dea75453069ba1ba020))

# [1.5.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.4.0...v1.5.0) (2023-12-13)


### Bug Fixes

* **YouTube Music/Hide general ads:** `Hide premium renewal banner` is not hidden properly ([d3d884b](https://github.com/Blawuken/revanced-integrations-extended/commit/d3d884b2d7d65ea5ecdf028e5b1893b30d4d7ee8))
* **YouTube Music/Remember video quality:** video quality toast shows wrong quality value ([1247355](https://github.com/Blawuken/revanced-integrations-extended/commit/1247355c1cdc2e79f4be5c33413b194a3465774c))
* **YouTube/Hide general ads:** `Hide view products banner` setting hides the content of `Store` section in channel profile ([d97ee69](https://github.com/Blawuken/revanced-integrations-extended/commit/d97ee69d1bcd1932deb0c34d3270cc3f87e44fb3))
* **YouTube/Hide general ads:** new types of ads are not blocked ([d9e5a22](https://github.com/Blawuken/revanced-integrations-extended/commit/d9e5a22c8be6b0bc7aabdf35b286218c59dda500))
* **YouTube/Litho filter:** integrate filter ([e3ba3a3](https://github.com/Blawuken/revanced-integrations-extended/commit/e3ba3a3b8668a2cb0194f1ddb3ca2ca3bef773e5))
* **YouTube/Return YouTube Dislike:** wait until fetch is complete before allowing the first Short to start playback ([6a5e6a7](https://github.com/Blawuken/revanced-integrations-extended/commit/6a5e6a7beb19662de31ca44043a807bfd705adf1))
* **YouTube/Swipe controls:** press-to-swipe gesture working on overlays ([d20775e](https://github.com/Blawuken/revanced-integrations-extended/commit/d20775ec6e065efe35d50279d54a8b233b45d30d))


### Features

* **Integrations:** use new method ([4e2584d](https://github.com/Blawuken/revanced-integrations-extended/commit/4e2584dcd282fa751c3c4b006949930b28ccab20))
* **YouTube Music:** rename patch `Start page` → `Change start page` ([89d48f2](https://github.com/Blawuken/revanced-integrations-extended/commit/89d48f2436d2501d241f1a98acd93669eb459300))
* **YouTube/Alternative thumbnails:** matches official ReVanced code ([7ce12c8](https://github.com/Blawuken/revanced-integrations-extended/commit/7ce12c8159434489051482f7055456a8da5df3e1))
* **YouTube/Hide channel profile components:** add `Hide store tab` settings ([3b7b53d](https://github.com/Blawuken/revanced-integrations-extended/commit/3b7b53dd16033766c2a3b663a24c650800cc835a))
* **YouTube/Hide navigation buttons:** remove `Open library(You) on app startup` settings ([9958b59](https://github.com/Blawuken/revanced-integrations-extended/commit/9958b5988d3bdd30d318a876a2751958494b680e))
* **YouTube/Spoof player parameters:** matches official ReVanced code ([b975828](https://github.com/Blawuken/revanced-integrations-extended/commit/b975828f36eea0a004bc18e018f920fd1bfa1970))
* **YouTube/Spoof player parameters:** matches official ReVanced code ([9316bd9](https://github.com/Blawuken/revanced-integrations-extended/commit/9316bd9a5381a7c0617f7e980e578ea9d4d52b20))
* **YouTube:** add `Change start page` patch ([ed7b12d](https://github.com/Blawuken/revanced-integrations-extended/commit/ed7b12d93fcdc7fa7f40edb0ee97202a2c891267))
* **YouTube:** remove `Change homepage` patch ([e6077df](https://github.com/Blawuken/revanced-integrations-extended/commit/e6077df829249d69fa36041b28d66226f9e67efc))
* **YouTube:** rename patch `Enable music search` → `Enable song search` ([1aa1df4](https://github.com/Blawuken/revanced-integrations-extended/commit/1aa1df42bc2ba1f68eca61d7f2e4381f58566a76))

# [1.4.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.3.1...v1.4.0) (2023-12-09)


### Bug Fixes

* **Hide general ads:** `interstitial ads` are closed too early ([e92b130](https://github.com/Blawuken/revanced-integrations-extended/commit/e92b130287cb2c69c350caf4d41edc85f19d6a42))
* **YouTube Music/Hide action bar label:** patch breaks in `v6.31.55+` ([08064b4](https://github.com/Blawuken/revanced-integrations-extended/commit/08064b4e4b9254b5e8b2865edadc0557882e90df))


### Features

* **Reddit:** change patch name: `Hide place button` → `Hide toolbar button` ([820445f](https://github.com/Blawuken/revanced-integrations-extended/commit/820445f928f2100825fd9b498a3ca84162f9fe66))
* **YouTube Music/Hide general ads:** now patch hides new type of interstitial banner ([e40ac47](https://github.com/Blawuken/revanced-integrations-extended/commit/e40ac477c26f46a0b414e39170d9482cd878b7de))

## [1.3.1](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.3.0...v1.3.1) (2023-12-06)


### Bug Fixes

* **YouTube/Spoof player parameters:** thumbnail preview is not updated ([e9476d9](https://github.com/Blawuken/revanced-integrations-extended/commit/e9476d91578e991684e96b76cd5da12ea698795e))

# [1.3.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.2.0...v1.3.0) (2023-12-06)


### Bug Fixes

* **Return YouTube Dislike:** error toast shown in unintended situations ([db6d950](https://github.com/Blawuken/revanced-integrations-extended/commit/db6d9506ed3b0b5edae07a8d3fb7dbc5c3e7283b))
* **YouTube Music/Hide general ads:** `Hide premium renewal banner` is not hidden ([766ed26](https://github.com/Blawuken/revanced-integrations-extended/commit/766ed260734286ad974f94e99bce9c406e3a37ad))
* **YouTube/Overlay buttons:** `Hook download button` setting is visible even in versions that do not support `Hook download button` ([2cb0fe9](https://github.com/Blawuken/revanced-integrations-extended/commit/2cb0fe98b7a264b6e81f55b88fbf0485b536f1a6))
* **YouTube/Return YouTube Dislike:** dislikes sometimes not showing for non English language ([804a783](https://github.com/Blawuken/revanced-integrations-extended/commit/804a7834e195a75aaefda7d296f1ed7f0cfaee3c))
* **YouTube/Return YouTube Dislike:** prevent the first Short opened from freezing the UI ([da876ec](https://github.com/Blawuken/revanced-integrations-extended/commit/da876ec949a9c679a549d324e3dff1f2575ba5de))
* **YouTube/Spoof player parameters:** error toast shown when you first launch the app ([7872b5f](https://github.com/Blawuken/revanced-integrations-extended/commit/7872b5f0e5ec4a998a2f5904e05be6e716fbf9ce))


### Features

* **YouTube/Hide general ads:** toast message is shown when closing `interstitial ads` ([2f1a498](https://github.com/Blawuken/revanced-integrations-extended/commit/2f1a498ddeb49755b2a34a0440e0ad18b5aa6213))

# [1.2.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.1.0...v1.2.0) (2023-12-03)


### Bug Fixes

* **YouTube/SponsorBlock:** some videos refused to end where there's a skippable segment at the end ([85c5ea2](https://github.com/Blawuken/revanced-integrations-extended/commit/85c5ea25d3c1f12bf42fbda0cf4147c560c8520e))
* **YouTube/Swipe controls:** change the description of settings ([775f9d3](https://github.com/Blawuken/revanced-integrations-extended/commit/775f9d31de345620d76accb579b2abea7be4aa26))


### Features

* **YouTube Music:** add `Hide general ads` patch ([12afb07](https://github.com/Blawuken/revanced-integrations-extended/commit/12afb07d608ad1fd10e5a317278b0dbf5d789c8f))
* **YouTube/Default video quality:** check whether the default video quality is valid before applying it ([ddc9da6](https://github.com/Blawuken/revanced-integrations-extended/commit/ddc9da65bdc616209496e558f64aa8035e2cd40f))
* **YouTube/Swipe controls:** add `Swipe gestures in 'Lock screen' mode` settings ([ae4245d](https://github.com/Blawuken/revanced-integrations-extended/commit/ae4245d205820c28ee63a96f9dd610994f5ed742))

# [1.1.0](https://github.com/Blawuken/revanced-integrations-extended/compare/v1.0.0...v1.1.0) (2023-12-03)


### Bug Fixes

* **YouTube/Hide layout components:** `Hide feed surveys` sometimes does not work ([b773cd9](https://github.com/Blawuken/revanced-integrations-extended/commit/b773cd9cbee2f5e1df5aba58e3452a59075eebd0))
* **YouTube/Settings:** some translations are wrong ([2abd43e](https://github.com/Blawuken/revanced-integrations-extended/commit/2abd43e87ba6f6a925d0107ef012738060c41b1b))
* **YouTube/SponsorBlock:** some videos refused to end where there's a skippable segment at the end ([0cd2ad1](https://github.com/Blawuken/revanced-integrations-extended/commit/0cd2ad1af0f12803999c9dec0d977cfb6def5ee5))
* **YouTube/Swipe controls:** swipe gesture working even after using `Lock screen` feature when `Press-to-swipe` is enabled ([d7330de](https://github.com/Blawuken/revanced-integrations-extended/commit/d7330de8220aa1237efe1ed221680be61e827d10))


### Features

* **YouTube Music/Hide music ads:** add `Close interstitial ads` settings ([7eb4aaf](https://github.com/Blawuken/revanced-integrations-extended/commit/7eb4aafe6cfff26c8e52a73395c79f7cbcfe6308))
* **YouTube/Hide general ads:** add `Close interstitial ads` settings ([e6d4939](https://github.com/Blawuken/revanced-integrations-extended/commit/e6d4939d1987f7d6efe373cba56012925b0781e6))
* **YouTube/Hide shorts components:** add `Hide create shorts button` settings ([536af80](https://github.com/Blawuken/revanced-integrations-extended/commit/536af802b917ff63780120ac21bd72db42a80b90))

# 1.0.0 (2023-12-01)


### Bug Fixes

* **YouTube Music/Return YouTube Dislike:** some settings and resources have been missing ([9af2def](https://github.com/Blawuken/revanced-integrations-extended/commit/9af2def4541087d831bb7266ad3dd40102f729b8))
* **YouTube Music/SponsorBlock:** some settings and resources have been missing ([909b00b](https://github.com/Blawuken/revanced-integrations-extended/commit/909b00b6c879f1fed58aa20b5664b1a92b4c3028))
* **YouTube/Overlay buttons:** change the dialog style of the external downloader ([627264b](https://github.com/Blawuken/revanced-integrations-extended/commit/627264b5d5076ad2a6c59ee9b57f88b120d27438))
* **YouTube/Overlay buttons:** change the dialog style of the external downloader ([6eefacc](https://github.com/Blawuken/revanced-integrations-extended/commit/6eefacc5b50767ea5069b62ec06f89905116def8))
* **YouTube/Return YouTube Dislike:** some settings and resources have been missing ([d65e172](https://github.com/Blawuken/revanced-integrations-extended/commit/d65e17272d1858f568d6cf90dacfde931c4bfcf2))
* **YouTube/Settings:** some Listpreference is specified as an unintended summary ([5c5ab38](https://github.com/Blawuken/revanced-integrations-extended/commit/5c5ab380504f6a7b84e73b88306f842e68bfcf71))
* **YouTube/SponsorBlock:** some settings and resources have been missing ([6956874](https://github.com/Blawuken/revanced-integrations-extended/commit/695687428945fef18567907b3891befbca5215e6))
* **YouTube/SponsorBlock:** some videos refused to end where there's a skippable segment at the end ([cdfa9ad](https://github.com/Blawuken/revanced-integrations-extended/commit/cdfa9ad5424fc6f425ccdaf40f3a11da6f95e4d5))
* **YouTube/Theme:** rollback to previous commit ([aefc2d0](https://github.com/Blawuken/revanced-integrations-extended/commit/aefc2d0c0b03e7bceb90f2252366c38ea2c76f2f))


### Features

* modernize restart logic ([6d09d9e](https://github.com/Blawuken/revanced-integrations-extended/commit/6d09d9e3ce1925282ea1ff5542c63c635206b6fb))
* **YouTube Music/Settings:** `Import / Export as file` is no longer save in `*.json` format, and is saved in `*.txt` format ([c97ea84](https://github.com/Blawuken/revanced-integrations-extended/commit/c97ea84bea1f0ad4bd64fa2690eb704ec42475fd))
* **YouTube/Hide suggestions shelf:** add method to detect navbar index ([21b5144](https://github.com/Blawuken/revanced-integrations-extended/commit/21b51446b69fb387613c06a51555c8cff531c948))
* **YouTube/Settings:** `Import / Export as file` is no longer save in `*.json` format, and is saved in `*.txt` format ([e0a7575](https://github.com/Blawuken/revanced-integrations-extended/commit/e0a7575ed046076aee362e8e56f4417b3317cc11))
* **YouTube:** add `Force fullscreen` patch ([c7a4a7f](https://github.com/Blawuken/revanced-integrations-extended/commit/c7a4a7fe88182a5e4da1ab4259df55e54caf6654))

## [0.122.1](https://github.com/Blawuken/revanced-integrations/compare/v0.122.0...v0.122.1) (2023-11-21)


### Bug Fixes

* **YouTube/Default video quality:** `Skipped preloaded buffer` is also applied to live stream video ([3542aa4](https://github.com/Blawuken/revanced-integrations/commit/3542aa416109027b8ef9f383e3218412b902a832))
* **YouTube/Hide mix playlists:** check if the byte parameter is null ([b87517e](https://github.com/Blawuken/revanced-integrations/commit/b87517ead135af3aa0932b9f0e8565c633a19d83))
* **YouTube/Return YouTube Dislike:** improve layout padding ([2ed7d05](https://github.com/Blawuken/revanced-integrations/commit/2ed7d05390110997a8a31410e2b8200d981d0ab2))
* **YouTube/SponsorBlock:** skip segments breaks autoplay ([3e03a47](https://github.com/Blawuken/revanced-integrations/commit/3e03a4743ecea202e23da593c9da0845dd889fcd))
* **YouTube/Spoof player parameters:** frozen video on playback start ([37993c4](https://github.com/Blawuken/revanced-integrations/commit/37993c44fc760208723944cae0fc8f08cb27d889))

# [0.122.0](https://github.com/Blawuken/revanced-integrations/compare/v0.121.4...v0.122.0) (2023-11-21)


### Bug Fixes

* **YouTube/Enable wide search bar:** even if `Enable Wide Search Bar` is turned off, the toolbar of You tab is replaced if `Enable wide search bar in you tab` is turned on ([dabff0e](https://github.com/Blawuken/revanced-integrations/commit/dabff0e5dea887d5e60d51f4e972cf0b1829027d))
* **YouTube/Hide general ads:** rollback legacy code ([e573a50](https://github.com/Blawuken/revanced-integrations/commit/e573a502cd39626b1fdaa75f27e9f7b62e793c6c))
* **YouTube/Return YouTube Dislike:** match to official ReVanced code ([00f1e10](https://github.com/Blawuken/revanced-integrations/commit/00f1e106a01f3fd63f60cf2b78da06a38dae72a5))
* **YouTube/Spoof player parameters:** change response waiting time ([9911c2d](https://github.com/Blawuken/revanced-integrations/commit/9911c2dc50c40c013ec4c4bde700a7a22acb453f))


### Features

* **YouTube/Hide channel profile components:** add `Hide 'For You' shelf` settings ([c443414](https://github.com/Blawuken/revanced-integrations/commit/c443414cdf064f8cade9693189bdd4917234c928))
* **YouTube/Hide description components:** add `Hide podcast sections` settings ([e78ead6](https://github.com/Blawuken/revanced-integrations/commit/e78ead6a373716000cf2af2d3bfe3e1c78770202))
* **YouTube:** separate the `Hide channel profile components` patch from `Hide layout components` patch ([150d861](https://github.com/Blawuken/revanced-integrations/commit/150d8616479f7a9469d525033a6b77b5c3c7082d))
