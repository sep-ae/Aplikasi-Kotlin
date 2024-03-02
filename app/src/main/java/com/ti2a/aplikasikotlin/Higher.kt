package com.ti2a.aplikasikotlin

fun main() {
    println("+++++++++++++++++++++++++++++")
    println(updateDirty(27, waterFilter))
    println("+++++++++++++++++++++++++++++")
    println(updateDirty(9, ::increaseDirty))

    println("+++++++++++++++++++++++++++++")
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }
    println(dirtyLevel)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun increaseDirty(start: Int): Int = start + 1
