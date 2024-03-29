package com.ti2a.aplikasikotlin



fun drive(speed: String = "Cepat", like:String = "Macan") {
    println("Berkendara $speed Seperti $like")
}

fun shouldChangeWater (day: String, temperature: Int = 25, dirty: Int = 2): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

fun randomDay(): String{
    val hari =  listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return hari.random()
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquito larvae"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${ shouldChangeWater(day)}")
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWaters (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun feedTheFishs() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWaters(day)}")
}

fun main(){
    println("Default Function ")
    drive()
    drive("Normal", "Wedos")
    drive("Lemot", "Kura-Kura")
    println()
    println()
    println("Required Parameter")
    feedTheFish()
    println()
    println()
    println("Compact Function")
    feedTheFishs()
}