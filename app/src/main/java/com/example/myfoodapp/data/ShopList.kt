package com.example.myfoodapp.data

object ShopList {

    fun getShops(): List<Shop> {
        val shopList: List<Shop> = listOf(

            Shop("id00", "Meat Restaurant", com.example.myfoodapp.R.drawable.meat_restaurant),
            Shop("id01", "Kebab Place", com.example.myfoodapp.R.drawable.kebab_place),
            Shop("id02", "Vegan Restaurant", com.example.myfoodapp.R.drawable.vegan_restaurant),
            Shop("id03", "Candy shop", com.example.myfoodapp.R.drawable.candy_shop),
            Shop("id04", "Fruit Shop", com.example.myfoodapp.R.drawable.fruit_shop),
            Shop("id05", "Doughnut Shop", com.example.myfoodapp.R.drawable.doughnut_shop),
            Shop("id06", "Burger Joint", com.example.myfoodapp.R.drawable.burger_joint),
            Shop("id07", "Potato King", com.example.myfoodapp.R.drawable.potato_king),
            Shop("id08", "Ice Cream King", com.example.myfoodapp.R.drawable.ice_cream_king),
            Shop("id09", "Pizza King", com.example.myfoodapp.R.drawable.pizza_king),
            Shop("id10", "Jimmy's Steakhouse", com.example.myfoodapp.R.drawable.steakhouse),
            Shop("id11", "Noodle Bar", com.example.myfoodapp.R.drawable.noodles_shop),
            Shop("id12", "A taste of Asia", com.example.myfoodapp.R.drawable.asian_restaurant),
            Shop("id13", "Sandwich Joint", com.example.myfoodapp.R.drawable.sandwich_restaurant),
            Shop("id14", "Pie Shop", com.example.myfoodapp.R.drawable.pie_shop),
            Shop("id15", "Hot Dog Stand", com.example.myfoodapp.R.drawable.hot_dog_stand),
            Shop("id16", "Bread Factory", com.example.myfoodapp.R.drawable.bread_factory),
            Shop("id17", "Fish and Chips", com.example.myfoodapp.R.drawable.fish_and_chips_shop)

        )

        return shopList

    }

    fun getShopFromId(id: String): Shop {

        val l = getShops()

        for (i in 0..getShops().size) {
            if (id == l[i].id) {
                return Shop(l[i].id, l[i].name, l[i].icon)
            }

        }
        return Shop(l[0].id, l[0].name, l[0].icon)
    }

}
