package com.example.instadev.view.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instadev.view.auth.login.LoginScreen
import com.example.instadev.view.auth.registerbyemail.RegisterEmailScreen
import com.example.instadev.view.auth.registerbyphone.RegisterByPhoneScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen(
                navigateToRegisterByPhone = {
                    navController.navigate(RegisterByPhone)
                }
            )
        }

        composable<RegisterByPhone> {
            RegisterByPhoneScreen(
                navigateToRegisterByEmail = {
                    navController.navigate(RegisterByEmail)
                },
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }

        composable<RegisterByEmail> {
            RegisterEmailScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }


    }
}