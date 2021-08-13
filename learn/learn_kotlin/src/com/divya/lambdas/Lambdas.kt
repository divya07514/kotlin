package com.divya.lambdas

import java.lang.StringBuilder

fun main(args: Array<String>) {


    //println(count())
    //println(withCount())
    println(applyCount())

    run { println("Testing Lambdas") }
    val employeeList = listOf<Employee>(Employee("Divya", "Thakur", 2011), Employee("Mridul", "Thakur", 2013))

    println(employeeList.minOf { it.startYear })
    println(employeeList.minOf(Employee::startYear))

    findByLastName(employeeList, "Thakur")
}

fun count(): String {
    val sb = StringBuilder()
    for (i in 1..99) {
        sb.append(i)
        sb.append(", ")
    }
    sb.append(100)
    return sb.toString()
}

fun withCount() = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}


fun applyCount() = StringBuilder().apply {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach() {
        if (it.lastName == lastName) {
            println(it)
            return
        }
    }
}


data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}