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
fun A(it: NavBackStackEntry, navController: NavHostController) {

    val text =it.savedStateHandle.get<String>("text1")
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
            .clickable {
                val userId = "12345"
                navController.navigate("${Screen.B.routsc}/$userId")
            }) {
            Text(text = "first screen ${text.orEmpty()}")
        }
}