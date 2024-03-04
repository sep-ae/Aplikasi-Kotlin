package com.ti2a.aplikasikotlin

import com.ti2a.aplikasikotlin.model.Aquarium
import com.ti2a.aplikasikotlin.model.Buku

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    println("Informasi Buku")
    println("============================")
    val buku1 = Buku("Harry Potter", "J.K. Rowling", 1997, 300)
    buku1.tampilkanInfo()
    println("Aquarium")
    println("============================")
    buildAquarium()
}
