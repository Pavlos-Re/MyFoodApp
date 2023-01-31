package com.example.myfoodapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                .padding(top = 20.dp)
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
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.clickable { navController.navigate("ShopSelection") }
    ) {
        Text(option, style = MaterialTheme.typography.body1)
        Icon(
            imageVector = option_icon,
            contentDescription = option,
            modifier = Modifier
                .size(50.dp)
                .padding(10.dp)
        )
    }
}
