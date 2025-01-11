# Smart Clock Wake-Up App

<a id="readme-top"></a>

<details>
<summary>Table of Contents</summary>
<ol>
<li><a href="#about-the-project">About the Project</a></li>
<ul>
<li><a href="#applications">Applications</a></li>
<li><a href="#platforms">Platforms</a></li>
<li><a href="#multiplatform">Multiplatform</a></li>
<li><a href="#jetpack-compose-multiplatform">Jetpack Compose Multiplatform</a></li>
<li><a href="#kotlin-multiplatform">Kotlin Multiplatform</a></li>
<li><a href="#building-the-smart-clock-app">Building the Smart Clock App</a></li>
</ul>
</ol>
</details>

---

# About the Project

The **Smart Clock** app uses technologies that allow it to work on multiple platforms. This project explains how the app works and covers important topics like multiplatform development, Jetpack Compose, and Kotlin Multiplatform.
**Pre-requisite**:
Basic understanding of the kotlin language and jetpack compose
- [Beginner jetpack compose](https://www.youtube.com/watch?v=6_wK_Ud8--0)
- [Beginner kotlin tutorial](https://www.youtube.com/watch?v=8uEYI6lTGps)
- [Android Studio Installed](https://developer.android.com/studio?gad_source=1&gclid=CjwKCAiAp4O8BhAkEiwAqv2UqFhQmyOgJpz78P8ROyBtmA8rButo2PZDvcVuu9EJ66ST3Tb45OVmoRoCr-8QAvD_BwE&gclsrc=aw.ds)
  - In Android Studio: Make sure to disable K2 mode [Steps](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-setup.html#check-your-environment)
  - Install the kotlin multiplatform Plugin
- [Xcode](https://developer.apple.com/documentation/safari-developer-tools/installing-xcode-and-simulators)


## Applications

### What is an App?
An "app" is a program made to do specific tasks on devices like phones, tablets, or computers.

### When was the Term "App" First Used?
The term became popular when smartphones started becoming common, especially after the launch of Apple’s App Store in 2008.

### Why are Apps Needed?
Apps help users complete tasks easily, make life more convenient, and provide ways to communicate, work, and have fun.

### How do Apps Work?
Apps use a combination of hardware and software. They connect to your device’s systems using APIs, which are like tools that help them work smoothly with your phone or computer.

### Example: Weather App
A weather app gets live weather data from a server and shows it on your screen in an easy-to-read format.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Platforms

### What is a Platform in App Development?
A platform is the environment where apps run, like Android, iOS, or the Web.

### When was the Term "Platform" First Used in Development?
The term became widely used in the 1980s with the rise of operating systems like Windows and macOS.

### Why are Platforms Needed?
Platforms make sure that apps can run properly by providing the tools and rules needed for development.

### How do Platforms Work?
Platforms give developers tools, libraries, and frameworks to create apps that work well on their system.

### Example: Mobile Platforms
- **iOS**: Famous for its security and smooth integration with Apple devices.
- **Android**: Offers flexibility and works on many types of devices.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Multiplatform

### What is a Multiplatform App?
A multiplatform app is designed to work on more than one operating system using a single codebase.

### When was the Term "Multiplatform App" First Used?
The idea became common in the 1990s with tools for building apps that work on different systems.

### Why are Multiplatform Apps Needed?
They save time and money while making apps available to more people.

### How do Multiplatform Apps Work?
Frameworks like Flutter or Kotlin Multiplatform let developers write one set of code, which is then adjusted to work on different platforms.

### Pros of Multiplatform Apps
- Saves development time
- Costs less than separate apps
- Allows sharing of logic

### Cons of Multiplatform Apps
- May run slower than native apps
- Limited access to some platform-specific features

### When to Use Multiplatform Apps
- **Good for**: Apps with simple designs or heavy reliance on backend services.
- **Not ideal for**: Games or apps needing advanced hardware access.

### Example Frameworks
- **Kotlin Multiplatform**: Reuses code for Android, iOS, and more.
- **Flutter**: Creates beautiful UIs with one codebase.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Jetpack Compose Multiplatform

### What is Jetpack Compose?
Jetpack Compose is a tool for building user interfaces (UI) in a simple, modern way. It’s commonly used for Android apps but can also work on other platforms.

### When was Compose First Introduced?
Google announced Jetpack Compose in 2019.

### Why Was Compose Created?
It makes creating UIs easier and faster by using a new approach called declarative programming.

### Benefits of Using Compose
- **Simple syntax**: Easy to write and understand.
- **Manages state easily**: Keeps track of changes in data.
- **Reusable components**: Saves time and effort.

### Challenges of Using Compose
- **Learning curve**: Takes time to get used to.
- **Ecosystem growth**: Some features are still developing for multiplatform use.

### How Does Compose Work?
Compose reacts to changes in data and updates the UI automatically.

### Example: Basic Compose UI
```kotlin
@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Kotlin Multiplatform

### What is Kotlin Multiplatform (KMP)?
KMP allows developers to write shared code once and use it on many platforms. [KMP Documentation](https://kotlinlang.org/docs/multiplatform.html)

### When Was KMP First Introduced?
JetBrains introduced KMP in 2017.

### Why Was KMP Created?
It helps developers avoid writing the same code for different platforms while keeping good performance.

### Benefits of KMP
- Code can be reused
- Supports platform-specific features
- Delivers native performance

### Challenges of KMP
- Can be harder to learn
- Smaller community compared to some tools

### How Does KMP Work?
KMP uses tools to create versions of your code for different platforms like Android, iOS, or the Web.

#### Platforms Supported
- **Android**: Uses JVM
- **iOS**: Builds native code
- **Web**: Uses JavaScript
- **Desktop**: Works with JVM or native code

### Comparing KMP and Flutter
| Feature              | KMP                            | Flutter                         |
|----------------------|--------------------------------|---------------------------------|
| Language             | Kotlin                        | Dart                            |
| Performance          | Native                        | Near-native                    |
| Ecosystem            | Growing                      | Established                    |
| UI Framework         | Jetpack Compose Multiplatform | Flutter’s own UI Framework     |

### Example: Shared Logic
```kotlin
expect fun getPlatformName(): String

actual fun getPlatformName(): String {
    return "Android"
}
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Building the Smart Clock App

There are two ways to build multiplatform apps [KMP Documentation](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html?_gl=1*1bjnwo9*_gcl_au*MTM0MTYxMzMyNS4xNzM2NTY1MzUw*_ga*MjA3ODgzMTExOS4xNzM2NTY1MzQ3*_ga_9J976DJZ68*MTczNjU2OTIzNS4yLjEuMTczNjU2OTI0Ni40OS4wLjA.)
1. [Shared logic with native UI](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-create-first-app.html)
2. [Shared logic with shared UI](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html)


### Step 1: Set Up the Environment
1. Install Android Studio or IntelliJ IDEA.
2. - Add Kotlin Multiplatform to your project setup. 
3. Use the jetbrains [Kotlin multiplatform wizard ](https://kmp.jetbrains.com) to create a new project
4. Choose the platforms you want to target (e.g., Android, iOS, Web).
5. Do not choose the "Compose Multiplatform" option for now, we will be using jetpack compose for android and ios
6. Download the project and open it in Android Studio or IntelliJ IDEA.
7. Make sure to disable K2 mode [Steps](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-setup.html#check-your-environment)
8. Install the kotlin multiplatform Plugin
9. Install Xcode for iOS development.
10. Navigate to the `shared` module in your project.
11. Open the `build.gradle.kts` file and add the following dependencies:
```kotlin 
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
````
12. Sync your project to download the dependencies.
13. switch to project Files view and navigate to the `shared/src/commonMain/kotlin/` directory.
13. Create a 'MockAPIClass' Kotlin file in the `shared/src/commonMain/projectdirectory/` module for your shared code.
14. Add the following code to the 'MockAPIClass' file:
```kotlin

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
```
15. Navigate to the `composeApp/src/kotlin/projectDirectory/` module for Android-specific code.
16. Create a file named App2.kt and add the following code:
```kotlin
package com.taaphise.smartclockdemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun SmartClockUI() {
    var showContent by remember { mutableStateOf(false) }

    // Date format for the clock
    val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    val currentTime = remember { mutableStateOf(dateFormat.format(Date())) }

    LaunchedEffect(true) {
        // Update the time every second
        while (true) {
            kotlinx.coroutines.delay(1000)
            currentTime.value = dateFormat.format(Date())
        }
    }

    // Use Material3 Theme
    MaterialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            color = Color.Black
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Digital clock display with futuristic style
                Text(
                    text = currentTime.value,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 64.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Futuristic button with Material3 style
                Button(
                    onClick = { showContent = !showContent },
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(Color(0xFF1D1D1D))
                ) {
                    Text(
                        text = if (showContent) "Hide" else "Show Content",
                        color = Color.White,
                        style = TextStyle(fontSize = 16.sp)
                    )
                }

                AnimatedVisibility(visible = showContent) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Image for the futuristic look (adjust as needed)
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = null
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Greeting or additional content
                        Text(
                            text = Greeting().greet(),
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            modifier = Modifier.padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewSmartClockUI() {
    SmartClockUI()
}
```
17. open the `MainActivity.kt` file in the `composeApp/src/kotlin/projectDirectory/` and modify the code to include the following:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //App()
            SmartClockUI()
        }
    }
}
```
18. Navigate to the `iosApp/iosApp/' and open the ContentView.swift file and add the following code:
```swift
import SwiftUI
import Shared

struct ContentView: View {

    var body: some View {
            //BasicView()
            SmartClockView()
        }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct BasicView: View {
    @State private var showContent: Bool = false

    var body: some View {
        VStack {
            Button("Click me!") {
                withAnimation {
                    showContent.toggle()
                }
            }

            if showContent {
                VStack(spacing: 16) {
                    Image(systemName: "swift")
                        .font(.system(size: 200))
                        .foregroundColor(.accentColor)
                    Text("SwiftUI: \(Greeting().greet())")
                }
                .transition(.move(edge: .top).combined(with: .opacity))
            }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .padding()
    }
}

struct SmartClockView: View {
    @State private var currentTime: String = getCurrentTime()
    @State private var showContent: Bool = false
    private var quote = Greeting().greet()

    var body: some View {
        ZStack {
            Color.black.ignoresSafeArea()

            VStack(spacing: 16) {
                // Digital clock display
                Text(currentTime)
                    .font(.system(size: 64, weight: .bold, design: .monospaced))
                    .foregroundColor(.white)

                // Futuristic button
                Button(action: {
                    showContent.toggle()
                }) {
                    Text(showContent ? "Hide" : "Show Content")
                        .font(.system(size: 16))
                        .foregroundColor(.white)
                        .padding()
                        .background(Circle().fill(Color.gray))
                }

                if showContent {
                    VStack(spacing: 8) {
                        // Futuristic image placeholder
                        Image(systemName: "clock.fill")
                            .resizable()
                            .scaledToFit()
                            .frame(width: 100, height: 100)
                            .foregroundColor(.white)

                        // Additional content or greeting
                        Text(quote)
                            .font(.system(size: 24, weight: .medium))
                            .foregroundColor(.white)
                            .multilineTextAlignment(.center)
                            .padding()
                    }
                    .transition(.opacity)
                }
            }
        }
        .onAppear {
            startClock()
        }
    }

    // Clock update logic
    private func startClock() {
        Timer.scheduledTimer(withTimeInterval: 1.0, repeats: true) { _ in
            currentTime = SmartClockView.getCurrentTime()
        }
    }

    private static func getCurrentTime() -> String {
        let formatter = DateFormatter()
        formatter.dateFormat = "HH:mm:ss"
        return formatter.string(from: Date())
    }
}
```
19. Run the app on Android and iOS simulators or devices to see the Smart Clock in action.

### Questions and Answers

### What's next?
integrate more features like alarms, weather updates, and user settings to make the app more useful.
integrate AI to provide personalized wake-up suggestions based on user habits and preferences.

### Step 3: What we learned
- Understand the basics of multiplatform development.
- Learn how to set up a Kotlin Multiplatform project.
- Explore how to share code between platforms.
- Gain experience in using Jetpack Compose for UI development.
- Learn how to structure a project for multiplatform development.
- Understand the importance of shared logic and platform-specific implementations.
- Learn how to use shared libraries and dependencies.
- Gain insights into the challenges and benefits of multiplatform development.
- Learn how to handle platform-specific features and APIs.
- Understand how to manage project dependencies and configurations.
- Learn how to use version control effectively in a multiplatform project.

### Step 4: Testing and Deployment
- Test on Android and iOS simulators or devices.
- Use tools like GitHub Actions to automate testing and deployment.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
