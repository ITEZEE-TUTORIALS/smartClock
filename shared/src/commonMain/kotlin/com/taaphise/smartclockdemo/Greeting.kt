package com.taaphise.smartclockdemo

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! \n " +
                "Quote of the day: ${MockAPIClass().getDailyQuote()}"
    }
}
