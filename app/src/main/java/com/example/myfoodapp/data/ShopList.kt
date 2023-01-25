package com.example.myfoodapp.data

object ShopList {

    fun getShops(): ArrayList<Shop> {
        val shopList = ArrayList<Shop>()

        val shop1 = Shop("Meat Restaurant", com.example.myfoodapp.R.drawable.meat_restaurant)

        shopList.add(shop1)

        val shop2 = Shop("Vegan Restaurant", com.example.myfoodapp.R.drawable.vegan_restaurant)

        shopList.add(shop2)

        val shop3 = Shop("Candy shop", com.example.myfoodapp.R.drawable.candy_shop)

        shopList.add(shop3)

        val shop4 = Shop("Fruit Shop", com.example.myfoodapp.R.drawable.fruit_shop)

        shopList.add(shop4)

        val shop5 = Shop("Doughnut Shop", com.example.myfoodapp.R.drawable.doughnut_shop)

        shopList.add(shop5)

        val shop6 = Shop("Burger Joint", com.example.myfoodapp.R.drawable.burger_joint)

        shopList.add(shop6)

        val shop7 = Shop("Potato King", com.example.myfoodapp.R.drawable.potato_king)

        shopList.add(shop7)

        val shop8 = Shop("Ice Cream King" , com.example.myfoodapp.R.drawable.ice_cream_king)

        shopList.add(shop8)

        val shop9 = Shop("Pizza King", com.example.myfoodapp.R.drawable.pizza_king)

        shopList.add(shop9)

        val shop10 = Shop("Jimmy's Steakhouse", com.example.myfoodapp.R.drawable.steakhouse)

        shopList.add(shop10)

        val shop11 = Shop("Noodle Bar", com.example.myfoodapp.R.drawable.noodles_shop)

        shopList.add(shop11)

        val shop12 = Shop("A taste of Asia", com.example.myfoodapp.R.drawable.asian_restaurant)

        shopList.add(shop12)

        val shop13 = Shop("Sandwich Joint", com.example.myfoodapp.R.drawable.sandwich_restaurant)

        shopList.add(shop13)

        val shop14 = Shop("Pie Shop", com.example.myfoodapp.R.drawable.pie_shop)

        shopList.add(shop14)

        return shopList
    }




}
