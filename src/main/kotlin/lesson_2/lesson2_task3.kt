package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    var arrivalMinute = travelTimeInMinutes % CONVERSION_COEFFICIENT
    val arrivalHour = (departureHour + travelTimeInMinutes / CONVERSION_COEFFICIENT) + (arrivalMinute + departureMinute) / CONVERSION_COEFFICIENT
    arrivalMinute = (arrivalMinute + departureMinute) % CONVERSION_COEFFICIENT

    print(arrivalHour)
    print(":")
    print(arrivalMinute)

}

const val CONVERSION_COEFFICIENT = 60