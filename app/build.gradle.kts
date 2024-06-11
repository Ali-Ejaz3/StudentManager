plugins {
    alias(libs.plugins.android.application)
    kotlin("kapt")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.roomdbtutorial"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.roomdbtutorial"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        viewBinding = true
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
    tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
        kotlinOptions {
            jvmTarget = "1.8" // Set JVM target to Java 8 bytecode
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("androidx.room:room-runtime:2.4.3")
    kapt("androidx.room:room-compiler:2.4.3" )// For Kotlin projects
    annotationProcessor ("androidx.room:room-compiler:2.4.3") // For Java projects

    // Optionally, add Room Kotlin extensions for Kotlin projects
    implementation ("androidx.room:room-ktx:2.4.3")




}
kapt {
    correctErrorTypes = true
}