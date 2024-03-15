package com.ti2a.aplikasikotlin.model

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize(){
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

class myAquarium(length: Int = 100, width: Int = 20, height: Int = 40) {

    var length: Int = length
    var width: Int = width
    var height: Int = height

    init {
        println("-".repeat(50))
        println("aquarium initializing")
    }

    val volumes: Int
        get() = width * height * length / 1000

    constructor(numberOfFish: Int): this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun MyPrintSize(){
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volumes liters")
    }
}