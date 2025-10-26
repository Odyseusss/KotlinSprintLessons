package org.example.lesson_2

fun main() {

    val permanentEmployees = 50
    val interns = 30
    val basicSalary = 30_000
    val internsSalary = 20_000
    val monthlyPaymentForPermanentEmployees = basicSalary * permanentEmployees
    val totalSalaryExpenses = monthlyPaymentForPermanentEmployees + interns * internsSalary
    val averageSalaryOfPermanentEmployees = totalSalaryExpenses / (permanentEmployees + interns)

    println(permanentEmployees)
    println(interns)
    println(basicSalary)
    println(internsSalary)
    println(monthlyPaymentForPermanentEmployees)
    println(totalSalaryExpenses)
    println(averageSalaryOfPermanentEmployees)

}