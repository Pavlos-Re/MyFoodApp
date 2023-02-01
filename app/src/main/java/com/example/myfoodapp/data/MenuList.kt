package com.example.myfoodapp.data

object MenuList{
    fun getMenu(id: String): List<Menu> {

        var menuList: List<Menu> = listOf()
        if (id == "id00") {
            menuList = listOf(

                Menu("Lamb Steak", 7.0),
                Menu("Chicken Steak", 5.0),
                Menu("Beef Steak", 6.0),
                Menu("Meat Plate", 15.0),
                Menu("Potatoes", 3.0),
                Menu("Soda Drink", 2.0)

            )
        }
        if (id == "id01") {
            menuList = listOf(
                Menu("Lamb Kebab", 3.5),
                Menu("Chicken Kebab", 3.0),
                Menu("Beef Kebab", 3.0),
                Menu("Mixed Kebab", 4.0),
                Menu("Fry Potatoes", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id02") {
            menuList = listOf(
                Menu("Green Salad", 4.5),
                Menu("Tofu Kebab", 3.0),
                Menu("Veggie Meatballs", 4.5),
                Menu("Fruit Plate", 6.0),
                Menu("Baked Potatoes", 4.0),
                Menu("Natural Juice Drink", 2.5)
            )
        }

        if (id == "id03") {
            menuList = listOf(
                Menu("Jelly Beans (100g)", 1.0),
                Menu("Jelly Worms (100g)", 1.0),
                Menu("Sweet Fruits (100g)", 1.0),
                Menu("Sour Fruits (100g)", 1.0),
                Menu("Sour Cola (100g)", 1.0),
                Menu("Fizzy Drink", 1.0)
            )
        }

        if (id == "id04") {
            menuList = listOf(
                Menu("Season Mix Fruits", 4.0),
                Menu("Orange Fruits", 3.0),
                Menu("Berries", 3.0),
                Menu("Red Fruits", 3.0),
                Menu("Sweet Fruits", 3.0),
                Menu("Sour Fruits", 3.0)
            )
        }

        if (id == "id05") {
            menuList = listOf(
                Menu("Chocolate Doughnut", 1.5),
                Menu("Vanilla Doughnut", 1.5),
                Menu("Jam Doughnut", 1.5),
                Menu("Mixed Doughnut", 2.0),
                Menu("Espresso", 2.0),
                Menu("Cappuccino", 2.0)
            )
        }

        if (id == "id06") {
            menuList = listOf(
                Menu("Chicken Burger", 4.5),
                Menu("Beef Burger", 5.0),
                Menu("Bacon Cheese Burger", 7.0),
                Menu("Veggie Burger", 4.0),
                Menu("Fry Potatoes", 3.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id07") {
            menuList = listOf(
                Menu("Cheddar Bacon Topping", 3.5),
                Menu("Sweet Chilli Sauce", 3.0),
                Menu("Barbecue Sauce", 3.0),
                Menu("Sour Cream Sauce", 3.0),
                Menu("Classic Style", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id08") {
            menuList = listOf(
                Menu("Vanilla Flavour", 1.5),
                Menu("Chocolate Flavour", 1.5),
                Menu("Strawberry Flavour", 1.5),
                Menu("Triple Classic Flavour", 2.0),
                Menu("Fruit Flavour", 1.5),
                Menu("Popsicle", 1.0)
            )
        }

        if (id == "id09") {
            menuList = listOf(
                Menu("Pepperoni Pizza", 7.5),
                Menu("Classic Pizza", 6.0),
                Menu("Greek Pizza", 8.0),
                Menu("Mozzarella Pizza", 7.5),
                Menu("Chicken Pizza", 8.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id10") {
            menuList = listOf(
                Menu("Veal Steak", 6.5),
                Menu("Chicken Steak", 6.0),
                Menu("Beef Steak", 6.0),
                Menu("Pork Chops", 7.0),
                Menu("Fry Potatoes", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id11") {
            menuList = listOf(
                Menu("Chicken Noodles", 4.5),
                Menu("Pork Noodles", 3.0),
                Menu("Beef Noodles", 3.0),
                Menu("Veggies Noodles", 4.0),
                Menu("Shrimp Noodles", 2.0),
                Menu("Tea", 1.0)
            )
        }

        if (id == "id12") {
            menuList = listOf(
                Menu("Sushi", 3.5),
                Menu("Bao Buns", 3.0),
                Menu("Noodles", 3.0),
                Menu("Sashimi", 4.0),
                Menu("Veggie Spring Rolls", 2.0),
                Menu("Tea", 1.0)
            )
        }

        if (id == "id13") {
            menuList = listOf(
                Menu("Chicken Sandwich", 4.5),
                Menu("Egg Sandwich", 3.0),
                Menu("Beef Sandwich", 4.0),
                Menu("Mixed Sandwich", 5.0),
                Menu("Veggies Sandwich", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id14") {
            menuList = listOf(
                Menu("Vanilla Pie", 4.5),
                Menu("Chocolate Pie", 3.0),
                Menu("Cream Pie", 3.0),
                Menu("Jam Pie", 4.0),
                Menu("Vegan Pie", 2.0),
                Menu("Chocolate Milk", 1.0)
            )
        }

        if (id == "id15") {
            menuList = listOf(
                Menu("Classic Hot Dog", 1.5),
                Menu("Chicken Hot Dog", 2.0),
                Menu("Special Hot Dog", 3.0),
                Menu("Vegan Hot Dog", 4.0),
                Menu("Fry Potatoes", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        if (id == "id16") {
            menuList = listOf(
                Menu("Bread Loaf", 0.5),
                Menu("Cookies", 3.0),
                Menu("Cake", 7.0),
                Menu("Chocolate Cake", 8.0),
                Menu("Butter Milk Cookies", 3.0),
                Menu("Milk Cake", 8.0)
            )
        }

        if (id == "id17") {
            menuList = listOf(
                Menu("Fish and chips", 4.5),
                Menu("Fish Sticks", 3.0),
                Menu("Fried Fish", 3.0),
                Menu("Baked Fish", 4.0),
                Menu("Fry Potatoes", 2.0),
                Menu("Soda Drink", 1.0)
            )
        }

        return menuList

    }

}
