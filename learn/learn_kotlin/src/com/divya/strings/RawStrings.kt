package com.divya.strings

fun main(args: Array<String>) {

    val filePathWindows = """c:\dir\dir""" // use triple quotes to provide valid file path without escaping '\' character

    val str =    """This
                    |is a string
                    |over mutiple
                    |lines""".trimMargin()

    println(str)
}