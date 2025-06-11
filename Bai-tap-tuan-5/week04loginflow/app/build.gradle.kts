plugins {
    alias(libs.plugins.android.application) // <-- GIỮ LẠI DÒNG NÀY
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    // XÓA DÒNG NÀY: id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.week04loginflow"
    compileSdk = 35 // Đảm bảo compileSdk không phải 34 nếu bạn muốn dùng targetSdk 35

    defaultConfig {
        applicationId = "com.example.week04loginflow"
        minSdk = 26
        targetSdk = 35 // Target Android 15
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
        // Đảm bảo phiên bản Java tương thích với JVM Target
        sourceCompatibility = JavaVersion.VERSION_1_8 // Thường là 1_8 cho Android
        targetCompatibility = JavaVersion.VERSION_1_8 // Thường là 1_8 cho Android
    }
    kotlinOptions {
        jvmTarget = "1.8" // Hoặc "11" nếu bạn chắc chắn muốn dùng Java 11 và đã cấu hình JDK đúng
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("io.coil-kt:coil-compose:2.2.2")
    implementation ("androidx.activity:activity-compose:1.7.2")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation("androidx.activity:activity-ktx:1.9.0")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("com.google.firebase:firebase-storage-ktx")
    implementation("io.coil-kt:coil-compose:2.6.0") // Kiểm tra phiên bản mới nhất trên Maven Central
    implementation("androidx.compose.material:material-icons-extended")
    // Đảm bảo Firebase BOM là phiên bản mới nhất và nằm TRƯỚC các Firebase dependencies khác
    implementation(platform("com.google.firebase:firebase-bom:33.1.0")) // Tôi thấy bạn dùng 33.15.0, hãy kiểm tra lại phiên bản mới nhất trên Firebase Docs
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}