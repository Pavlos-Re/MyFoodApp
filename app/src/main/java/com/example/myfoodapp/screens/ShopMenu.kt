package com.example.myfoodapp.screens

import android.R
import android.app.AlertDialog
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myfoodapp.data.Menu
import com.example.myfoodapp.data.MenuList
import com.example.myfoodapp.data.ShopList
import com.example.myfoodapp.data.TotalOrderList

private var mMenuList: List<Menu>? = null

@Composable
fun ShopMenu(navController: NavHostController, shopId: String?) {

    mMenuList = MenuList.getMenu(shopId!!)
    val context = LocalContext.current

    Surface(color = Color(0xff578aa5), modifier = Modifier.fillMaxSize()) {
            Box {

                val current_shop = ShopList.getShopFromId(shopId)

                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.align(
                    Alignment.TopCenter
                )) {
                    Image(
                        painter = painterResource(id = current_shop.icon),
                        contentDescription = "Icon",
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(current_shop.name)
                }

                LazyColumn(modifier = Modifier
                    .align(Alignment.Center)
                    .padding(10.dp)
                    .border(5.dp, Color.Black)
                    .background(Color(0xFFD9C5AD))
                    .padding(5.dp)) {
                    items(mMenuList!!.size) { item ->
                        MenuItemRow(
                            mMenuList!![item], true
                        )
                    }
                }

                Text(text = "End Order", modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(50.dp)
                    .border(3.dp, Color.Black)
                    .background(
                        Color(0xFFD9C5AD)
                    )
                    .padding(2.dp)
                    .clickable {

                        AlertDialog
                            .Builder(context)
                            .setTitle("Finish Order")
                            .setMessage("Proceed back?")
                            .setPositiveButton(
                                R.string.yes
                            ) { dialog, which ->
                                navController.navigate("ShopSelection")
                            }
                            .setNegativeButton(R.string.no, null)
                            .setIcon(R.drawable.star_on)
                            .show()

                    })

            }
        }
    }

@Composable
fun MenuItemRow(menu: Menu, b: Boolean) {

    val context = LocalContext.current

    Row(horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color.Black)
            .clickable(enabled = b) {
                Toast
                    .makeText(context, "${menu.Name} added!", Toast.LENGTH_SHORT)
                    .show()
                TotalOrderList.addToList(menu)
            }) {
        Text(menu.Name, modifier = Modifier.padding(start = 10.dp))
        Text(menu.Price.toString(),modifier = Modifier.padding(end = 20.dp))

    }
}


