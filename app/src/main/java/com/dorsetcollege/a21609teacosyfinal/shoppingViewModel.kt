package com.dorsetcollege.a21609teacosyfinal

import androidx.lifecycle.ViewModel

class shoppingViewModel: ViewModel() {
    var totalAmount = 0.0

    var darjellingcost = 8.50
    var assamcost = 7.50
    var lapsangcost = 9.50
    var earlgreycost = 3.50
    var irishbreakfastcost = 2.50

    var darjellingquan = 0
    var assamquan = 0
    var lapsangquan = 0
    var earlgreyquan = 0
    var irishbreakfastquan = 0

    fun addDarjelling(){
        darjellingquan++
        totalAmount += darjellingcost
    }
    fun addAssam(){
        assamquan++
        totalAmount += assamcost
    }
    fun addLapsang(){
        lapsangquan++
        totalAmount += lapsangcost
    }
    fun addEarlGrey(){
        earlgreyquan++
        totalAmount += earlgreycost
    }
    fun addIrishBreakfast(){
        irishbreakfastquan++
        totalAmount += irishbreakfastcost
    }
    fun reset(){
        totalAmount = 0.0
        darjellingquan = 0
        assamquan = 0
        lapsangquan = 0
        earlgreyquan = 0
        irishbreakfastquan = 0
    }

}