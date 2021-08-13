package com.divya.kotlin.collections

fun main(args: Array<String>) {

    val strings = listOf("spring","summer","fall","winter")// immutable list
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello",null,"world")// nulls are not added to the list
    println(notNullList.javaClass)
    println(notNullList)

    val arrayList = arrayListOf<Int>(1,2,3,4,5)// mutable list
    println(arrayList.javaClass)

    val array = arrayOf("black","white","green")
    val colorList = array.toList()
    println(colorList)

    println(strings.last())
    println(strings.asReversed())
    println(strings.getOrNull(5))
    println(colorList.zip(strings))// actually create elements of Pair Class

    val mergedList = colorList + strings
    println(mergedList)


}