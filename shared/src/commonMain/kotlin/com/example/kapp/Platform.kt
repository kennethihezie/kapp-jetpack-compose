package com.example.kapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform