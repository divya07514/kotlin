package com.divya.data.types

fun main(args: Array<String>) {
    var myInt = 10 // default number type
    println("default datatype is Integer ${myInt is Int}")
    val myLong = 10L // this is a long number
    var myLong1: Long = 10
    // Kotlin does not automatically widen the number
    //myInt = myLong1. this gives error as int cannot be assigned a long  value.

    myLong1 = myInt.toLong() //converts long to int

    var myDouble = 65.982 // double is default floating point number in Kotlin
    println("default datatype for float numbers is Double ${myDouble is Double}")

    var myFloat = 34.5f // float number
    // automatic widening is not present for float numbers, just like integers

    var char = 'b'
    var myChar = 65
    println("Converting Integer to Char ${myChar.toChar()}")

    var myBool = true

    val anything:Any // like Object class in Java

    //Nothing class is subclass of every class


    // In java methods that use Void. don't return anything. However, in Kotlin , Unit class is used is simulate this behaviour. But , it does return something and that is class Unit class.

}