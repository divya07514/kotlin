package com.divya.variable

typealias EmployeeSet = HashSet<Employee> // create a named alias for Set of Employees

fun main(args: Array<String>) {
    val number = 10 // immutable variable. default is Int
    val count: Int // declaring a immutable variable of type int
    count = 20
    //count = 30. This will give error, as 'val' types are immutable

    var runs = 20 // mutable variable declaration
    runs = 34 // can be reassigned.

    val e1 = Employee("Divya Thakur", 500)
    e1.name = "Mridul Thakur" // this can be done, cos this property of e1 variable is mutable.
    // e1 = Employee("John Smith", 300) // This is error as we are trying to reassign val here

    val e2: Employee

    val empSet = EmployeeSet() // usgae of type alias
    empSet.plus(e1)
}

class Employee(var name: String, val id: Int) {

}