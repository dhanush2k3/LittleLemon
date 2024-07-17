package com.example.little_lemon.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Onboarding.route,
        modifier = Modifier
    ) {
        composable(Onboarding.route) { Onboarding(navController) }
        composable(Home.route) { Home(navController) }
        composable(Profile.route) { Profile(navController) }
    }
}