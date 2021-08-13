package com.divya.functions

import java.util.*

fun main(args: Array<String>) {
    val result = mul(3, 4, "The result is : ")
    println(result)

    val state = State("pune")
    println(state.upperCase())

    val nums = arrayOf(1, 2, 3, 4, 5).toIntArray()

    /**
     * Here '*' is called as spread operator. Functions has vararg argument and we are passing an Int array to it.
     * Here we need to use '*' so that every array element goes as individual item
     */
    printNums(*nums)

    println(Utils().upperFirstLast("divya"))
    print("divya".upperFirstLast())
}

/**
 * This function has expression body as it as been directly assigned an expression.
 */
fun mul(operandOne: Int, operandTwo: Int, label: String) = "$label ${operandOne * operandTwo}"

/**
 * Functions that takes variable arguments.
 * There can be only one vararg argument in a function signature.
 */
fun printStates(vararg state: State) {
    for (s in state) {
        println(s.upperCase())
    }
}

fun printNums(vararg nums: Int) {
    for (i in nums) {
        println(i)
    }
}

/**
 * This is called as Extension function. We are associating this function with String class.
 */
fun String.upperFirstLast(): String {
    val upperFirst = this.substring(0, 1).uppercase(Locale.getDefault()) + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.lastIndex - 1,
        upperFirst.length
    ).uppercase()
}

class State(val name: String) {
    fun upperCase() = name.uppercase(Locale.getDefault())
}
