package com.divya.loops

import java.lang.NumberFormatException

fun main(args: Array<String>) {

    println(getNumber("aa") ?: "exception")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("In finally block")
    }
}