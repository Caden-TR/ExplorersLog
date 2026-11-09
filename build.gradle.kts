// Top-level build file. You do not need to change anything in here.
// Android Gradle Plugin 9 has Kotlin built in, so there is no separate Kotlin plugin.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
