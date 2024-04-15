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
fun B(it: NavBackStackEntry, navController: NavHostController) {
    navController.previousBackStackEntry?.savedStateHandle?.set(
        "text1",
        "This text from Screen B"
    )
    var aScreenValue =it.arguments?.getString("userId")
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)
        .clickable {
            navController.navigate(Screen.C.routsc)
        }) {
        Text(text = "Scond Screen $aScreenValue")
    }
}