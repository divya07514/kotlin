package com.divya.oops

fun main(args: Array<String>) {

    val addr = Address("Privet")
    println(addr)

    val addrShort = AddressShort("Drive")
    println(addrShort)

    val addrShortOne = AddressShort("Drive", false)
    println(addrShortOne.street)
    println(addrShortOne.home)
    println(addrShortOne.pin)

}

/**
 * This is a long way to doing things
 */
class Address constructor(street: String) { // Declaring a primary constructor here.
    val street: String

    // init block is not a constructor. This runs when an instance is create and is used in conjunction with primary constructors to assign values
    init {
        this.street = street
    }

    override fun toString(): String {
        return "Address(street='$street')"
    }

}

/**
 * Properties are public by default. Getters and Setters are by default provided for public properties.
 */
class AddressShort(val street: String, var pin: String = "411057") {

    var home: Boolean = true
    get(){
        println("Running the custom get")
        return field // this is a backing field. Field refers to home property
    }

    //This is a secondary constructor. This does not declare properties for this. Only primary does that. Hence, we cannot use 'val' with properties in this.
    // You can have secondary constructor without having a  primary one
    constructor(street: String, home: Boolean) : this(street) {
        this.home = home
    }

    override fun toString(): String {
        return "AddressShort(street='$street')"
    }

}