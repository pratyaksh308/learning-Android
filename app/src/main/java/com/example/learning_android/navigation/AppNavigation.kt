package com.example.learning_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learning_android.screens.HomeScreen
import com.example.learning_android.screens.TopicsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onStartLearningClick = {
                    navController.navigate("topics")
                }
            )
        }

        composable("topics") {
            TopicsScreen()
        }
    }
}