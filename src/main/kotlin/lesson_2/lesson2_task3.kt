package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    var arrivalMinute = travelTimeInMinutes % 60
    val arrivalHour = (departureHour + travelTimeInMinutes / 60) + (arrivalMinute + departureMinute) / 60
    arrivalMinute = (arrivalMinute + departureMinute) % 60

    print(arrivalHour)
    print(":")
    print(arrivalMinute)

}