// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    dependencies {
//        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.40.1'
//        classpath 'com.google.gms:google-services:4.3.13'
//
//        def nav_version = "2.5.0"
//        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
//    }
//}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

buildscript {
//    repositories {
//        google()
//        mavenCentral()
//    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        classpath ("com.android.tools.build:gradle:8.0.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
    }
}

