package org.example.lesson_2

fun main() {

    val pupil1 = 3
    val pupil2 = 4
    val pupil3 = 3
    val pupil4 = 5
    val quantityOfPupils = 4
    val sum = (pupil1 + pupil2 + pupil3 + pupil4).toDouble() / quantityOfPupils

    println("%.2f".format(sum))

}