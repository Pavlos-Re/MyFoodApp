package com.example.myfoodapp.data

object TotalOrderList {

    private var mOrder: MutableList<Menu> = mutableListOf()

    fun addToList(menu: Menu) {
        mOrder.add(menu)
    }

    fun getFromList(): MutableList<Menu> {

        return mOrder

    }

    fun getTotalPrice(mOrder: MutableList<Menu>): Double {

        var sum = 0.0

        for(i in 0 until mOrder.size) {
            sum = mOrder[i].Price + sum
        }

        return sum

    }
}