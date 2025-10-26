package org.example.lesson_2

fun main() {

    val years = 20
    var sum = 70_000.0
    val rate = 0.167

    for (i in 1..years) {
        sum *= (1 + rate)
    }

    println(String.format("%.3f", sum))

}