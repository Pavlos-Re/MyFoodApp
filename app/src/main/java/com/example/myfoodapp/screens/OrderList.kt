package com.example.myfoodapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myfoodapp.R
import com.example.myfoodapp.data.MenuList
import com.example.myfoodapp.data.TotalOrderList
import kotlin.math.absoluteValue

@Composable
fun OrderList(navController: NavHostController) {

    val mItem = TotalOrderList.getFromList()

    Surface() {

        Box(Modifier.background(color = Color(0xff578aa5)).fillMaxSize()) {

            Text(
                "Your order: ",
                modifier = Modifier.padding(top = 50.dp).background(Color(0xFFD9C5AD))
                    .border(5.dp, Color.Black).align(Alignment.TopCenter).padding(5.dp)
            )

            val listState = rememberLazyListState()

            if (!mItem.isEmpty()) {

                Box(
                    modifier = Modifier.align(Alignment.Center)
                        .padding(top = 100.dp, bottom = 200.dp)
                ) {
                    LazyColumn(
                        state = listState,
                        modifier = Modifier
                            .padding(10.dp)
                            .border(5.dp, Color.Black)
                            .background(Color(0xFFD9C5AD))
                            .padding(5.dp)
                    ) {
                        items(mItem.size) { item ->
                            MenuItemRow(
                                mItem[item], false
                            )

                        }
                    }
                }
            }
            else {
                Text(
                    "Empty Order List!",
                    modifier = Modifier.padding(top = 50.dp).background(Color(0xFFD9C5AD))
                        .border(5.dp, Color.Black).align(Alignment.Center).padding(5.dp)
                )
            }

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        "Total: ${TotalOrderList.getTotalPrice(mItem)}", modifier = Modifier
                            .padding(bottom = 10.dp)
                            .border(3.dp, Color.Black)
                            .background(
                                Color(0xFFD9C5AD)
                            )
                            .padding(5.dp)
                    )
                    Text(
                        "Make the Order!", modifier = Modifier
                            .padding(bottom = 100.dp)
                            .border(3.dp, Color.Black)
                            .background(
                                Color(0xFFD9C5AD)
                            )
                            .padding(5.dp)

                    )
                }
            }
        }
    }
