package com.example.navigationclass

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun navgraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.A.routsc) {
        composable(Screen.A.routsc) {
            A(it, navController)
        }
        composable("${Screen.B.routsc}/{userId}",
            arguments = listOf(navArgument("userId") {
            type= NavType.StringType
            })
        ) {
            B(it, navController)
        }
        composable(Screen.C.routsc) {
            C(navController)
        }
    }

}



