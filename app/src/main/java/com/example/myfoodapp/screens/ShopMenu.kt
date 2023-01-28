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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myfoodapp.data.Menu
import com.example.myfoodapp.data.MenuList
import com.example.myfoodapp.data.ShopList

private var mMenuList: List<Menu>? = null

@Composable
fun ShopMenu(navController: NavHostController, shopId: String?) {

    mMenuList = MenuList.getMenu(shopId!!)
    val context = LocalContext.current

    Surface(modifier = Modifier.fillMaxSize()) {
            Box {

                Image(
                    painter = painterResource(id = com.example.myfoodapp.R.drawable.menu),
                    contentDescription = "Menu",
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                )

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
                            mMenuList!!.get(item).Name,
                            mMenuList!!.get(item).Price,
                            mMenuList!!.get(item).Icon
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
                            .setMessage("Proceed to Shop Selection?")
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
fun MenuItemRow(name: String, price: Double, icon : Int) {

    val context = LocalContext.current

    Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier
               .fillMaxSize()
               .border(2.dp, Color.Black)
               .clickable {
                   Toast
                       .makeText(context, "${name} added!", Toast.LENGTH_SHORT)
                       .show();
               }) {
           Text(name)
           Text(price.toString())
           Image(painter = painterResource(id = icon), contentDescription = "Item Icon", modifier = Modifier.size(30.dp))
       }

}
