package org.example.lesson_4

fun main() {

    val numberOfTrainingDay = 5
    val isArmAndAbsDay = numberOfTrainingDay % 2 == 1

    val hands = isArmAndAbsDay
    val abs = isArmAndAbsDay
    val legs = !isArmAndAbsDay
    val back = !isArmAndAbsDay

    println(
        """
        Упражнения для рук:     $hands
        Упражнения для ног:     $legs
        Упражнения для спины:   $back
        Упражнения для пресса:  $abs
    """.trimIndent()
    )

}