package com.ti2a.aplikasikotlin.model

import android.graphics.Color

class House(var windows: Int, color: String = "White") {
    var houseOfColor: String = color
    var numberOfWindows: Int = windows
}
val myHouse = House(windows = 3, color = "Blue")
println("Number of windows: ${myHouse.numberOfWindows}")
println("Color of the house: ${myHouse.houseOfColor}")

fun main() {
    val myHouse = House(windows = 4, color = "Green")


    println("Number of windows: ${myHouse.numberOfWindows}")
    println("Color of the house: ${myHouse.houseOfColor}")
}