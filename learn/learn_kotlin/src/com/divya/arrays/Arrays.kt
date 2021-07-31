package com.divya.arrays

import com.divya.java.dummy.Dummy

/**
 * Array is a class
 */
fun main(args: Array<String>) {
    val names = arrayOf("Divya", "Thakur", "Mridul")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val longs3 = arrayOf(1, 2, 3)

    println(longs1 is Array<Long>)
    println((longs3 is Array<Int>))

    println(longs1[1])

    val evenNumbers = Array(16) { i -> i * 2 } //initialising array of size 16 and passing a lambda whichok will generate even numbers and add them to the array
    for (even in evenNumbers) {
        print("$even ")
    }
    println()
    var someArray: Array<Int> = arrayOf(1, 2, 3, 4)
    someArray = Array(6) { i -> i * 3 }
    for (num in someArray) {
        print("$num ")
    }

    println()

    val mixedArray = arrayOf("hello", 22, 'b', 23L)
    for (elem in mixedArray) {
        print("$elem ")
    }
    println()

    // calling java methods from kotlin code.
    val myIntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9) // use special primitive type array of kotlin
    Dummy().printNumbers(myIntArray)

    println()

    val primIntArray = IntArray(10) // IntArray initializes an array of primitive type and of size 10. All values in array are by default 0
    for(i in primIntArray){
        print(("$i "))
    }
    println()

    //val objIntArray = Array<Int>(10) . This gives error as this is as Array Object and it needs values during declaration only
    val objIntArray = Array<Int>(10) { i -> i * 4 }
    for(i in objIntArray){
        print("$i ")
    }

    println()

    Dummy().printNumbers(objIntArray.toIntArray()) // Convert Array Object to array of primitives

}