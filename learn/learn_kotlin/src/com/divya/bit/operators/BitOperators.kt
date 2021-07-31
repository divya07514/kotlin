package com.divya.bit.operators

import com.divya.equality.Employee

fun main(args: Array<String>) {

    val one = true
    val two = true

    if (one or two) {
        println("or operation")
    }

    if (one and two) {
        println("and operation")
    }

    val s1 = Subject("History", 1)
    val s2: Any = s1

    if (s2 is Subject) {// check for instance type of variable
        println("Is Subject")
        val s3 = s2 as Subject // cast s3 to Subject type
        println("Casting to Subject class")
    }

}

class Subject(val name: String, val id: Int) {

}

