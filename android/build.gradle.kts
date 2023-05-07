group = "com.kasem.receive_sharing_intent"
version = "1.0-SNAPSHOT"

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 16
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    lintOptions {
        disable += "InvalidPackage"
    }
}
