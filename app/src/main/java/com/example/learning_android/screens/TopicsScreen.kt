package com.example.learning_android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning_android.R
import com.example.learning_android.model.Topic
import com.example.learning_android.ui.theme.LearningAndroidTheme

@Composable
fun TopicsScreen() {
    val topics = listOf(
        Topic("UI Components", image = R.drawable.ic_widgets),
        Topic("Layouts", image = R.drawable.ic_widgets),
        Topic("Navigation", image = R.drawable.ic_widgets),
        Topic("State Management", image = R.drawable.ic_widgets),
        Topic("Animations", image = R.drawable.ic_widgets),
        Topic("Firebase", image = R.drawable.ic_widgets),
        Topic("Google Maps", image = R.drawable.ic_widgets),
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
fun TopicItem(topic: Topic) {
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
            Image(
                painter = painterResource(topic.image),
                contentDescription = "Topic",
            )

            Spacer(
                modifier = Modifier.width(5.dp)
            )

            Text(
                text = topic.title,
                modifier = Modifier.weight(1f)
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