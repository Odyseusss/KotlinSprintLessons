package org.example.lesson_4

fun main() {

    val ship = true
    val quantityOfPeopleInCrew = 55
    val quantityOfProvisionOnShip = 50
    val weather = true

    println(
        "Возможна ли экспедиция? ${
            ship == IS_SHIP_IS_OK && quantityOfPeopleInCrew in 55..70 &&
                    quantityOfProvisionOnShip > 50 && weather == IS_WEATHER_IS_OK ||
                    quantityOfPeopleInCrew == 70 && quantityOfProvisionOnShip >= 50 &&
                    weather == IS_WEATHER_IS_OK
        }"
    )

}

const val IS_SHIP_IS_OK = true
const val IS_WEATHER_IS_OK = true