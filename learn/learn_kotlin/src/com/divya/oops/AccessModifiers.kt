package com.divya.oops

/**
 * Top - Level Items
 * Private - Visible within the same file
 * Protected - Can't be used
 * Public - Visible everywhere (by default)
 * Internal - Visible within the same module
 */
fun main(args: Array<String>) {
    val emp = Employee()
    println(emp)
}

/**
 * This class is visible to everything in the same file
 */
private class Employee {

}