# Permissions log

Fill in a row at the end of each stage. Stage 2 is started for you.

| Stage | Feature | Permission needed | Normal or runtime? | In the manifest? | Asked at runtime? | What happens if it is missing or refused? | Privacy concern for the user |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 2 | Buzz | VIBRATE | Normal | Yes | No | | |
| 3 | Battery level | | | | | | |
| 4 | Notifications | | | | | | |
| 5 | Location | | | | | | |
| 6 | Photo (camera app) | | | | | | |
| 6 | Photo with CAMERA in the manifest | | | | | | |

## Tests

| No. | What I am testing | What I did | Expected result | Actual result | Pass / Fail |
| --- | --- | --- | --- | --- | --- |
| 1 | Log with no note | Tap Log it with the box empty | Message asks me to type something, nothing is added | | |
| 2 | Notifications allowed | Allow, then log a find | | | |
| 3 | Notifications refused | Uninstall, run, refuse, log a find | | | |
| 4 | Precise location | Allow precise location, tap Where am I? | | | |
| 5 | Approximate location | Uninstall, run, choose Approximate | | | |
| 6 | Location refused twice | Refuse, tap Where am I? again, refuse again | | | |
| 7 | Low battery | Set battery to 15% in Extended Controls | | | |
| 8 | Cancel the camera | Open the camera, then press Back | | | |

## What I learned

Which permissions would your maths app for Assignment 2 need, and why?
