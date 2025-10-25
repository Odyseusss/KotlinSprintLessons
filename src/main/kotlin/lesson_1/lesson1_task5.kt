package org.example.lesson_1

fun main() {

    var seconds = 6480
    val minute = (seconds / 60) - 60
    val hour = seconds / 3600
    seconds %= 60

    print("0")
    print(hour)
    print(":")
    print(minute)
    print(":")
    print("0")
    print(seconds)

}