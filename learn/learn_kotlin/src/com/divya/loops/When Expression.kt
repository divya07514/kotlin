package com.divya.loops

fun main(args: Array<String>) {

    val num = 100
    when (num) {
        100, 600 -> println(600)// gives 600 for both 100 or 600
        200 -> println(200)
        300 -> println(300)
        in 10..20 -> println("in range $num") // range can be used with when
        else -> println("Does not match anything")
    }

    val y = 10
    val sum = when (num) {
        y + 80 -> {
            println(90)
            1
        }
        y + 90 -> {
            println(100)
            2
        }
        else -> {
            println("Does not match anything")
            -1
        }
    }
    println(sum)

    val timeOfYear = Season.WINTER
    val str = when (timeOfYear) {
        Season.WINTER -> "Winter is Coming"
        Season.FALL -> "Fall is Coming"
        Season.SUMMER -> "Summer is Coming"
        Season.SPRING -> "Spring is Coming"
    }
    println(str)
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}