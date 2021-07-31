package com.divya.equality

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id;
        }
        return false
    }
}

fun main(args: Array<String>) {

    val e1 = Employee("Divya",100)
    val e2 = Employee("Mridul",200)
    val e3 = Employee("Divya",100)

    //structural equality
    println(e1==e2) // false
    println(e1==e3) // true
    println(e1.equals(e2)) // false
    println(e1.equals(e3)) // true

    println()

    // referential equality
    println(e1===e2)// false
    print(e1===e1)//true

}