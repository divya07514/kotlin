package com.divya.strings

class Flight(private val from: String, private val to: String) {
    override fun toString(): String {
        return "Flight(from='$from', to='$to')"
    }
}

fun main(args: Array<String>) {
    val f1 = Flight("Mumbai", "Pune")
    println(f1)

    val change = 4.43
    println("$change")// this will print val of change variable as string
    println("\$change")// this wil print $change as string

    val numerator = 10.99
    val denominator= 20.11

    println("${numerator/denominator}")// using expression value within String
}