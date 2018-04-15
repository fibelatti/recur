object Versions {
    const val gradleVersion = "3.1.1"
    const val kotlinVersion = "1.2.31"
    const val dexCountPlugin = "0.8.2"
    const val jacocoVersion = "0.8.1"

    const val minSdkVersion = 21
    const val targetSdkVersion = 27
    const val compileSdkVersion = 27

    const val buildToolsVersion = "27.0.3"

    internal val supportLibraryVersion = "27.1.0"
    internal val constraintVersion = "1.0.2"

    internal val rxJavaVersion = "2.1.12"
    internal val rxAndroidVersion = "2.0.2"

    internal val roomVersion = "1.0.0"

    internal val jUnitVersion = "4.12"
    internal val testRunnerVersion = "1.0.1"
    internal val mockitoVersion = "2.17.0"
}

object Classpaths {
    val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    val jacocoPlugin = "org.jacoco:org.jacoco.core:${Versions.jacocoVersion}"
    val dexCountPlugin = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${Versions.dexCountPlugin}"
}

object KotlinDependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlinVersion}"
}

object SupportLibraryDependencies {
    val supportLibrary = "com.android.support:appcompat-v7:${Versions.supportLibraryVersion}"
    val designLibrary = "com.android.support:design:${Versions.supportLibraryVersion}"
    val constraintLibrary = "com.android.support.constraint:constraint-layout:${Versions.constraintVersion}"
}

object RxDependencies {
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
}

object PersistenceDependencies {
    val room = "android.arch.persistence.room:rxjava2:${Versions.roomVersion}"
    val roomCompiler = "android.arch.persistence.room:compiler:${Versions.roomVersion}"
}

object TestDependencies {
    val junit = "junit:junit:${Versions.jUnitVersion}"
    val testRunner = "com.android.support.test:runner:${Versions.testRunnerVersion}"
    val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
    val mockitoCore = "org.mockito:mockito-core:${Versions.mockitoVersion}"
    val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockitoVersion}"
    val supportAnnotations = "com.android.support:support-annotations:${Versions.supportLibraryVersion}"
}
