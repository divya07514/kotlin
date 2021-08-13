package com.divya.inheritance


fun main(args: Array<String>) {

    val laserPrinter = LaserPrinter("HP", 12)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println(modelName)

    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName), MyInterface {

    override val num : Int = 20

    /**
     * this method cannot be overridden by sub-classes
     */
    final override fun printModel() = println("Laser Printer : $modelName")
    override fun bestSellingPrice(): Double {
        return 100.23
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {

}

/**
 * Data classes are closed classes. They cannot be inherited. They can extend other classes tough.
 */
data class DataClass(val num: Int)

interface MyInterface {

    val num: Int
    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {

    fun mySubFunction(str: String): String
}

class Something : MySubInterface {

    /**
     * The way to give default value for the concrete property.
     * Property in interface cannot have a backing field.
     */
    override val num: Int
        get() = 20

    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}