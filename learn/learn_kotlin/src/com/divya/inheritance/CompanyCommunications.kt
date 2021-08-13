package com.divya.inheritance

import java.time.Year
import java.util.*

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())// Here the only instance of object is created and used everywhere else.
    println(CompanyCommunications.getCopyRightLine())
    println(SomeClass.accessPrivateVal())

    val someClass1 = SomeClass.justAssign("This is the string as is")
    val someClass2 = SomeClass.upperOrLower("This is the cased string",false)

    println(someClass1.someString)
    println(someClass2.someString)
}

/**
 * Create Singleton classes using 'object here'.
 */
object CompanyCommunications {

    val year = Year.now().value
    fun getTagLine() = "Our Company"
    fun getCopyRightLine() = "Copyright $year ."
}

class SomeClass private constructor(val someString: String) {

    /**
     * This can be accessed without creating any instance of the class.
     * Serves something like static in java
     */
    companion object {
        private val num = 6
        fun accessPrivateVal() {
            println("I am accessing private property $num")
        }

        /**
         * These two methods provide Factory Method Functionality.
         */
        fun justAssign(str:String) = SomeClass(str)
        fun upperOrLower(str:String, lowerCase: Boolean) : SomeClass{
            if(lowerCase){
                return SomeClass(str.lowercase())
            }else{
               return SomeClass(str.uppercase())
            }
        }
    }
}