package org.example.lesson_1

fun main() {

    val NUMBER_FOR_CONVERSIONS = 60
    var seconds = 6480
    val minute = (seconds % (NUMBER_FOR_CONVERSIONS * NUMBER_FOR_CONVERSIONS)) / NUMBER_FOR_CONVERSIONS
    val hour = seconds / (NUMBER_FOR_CONVERSIONS * NUMBER_FOR_CONVERSIONS)
    seconds %= NUMBER_FOR_CONVERSIONS

    println(String.format("%02d:%02d:%02d", hour, minute, seconds))

}