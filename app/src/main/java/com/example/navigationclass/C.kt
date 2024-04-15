package com.example.navigationclass

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

@Composable
fun C(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)
        .clickable {
            navController.popBackStack()
        }) {
        Text(text = "Third Screen")
    }
}