package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    println("Amount of bonus crystal ore = " + (crystalOre * buff) / PERCENTS_CONVERSION)
    println("Amount of bonus iron ore = " + (ironOre * buff) / PERCENTS_CONVERSION)

}

const val PERCENTS_CONVERSION = 100