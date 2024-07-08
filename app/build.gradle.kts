//
//
//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.google.gms.google.services)
//    id("kotlin-parcelize")
//    id("androidx.navigation.safeargs.kotlin")
//    id("dagger.hilt.android.plugin")
//    id("org.jetbrains.kotlin.kapt")
//}
//
//android {
//    namespace = "com.example.e_commerceapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.e_commerceapp"
//        minSdk = 21
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}
//
//dependencies {
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    implementation(libs.androidx.activity)
//    implementation(libs.androidx.constraintlayout)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//
//    // Loading button
//    implementation("br.com.simplepass:loading-button-android:2.2.0")
//
//    // Glide
//    implementation("com.github.bumptech.glide:glide:4.13.0")
//
//    // Circular image
//    implementation("de.hdodenhof:circleimageview:3.1.0")
//
//    // ViewPager2 indicator
//    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")
//
//    // StepView
//    implementation("com.shuhart.stepview:stepview:1.5.1")
//
//    // Android Ktx
//    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
//
//    // Dagger Hilt
//    implementation("com.google.dagger:hilt-android:2.38.1")
////    kapt("com.google.dagger:hilt-compiler:2.38.1")
//
//    // Firebase
//    implementation("com.google.firebase:firebase-auth:23.0.0")
//}
////
////kapt {
////    correctErrorTypes = true
////}


plugins {

    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

//    id ('kotlin-parcelize')
//    id ('androidx.navigation.safeargs.kotlin')
//    id ('dagger.hilt.android.plugin')

}

android {
    namespace = "com.example.e_commerceapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.e_commerceapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.firestore.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.google.dagger:hilt-android:2.40.1")
    kapt("com.google.dagger:hilt-compiler:2.40.1")

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")

    //Firebase
    implementation("com.google.firebase:firebase-auth:21.0.6")


//    apply() plugin ("kotlin-kapt")
//
//    //loading button
//    implementation ("br.com.simplepass:loading-button-android:2.2.0")
//
//    //Glide
//    implementation ("com.github.bumptech.glide:glide:4.13.0")
//
//    //circular image
//    implementation ("de.hdodenhof:circleimageview:3.1.0")
//
//    //viewpager2 indicatior
//    implementation ("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")
//
//    //stepView
//    implementation ("com.shuhart.stepview:stepview:1.5.1")
//
//    //Android Ktx
//    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.2")
//
//    //Dagger hilt
//    implementation ("com.google.dagger:hilt-android:2.38.1")
//    kapt ("com.google.dagger:hilt-compiler:2.38.1")

}