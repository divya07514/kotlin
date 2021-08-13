package com.divya.enums

enum class Department(val fullName: String, val numEmployees: Int) {

    HR("HR",10),
    IT("IT",200),
    SALES("Sales",12),
    ACCOUNTING("Accounts",12);

    fun getDepartmentInfo() = "$fullName and $numEmployees"

}

fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDepartmentInfo())
}

