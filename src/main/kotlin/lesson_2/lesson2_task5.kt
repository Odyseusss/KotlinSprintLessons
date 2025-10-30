package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val years = 20
    val sum = 70_000.0
    val rate = 16.7

    val result = sum * (1 + rate / PERCENTS_CONVERSION).pow(years)

    println("%.3f".format(result))

}

const val PERCENTS_CONVERSION = 100