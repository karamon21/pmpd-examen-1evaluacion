plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "edu.iesam.teslaapp"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "edu.iesam.teslaapp"
        minSdk = 29
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    implementation(libs.gson)

    //Dependencias para usar la librería de kotlin serialization
    implementation(libs.kotlin.serialization)
    //Dependencias para los test
    testImplementation(libs.mockkAgent)
    testImplementation(libs.mockkAndroid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}