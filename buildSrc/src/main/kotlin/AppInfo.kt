object AppInfo {
    const val appName = "Recur"
    const val applicationId = "com.fibelatti.recur"

    const val versionMajor = 1
    const val versionMinor = 0
    const val versionPatch = 0

    val versionCode: Int = versionMajor * 10000 + versionMinor * 100 + versionPatch

    val versionName: String = "${AppInfo.versionMajor}.${AppInfo.versionMinor}${if (versionPatch != 0) ".$AppInfo.versionPatch" else ""}"
}
