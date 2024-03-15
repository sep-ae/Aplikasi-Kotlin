package com.ti2a.aplikasikotlin
import com.ti2a.aplikasikotlin.model.Aquarium
import com.ti2a.aplikasikotlin.model.Aquarium2
import com.ti2a.aplikasikotlin.model.Buku
import com.ti2a.aplikasikotlin.model.Plecostomus
import com.ti2a.aplikasikotlin.model.Plecostomuss
import com.ti2a.aplikasikotlin.model.Shark
import com.ti2a.aplikasikotlin.model.Sharks
import com.ti2a.aplikasikotlin.model.TowerTank
import com.ti2a.aplikasikotlin.model.myAquarium


fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

}

fun buildMyAquarium() {
    val aquarium1 = myAquarium()
    aquarium1.MyPrintSize()

    val aquarium2 = myAquarium(width = 25)
    aquarium2.MyPrintSize()

    val aquarium3 = myAquarium(height = 35, length = 110)
    aquarium3.MyPrintSize()

    val aquarium4 = myAquarium(width = 25, height = 35, length = 110)
    aquarium4.MyPrintSize()

    val aquarium6 = myAquarium(numberOfFish = 29)
    aquarium6.MyPrintSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")

    val aquarium7 = myAquarium(numberOfFish = 29)
    aquarium7.MyPrintSize()
    aquarium7.volume = 70
    aquarium7.MyPrintSize()
}
fun buildAquarium2() {
    println("======================================")
    val aquarium8 = Aquarium2(length = 25, width = 25, height = 40)
    aquarium8.printSizes()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSizes()
}

fun makeFish() {
    println("======================================")
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun makeFish2() {
    println("======================================")
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun makeFish3() {
    println("======================================")
    val shark = Sharks()
    val pleco = Plecostomuss()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    println("Informasi Buku")
    println("============================")
    val buku1 = Buku("Harry Potter", "J.K. Rowling", 1997, 300)
    buku1.tampilkanInfo()
    println("============================")
    println("Aquarium")
    println("============================")
    buildAquarium()
    buildMyAquarium()
    buildAquarium2()
    makeFish()
    makeFish2()
    makeFish3()
}
