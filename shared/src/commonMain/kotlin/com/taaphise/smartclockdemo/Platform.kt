package com.taaphise.smartclockdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform