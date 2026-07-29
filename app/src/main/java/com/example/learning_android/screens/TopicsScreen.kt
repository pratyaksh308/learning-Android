package com.example.learning_android.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Book
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning_android.ui.theme.LearningAndroidTheme

@Composable
fun TopicsScreen() {
    val topics = listOf(
        "UI Components",
        "Layouts",
        "Navigation",
        "State Management",
        "Animations",
        "Firebase",
        "Google Maps",
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(topics) { topic ->
            TopicItem(topic = topic)
        }
    }
}

@Composable
fun TopicItem(topic: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = {

        }
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Book,
                contentDescription = "Topic",
            )

            Text(
                text = topic,
                modifier = Modifier
                    .weight(1f)
            )

            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "Open",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicsScreenPreview() {
    LearningAndroidTheme {
        TopicsScreen()
    }
}