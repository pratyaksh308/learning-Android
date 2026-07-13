package com.example.learning_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learning_android.ui.theme.LearningAndroidTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearningScreen(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearningScreen(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "$name Learning")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Welcome Pratyaksh")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Learn • Build • Repeat")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "-------------------------------------------")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Start Learning")
    }
}

@Preview(showBackground = true)
@Composable
fun LearningScreenPreview() {
    LearningAndroidTheme {
        LearningScreen("Android")
    }
}