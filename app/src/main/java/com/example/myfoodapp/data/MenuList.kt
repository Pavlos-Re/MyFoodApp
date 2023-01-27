package com.example.myfoodapp.data

object MenuList{
    fun getMenu(id: String): List<Menu> {

        var menuList: List<Menu> = listOf()
        if (id == "id00") {
            menuList = listOf(

                Menu("Lamb Steak", 7.0,com.example.myfoodapp.R.drawable.lamb_steak),
                Menu("Chicken Steak", 5.0, com.example.myfoodapp.R.drawable.chicken_steak),
                Menu("Beef Steak", 6.0, com.example.myfoodapp.R.drawable.beef_steak),
                Menu("Meat Plate", 15.0, com.example.myfoodapp.R.drawable.meat_plate),
                Menu("Potatoes", 3.0, com.example.myfoodapp.R.drawable.potatoes),
                Menu("Soda Drink", 2.0, com.example.myfoodapp.R.drawable.soda),

            )
        }
        if (id == "id01") {
            menuList = listOf(
                Menu("Something", 1.1, com.example.myfoodapp.R.drawable.soda)
            )
        }

        return menuList

    }
}
