package com.ti2a.aplikasikotlin

fun main() {
    println("Filter")
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
    println()
    println("Eager Filter")
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    println()
    println("Lazy Filter")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    println()
    val newList = filtered.toList()
    println("new list: $newList")

    println()
    println("MAP")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println()
    println("lazy: $lazyMap")
    println("+++++++++++++++++++++++++++++++++++")
    println("first: ${lazyMap.first()}")
    println("+++++++++++++++++++++++++++++++++++")

    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("+++++++++++++++++++++++++++++++++++")
    println("filtered: ${lazyMap2.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("+++++++++++++++++++++++++++++++++++")
    println("Flat: ${mylist.flatten()}")
}