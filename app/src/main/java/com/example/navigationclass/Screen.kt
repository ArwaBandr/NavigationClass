package com.example.navigationclass

sealed class Screen(val routsc:String){
    object A: Screen("Screen_A")
    object B:Screen("Screen_B")
    object C:Screen("Screen_C")
}