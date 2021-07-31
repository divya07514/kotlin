package com.divya.nulls

import java.util.*

fun main(args: Array<String>) {

    val str: String? = "This is not the null"
    println("${str?.uppercase(Locale.getDefault())}") // 'str?' means that value for 'str' could be null. Kotlin does  a null check under the covers.
    val upperCase = str!!.uppercase()// '!!' is called as non null assertion. We use this when we are absolutely sure that variable cannot be null
    println(upperCase)


    val nullStr: String? = null
    println("${nullStr?.uppercase()}") // '?' is called as safe operator. Expression in print stmt will evaluate to null
    //val nullStrUpper = nullStr!!.uppercase() //   Will throw 'NPE' when '!!' non null assertion is done
    //println(nullStrUpper)

    val defaultStr = nullStr
            ?: "This is a default value given to a null variable" // '?:' is called Elvis Operator. this is used to give default value to a null variable
    println(defaultStr)

    val something: Any = arrayOf(1, 2, 3, 4)
    val safeCast = something as? String // 'as?' is called as safe cast operator. If casting cannot be done,then this will not throw an exception and will evaluate to null
    println("${safeCast ?: "This is an example of safe cast operator. 'somethigng' cannot be safely cast to string from an array "}")


    val letStr : String? = "This is not null"
   // printText(letStr). This gives error because function expects non null value and we passing a null value as a parameter to method argument
    letStr?.let { printText(it) }// 'let' allows null parameter to be passed as function argument. 'it' refers to 'letStr' object



}

fun printText(text: String) {
    println(text)
}