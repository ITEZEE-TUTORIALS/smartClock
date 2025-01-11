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