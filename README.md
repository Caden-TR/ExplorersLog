# Explorer's Log

You will build an app that logs things you find, then add a phone feature at each stage: vibration, battery level, notifications, location and the camera. Along the way you will find out how Android permissions work.

Follow the **Explorer's Log: Android Permissions** task sheet. Each stage has three parts: **Learn it**, **Build it** and **Try it yourself**.

## Get started

1. In Android Studio, choose **File > New > Project from Version Control** (or **Clone Repository** on the welcome screen).
2. Paste the URL of **this** repository and choose the folder you have been told to use.
3. Wait for Gradle to finish syncing. If Android Studio offers to upgrade the Android Gradle Plugin, click **Dismiss**.
4. Pick your virtual phone and press **Run**. You should see "Your log goes here".
5. Your Kotlin code goes in `app/src/main/java/com/example/explorerslog/MainActivity.kt`, below **YOUR CODE STARTS HERE**.
6. Permissions go in `app/src/main/AndroidManifest.xml`.

## Save your work to GitHub after every stage

1. Open the **Commit** panel (the tick icon on the left, or **Ctrl+K**).
2. Tick the files you changed and write a short message, for example `Stage 4: notifications`.
3. Press **Commit and Push**, then **Push**.

## Stages

- [ ] Stage 1: log a find
- [ ] Stage 2: buzz (a normal permission)
- [ ] Stage 3: battery level (no permission)
- [ ] Stage 4: notifications (a runtime permission)
- [ ] Stage 5: location (two runtime permissions)
- [ ] Stage 6: photo (no permission... until you add one)
- [ ] Stretch: the "denied twice" problem
- [ ] Fill in `PERMISSIONS.md` as you go

## Useful tricks

- **Reset permissions:** uninstall the app from the emulator (hold its icon, then drag it to Uninstall), then run it again. Android will ask again as if it were the first time.
- **Fake the battery or location:** click the three dots **...** on the emulator's toolbar to open **Extended Controls**.
- **App crashes:** open **Logcat** and look for the first red line. Permission problems say `SecurityException`.
