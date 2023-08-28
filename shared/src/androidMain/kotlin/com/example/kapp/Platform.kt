package com.example.kapp

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

//actual denotes a platform-specific implementation in multiplatform projects
actual fun getPlatform(): Platform = AndroidPlatform()