object Versions {
    val min_sdk = 21
    val target_sdk = 30
    val compile_sdk = 30

    val kotlin = "1.4.31"
    val android_gradle_plugin = "4.0.1"

    val buildToolsVersion = "30.0.2"
    val coroutines = "1.4.2-native-mt"
    val kermit = "0.1.8"

    val ktor = "1.5.0"
    val junit = "4.13.1"
    val material = "1.2.1"
    val serialization = "1.0.1"


    object AndroidX {
        val appcompat = "1.2.0"
        val constraintlayout = "2.0.4"
        val core = "1.3.2"
        val lifecycle = "2.2.0"
        val recyclerview = "1.1.0"
        val swipeRefresh = "1.1.0"
        val test = "1.3.0"
        val test_ext = "1.1.2"
    }
}

object Deps {
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val junit = "junit:junit:${Versions.junit}"
    val material = "com.google.android.material:material:${Versions.material}"


    object AndroidX {
        val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
        val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintlayout}"
        val recyclerView = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
        val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.AndroidX.swipeRefresh}"

        val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
        val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.AndroidX.lifecycle}"
        val lifecycle_viewmodel_extensions = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
        val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.AndroidX.lifecycle}"
        val lifecycle_extension = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.lifecycle}"
    }

    object AndroidXTest {
        val core = "androidx.test:core:${Versions.AndroidX.test}"
        val junit = "androidx.test.ext:junit:${Versions.AndroidX.test_ext}"
        val runner = "androidx.test:runner:${Versions.AndroidX.test}"
        val rules = "androidx.test:rules:${Versions.AndroidX.test}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }


    object Ktor {
        val commonCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        val commonJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        val commonLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        val androidCore = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
        val commonSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    }
}
