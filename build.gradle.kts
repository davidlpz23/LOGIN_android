buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10") // Asegúrate de que esta versión sea compatible
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}

allprojects {
    // No need for repositories here anymore
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
