package com.example.myfoodapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myfoodapp.screens.MainMenu
import com.example.myfoodapp.screens.OrderList
import com.example.myfoodapp.screens.ShopMenu
import com.example.myfoodapp.screens.ShopSelection

@Composable
fun MenuNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "MainMenu") {
        composable("MainMenu") { MainMenu(navController) }
        composable("ShopSelection") { ShopSelection(navController) }
        composable("ShopMenu/{shop}",
            arguments = listOf(navArgument("shop") { type = NavType.StringType })) {
                backStackEntry ->
            ShopMenu(navController, backStackEntry.arguments?.getString("shop"))
        }
        composable("OrderList") { OrderList(navController) }

    }

}
