package org.example.lesson_4

fun main() {

    val isSunnyToday = true
    val isOpenedToday = true
    val airHumidityToday = 20
    val seasonToday = "winter"

    val result = (isSunnyToday && isOpenedToday && airHumidityToday == AIR_HUMIDITY && seasonToday != CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}

const val IS_SUNNY = true
const val AWNING_IS_OPENED = true
const val AIR_HUMIDITY = 20
const val CURRENT_SEASON = "winter"