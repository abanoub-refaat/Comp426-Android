package com.example.unscramble

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    var viewModel: HomeViewModel = viewModel()
    val navController = rememberNavController()
    NavHost(navController , startDestination = Routes.Home , builder = {
        composable(Routes.Home) {
            HomeScreen(navController)
        }
        composable(Routes.Shopping) {
            CartScreen(navController)
        }
    })
}