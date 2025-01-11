package com.taaphise.smartclockdemo

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject

class MockAPIClass {

    val quotes = listOf(
        Json.parseToJsonElement("""{"quote": "The journey of a thousand miles begins with a single step.", "author": "Lao Tzu"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Believe you can and you're halfway there.", "author": "Theodore Roosevelt"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The only way to do great work is to love what you do.", "author": "Steve Jobs"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The mind is everything. What you think you become.", "author": "Buddha"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The best way to predict the future is to create it.", "author": "Peter Drucker and Abraham Lincoln"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Success is not final, failure is not fatal: it is the courage to continue that counts.", "author": "Winston Churchill"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The only person you are destined to become is the person you decide to be.", "author": "Ralph Waldo Emerson"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Life is what happens when you're busy making other plans.", "author": "John Lennon"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The difference between ordinary and extraordinary is that little extra.", "author": "Jimmy Johnson"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.", "author": "Helen Keller"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Keep your face always toward the sunshine - and shadows will fall behind you.", "author": "Walt Whitman"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Happiness is not something ready made. It comes from your own actions.", "author": "Dalai Lama"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The future belongs to those who believe in the beauty of their dreams.", "author": "Eleanor Roosevelt"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "It is during our darkest moments that we must focus to see the light.", "author": "Aristotle"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Do not go where the path may lead, go instead where there is no path and leave a trail.", "author": "Ralph Waldo Emerson"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The greatest glory in living lies not in never falling, but in rising every time we fall.", "author": "Nelson Mandela"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Your time is limited, so don't waste it living someone else's life.", "author": "Steve Jobs"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Many of life's failures are people who did not realize how close they were to success when they gave up.", "author": "Thomas A. Edison"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "If life were predictable it would cease to be life, and be without flavor.", "author": "Eleanor Roosevelt"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The purpose of our lives is to be happy.", "author": "Dalai Lama"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Life is really simple, but we insist on making it complicated.", "author": "Confucius"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "In three words I can sum up everything I've learned about life: it goes on.", "author": "Robert Frost"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Love the life you live. Live the life you love.", "author": "Bob Marley"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Life is either a daring adventure or nothing at all.", "author": "Helen Keller"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.", "author": "Dr. Seuss"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Life is a flower of which love is the honey.", "author": "Victor Hugo"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Only a life lived for others is a life worthwhile.", "author": "Albert Einstein"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "The greatest wealth is health.", "author": "Virgil"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Go confidently in the direction of your dreams! Live the life you've imagined.", "author": "Henry David Thoreau"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "When you reach the end of your rope, tie a knot in it and hang on.", "author": "Franklin D. Roosevelt"}""") as JsonObject,
        Json.parseToJsonElement("""{"quote": "Always remember that you are absolutely unique. Just like everyone else.", "author": "Margaret Mead"}""") as JsonObject
    )

    fun getDailyQuote(): String {
        return quotes.random().get("quote").toString()
    }
}
