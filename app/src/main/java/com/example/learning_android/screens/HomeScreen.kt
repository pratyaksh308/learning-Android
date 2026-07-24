package com.example.learning_android.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning_android.ui.theme.LearningAndroidTheme

@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$name Learning",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            color = Color.Red,
            modifier = Modifier.shadow(elevation = 8.dp,shape = RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(150.dp))

        Text(
            text = "Welcome Pratyaksh",
            fontWeight = FontWeight.Medium,
            fontSize = 34.sp,
            color = Color(0xFFFFFDD0)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(color = Color.Cyan)
                ) {
                    append("Learn")
                }
                append(" • ")
                withStyle(
                    style = SpanStyle(color = Color.Yellow)
                ){
                    append ("Build")
                }
                append(" • ")
                withStyle(
                    style = SpanStyle(color = Color.Green)
                ) {
                    append("Repeat")
                }
            },
            fontSize = 23.sp
        )

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 32.dp),
            thickness = 1.dp,
            color = Color.Gray,
        )

        Spacer(modifier = Modifier.height(300.dp))

        Button(
            onClick = { Toast.makeText(context, "Starting...", Toast.LENGTH_LONG).show()},
            modifier = Modifier.padding(16.dp),
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Gray
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
        ) {Text(text = "Start Learning")}
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    LearningAndroidTheme {
        HomeScreen("Android")
    }
}