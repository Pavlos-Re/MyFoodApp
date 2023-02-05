package com.example.myfoodapp.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myfoodapp.data.Shop
import com.example.myfoodapp.data.ShopList

private var mShopList: List<Shop>? = null

@Composable
fun ShopSelection(navController: NavHostController) {

    mShopList = ShopList.getShops()

    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xff578aa5)) {

        Box {

            TopAppBar(
                title = {Text(text = "Please make you choice") }, modifier = Modifier.align(Alignment.TopCenter),
                actions =
                {
                    Icon(painter = painterResource(id = android.R.drawable.ic_menu_agenda),
                        contentDescription = "Icon", modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { navController.navigate("OrderList") })
                }
            )

            val listState = rememberLazyGridState()

            LazyVerticalGrid(
                state = listState,
                columns = GridCells.Adaptive(minSize = 150.dp),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 60.dp, bottom = 20.dp)
            ) {
                items(mShopList!!.size) { shop  ->
                    ShopInfo(mShopList!!.get(shop), navController)

                }

            }

        }

    }

}

@Composable
fun ShopInfo(shop: Shop, navController: NavHostController) {

    Card(elevation = 10.dp, shape = RoundedCornerShape(20.dp), modifier = Modifier
        .padding(15.dp)
        .clickable {
            navController.navigate("ShopMenu/${shop.id}")
        } ) {
        Box(modifier = Modifier
            .background(Color.Black)) {
            Image(
                painter = painterResource(id = shop.icon),
                contentDescription = shop.name,
                modifier = Modifier.fillMaxSize()
            )
                Text(
                    text = shop.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .background(Color(0xfffaae36))
                        .padding(5.dp)
                )
            }
        }
    }
