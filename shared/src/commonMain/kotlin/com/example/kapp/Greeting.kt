package com.example.kapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun addNumber(a: Int, b: Int): Int  {
        return a + b
    }
}