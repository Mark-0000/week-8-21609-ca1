package com.dorsetcollege.a21609teacosyfinal

import androidx.lifecycle.ViewModel

class shoppingViewModel: ViewModel(){
    // declaring variables (cost and quantity)
    var totalAmount = 0.0
    var totalQuantity = 0

    var darjellingcost = 8.50
    var assamcost = 7.50
    var lapsangcost = 9.50
    var earlgreycost = 3.50
    var irishbreakfastcost = 2.50
    var deliverycost = 5.0

    var darjellingquan = 0
    var assamquan = 0
    var lapsangquan = 0
    var earlgreyquan = 0
    var irishbreakfastquan = 0

    //methods being called from shoppingFrag class
    fun delivery(){
        if (totalQuantity < 5){
            totalAmount += deliverycost


        }
    }
    fun addDarjelling(){
        darjellingquan++
        totalAmount += darjellingcost
        totalQuantity++
    }
    fun addAssam(){
        assamquan++
        totalAmount += assamcost
        totalQuantity++
    }
    fun addLapsang(){
        lapsangquan++
        totalAmount += lapsangcost
        totalQuantity++
    }
    fun addEarlGrey(){
        earlgreyquan++
        totalAmount += earlgreycost
        totalQuantity++
    }
    fun addIrishBreakfast(){
        irishbreakfastquan++
        totalAmount += irishbreakfastcost
        totalQuantity++
    }
    fun reset(){
        totalAmount = 0.0
        darjellingquan = 0
        assamquan = 0
        lapsangquan = 0
        earlgreyquan = 0
        irishbreakfastquan = 0
        totalQuantity = 0
    }

}