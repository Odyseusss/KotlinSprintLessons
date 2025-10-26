package org.example.lesson_3

fun main() {

    val moveStatus = "D2-D4;0"

    val parts = moveStatus.split("-", ";")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println(from)
    println(to)
    println(moveNumber)

}