plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.example.my_list_sakura"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.my_list_sakura"
        minSdk = 24
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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)


    implementation(libs.androidx.fragment.ktx)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    // Room -Сохранение в локальной базе данных
    implementation(libs.androidx.room.common)
    implementation(libs.room)
    implementation(libs.room.runtime)
//    annotationProcessor(libs.room.compiler) // removed by advice of AI
    ksp(libs.room.compiler)

    //Kotlin Extensions - возможность расширять свойства и функции Kotlin
    implementation(libs.androidx.room.ktx.v261)

    // Hilt: Возможность внедрять зависимости в любой класс с помощью аннотации @Inject
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // ViewModel and LiveData -хранилище данных  применение паттерна MVVM
    // и отслеживание жизненого цикла страницы
    // - ее готовность к получению/передаче данных
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)

    // Coroutines -возможность асинхронного выполнения кода
    // работа с данными даже если главный поток занят, в боковом потоке
    implementation(libs.kotlinx.coroutines.android)


    //Glide загрузка изображения с бэкенда
    implementation(libs.glide)


    // круглое изображение
    implementation ("de.hdodenhof:circleimageview:3.1.0")


}