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
- Or Use the jetbrains [Kotlin multiplatform wizard ](https://kmp.jetbrains.com)

### Step 2: Create the User Interface (UI)
Use Jetpack Compose to design the app’s interface:
```kotlin
@Composable
fun AlarmScreen() {
    Column {
        Text("Set Alarm")
        Button(onClick = { /* Add alarm logic */ }) {
            Text("Add Alarm")
        }
    }
}
```

### Example: Alarm Logic for Each Platform
```kotlin
expect fun scheduleAlarm(time: Long)

actual fun scheduleAlarm(time: Long) {
    // Platform-specific alarm setup
}
```

### Step 3: Add Core Features
- **Alarm Logic**: Use platform APIs to handle alarms.
- **Notifications**: Show alerts using shared Kotlin code.

### Step 4: Test and Release the App
- Test on Android and iOS simulators or devices.
- Use tools like GitHub Actions to automate testing and deployment.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
