package com.example.myfoodapp.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myfoodapp.data.Shop
import com.example.myfoodapp.data.ShopList
import kotlinx.coroutines.currentCoroutineContext

private var mShopList: ArrayList<Shop>? = null

@Composable
fun ShopSelection(navController: NavHostController) {

    mShopList = ShopList.getShops()

     //var i by remember {
    //    mutableStateOf(0)
   //}

    var i = 0

    Surface(modifier = Modifier.fillMaxSize()) {
        Box {
            Image(painter = painterResource(com.example.myfoodapp.R.drawable.menu), contentDescription = "Menu Icon", modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize())
            Text(text = "Please make your selection.", modifier = Modifier.align(Alignment.TopStart))

            val listState = rememberLazyGridState()

            LazyVerticalGrid(
                state = listState,
                columns = GridCells.Adaptive(minSize = 150.dp),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 20.dp)
            ) {
                items(mShopList!!.size) { shop  ->
                    ShopInfo(mShopList!!.get(i).name, mShopList!!.get(i).icon)
                    i++
                }

            }

        }

    }

}

@Composable
fun ShopInfo(name: String, icon: Int) {

    val context = LocalContext.current

    Card(elevation = 10.dp, shape = RoundedCornerShape(20.dp), modifier = Modifier
        .padding(15.dp)
        .clickable {
            Toast
                .makeText(context, "You have selected: " + name, Toast.LENGTH_SHORT)
                .show()
        } ) {
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Black)) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = name,
                modifier = Modifier.fillMaxSize()
            )
                Text(
                    text = name,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(5.dp)
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Black,
                                    Color.Gray,
                                    Color.Transparent
                                )
                            )
                        )
                )
            }
        }
    }
