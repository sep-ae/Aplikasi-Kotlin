package com.ti2a.aplikasikotlin

fun main(){
    var dirtyLevel = 2
    val waterFilter = { dirty : Int -> dirty / 2}
    println("==== CONTOH 1 ====")
    println(waterFilter(dirtyLevel))
    println("==== CONTOH 2 ====")

    println(waterFilters(dirtyLevels))
}

var dirtyLevels = 10
val waterFilters: (Int) -> Int = { dirty -> dirty / 20 }