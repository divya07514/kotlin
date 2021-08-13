package com.divya.loops

fun main(args: Array<String>) {

    val range = 1..5
    val charRange = 'a'..'z'
    val strRange = "ABD".."XYZ"

    println(3 in range)
    println('x' in charRange)
    println("ZZZZ" in strRange)

    val reverseRange = 5.downTo(0)
    val stepRange = (3..15).step(3)

    for(i in stepRange){
        println(i)
    }

    for(ch in "Divya"){
        println(ch)
    }

    for(i in 20 downTo 10 step 5){
        println(i)
    }

    for(i in 1 until 4){
        println(i)
    }

    val seasons = arrayOf("Spring","Summer","Winter","Fall")
    for(i in seasons.indices){
        println("${seasons[i]} is season number $i")
    }
    seasons.forEach { println(it) }
    seasons.forEachIndexed {index, value -> println("$value is season number $index")}
}