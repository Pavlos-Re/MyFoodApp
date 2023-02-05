package com.example.myfoodapp.screens

import android.graphics.drawable.GradientDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainMenu(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = com.example.myfoodapp.R.drawable.menu), contentDescription = "Menu Icon", contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxSize()
            )

            Text("Welcome and Bon Appetite!", style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 70.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xfffaae36),
                                Color(0xfffade36),
                                Color(0xfffaa636)
                            )
                        )
                    )
                    .padding(5.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.Center)
            ) {

                MenuOption("Main Menu", Icons.Default.Home, navController)

                MenuOption("Settings", Icons.Default.Settings, navController)

            }

        }
    }
}

@Composable
private fun MenuOption(option: String, option_icon: ImageVector, navController: NavHostController) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        ExtendedFloatingActionButton(
            onClick = { navController.navigate("ShopSelection") },
            icon = {
                Icon(
                    option_icon,
                    contentDescription = "Icon Description"
                )
            },
            text = { Text(option) },
            elevation = FloatingActionButtonDefaults.elevation(15.dp),
            modifier = Modifier.padding(10.dp),
            backgroundColor = Color(0xfffaae36)
        )
    }
}
