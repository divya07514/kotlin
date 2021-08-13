package com.divya.constants

const val MY_CONSTANT = 100

fun main(args: Array<String>) {
    println(MY_CONSTANT)

    val c1 = Car("Blue", "Ford", 2017)
    println(c1)

    val c2 = c1.copy()
    println(c2)
    println(c2 == c1)

    val c3 = c1.copy(color = "red")
    println(c3)

}

/**
 * Data classes are created to hold state amd come with some extra functionalities.
 * Data class must have at least one primary constructor and properties must be marked as var or val
 * Cannot be abstract classes, sealed classes and inner classes
 */
data class Car(val color: String, val model: String, val year: Int) {


}