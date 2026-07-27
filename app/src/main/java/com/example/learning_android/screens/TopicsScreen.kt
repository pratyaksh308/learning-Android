package com.example.learning_android.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learning_android.ui.theme.LearningAndroidTheme

@Composable
fun TopicsScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Topics Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun TopicsScreenPreview() {
    LearningAndroidTheme {
        TopicsScreen()
    }
}