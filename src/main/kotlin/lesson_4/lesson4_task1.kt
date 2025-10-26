package org.example.lesson_4

fun main() {

    val bookedTablesForToday = 13
    val bookedTablesForTomorrow = 9

    println("Доступность столиков на сегодня: ${bookedTablesForToday < TABLES}\n" +
            "Доступность столиков на завтра: ${bookedTablesForTomorrow < TABLES}")

}

const val TABLES = 13