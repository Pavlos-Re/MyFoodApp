package com.example.myfoodapp.data

object ShopList {

    fun getShops(): List<Shop> {
        val shopList : List<Shop> = listOf(

            Shop("Meat Restaurant", com.example.myfoodapp.R.drawable.meat_restaurant),
            Shop("Kebab Place", com.example.myfoodapp.R.drawable.kebab_place),
            Shop("Vegan Restaurant", com.example.myfoodapp.R.drawable.vegan_restaurant),
            Shop("Candy shop", com.example.myfoodapp.R.drawable.candy_shop),
            Shop("Fruit Shop", com.example.myfoodapp.R.drawable.fruit_shop),
            Shop("Doughnut Shop", com.example.myfoodapp.R.drawable.doughnut_shop),
            Shop("Burger Joint", com.example.myfoodapp.R.drawable.burger_joint),
            Shop("Potato King", com.example.myfoodapp.R.drawable.potato_king),
            Shop("Ice Cream King" , com.example.myfoodapp.R.drawable.ice_cream_king),
            Shop("Pizza King", com.example.myfoodapp.R.drawable.pizza_king),
            Shop("Jimmy's Steakhouse", com.example.myfoodapp.R.drawable.steakhouse),
            Shop("Noodle Bar", com.example.myfoodapp.R.drawable.noodles_shop),
            Shop("A taste of Asia", com.example.myfoodapp.R.drawable.asian_restaurant),
            Shop("Sandwich Joint", com.example.myfoodapp.R.drawable.sandwich_restaurant),
            Shop("Pie Shop", com.example.myfoodapp.R.drawable.pie_shop),
            Shop("Hot Dog Stand", com.example.myfoodapp.R.drawable.hot_dog_stand),
            Shop("Bread Factory", com.example.myfoodapp.R.drawable.bread_factory),
            Shop("Fish and Chips", com.example.myfoodapp.R.drawable.fish_and_chips_shop)

        )

        return shopList

    }
}
