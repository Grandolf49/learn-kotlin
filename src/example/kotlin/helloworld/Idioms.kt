package example.kotlin.helloworld

/**
 * Created by grandolf49 on 28-06-2020
 *
 * Idioms in Kotlin
 */

fun main() {
    println("A collection of frequently used Idioms in Kotlin")

    /**
     * Creating a customer
     */
    println("Creating an object of a data class")
    val customer = Customer("John Doe", "johndoe@email.com")
    println(customer.toString())
    println()

    /**
     * Default Function Params
     */
    println("Default Function Params")
    foo()
    // Pass only one parameter
    foo(5)
    foo(b = "Hello")
    println()

    /**
     * Filtering a list. Pass a Lambda function for filtering
     */
    println("Filtering a list. Pass a Lambda function for filtering")
    // Creating a read only list
    val list = listOf(3, 2, -4, 1, -5, -3, 0, -6)
    val positives = list.filter {
        // it -> is the default name of the variable
        it >= 0
    }
    println("Filtered List: $positives")
    println()

    /**
     * Creating a Read-Only Map
     */
    println("Creating a Read Only Map")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in map) {
        println("key: $key \t value: $value")
    }
    println("Access map using [] operator")
    println("key: a, value: ${map["a"]}")
    println()

    /**
     * Extension Functions
     *
     * Adding a function to a Kotlin Class. Extension functions will be available to all variables of that type within
     * the scope of the project only.
     */
    println("Extension Functions")
    fun String.removeSpaces(): String {
        return this.replace(" ", "")
    }
    // Use extension function
    val str = "This Is An Example Of Kotlin Extension Function"
    val strExt = str.removeSpaces()
    println("Before: $str")
    println("After: $strExt")
    println()

    /**
     * 'with' and 'apply' keywords
     *
     * 1. 'with' - Calling multiple functions on an object instance
     * 2. 'apply' - Configuring properties that may or may not be present in the constructor
     */
    println("'With' Operator -> Calling multiple methods on Turtle object")
    val turtle = Turtle()
    with(turtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
    println("'Apply' Operator -> Using apply operator to configure objects not in constructor")
    val turtle1 = Turtle().apply {
        a = 3
        b = 2
        c = 1
    }
    println("Turtle: a=${turtle1.a} b=${turtle1.b} c=${turtle1.c} ")
    println()
}

/**
 * Creating a POJO/Model/Data class in Kotlin
 *
 * A Customer class with the following functionality
 * 1. Getters and Setters (only for vars) for all properties
 * 2. equals()
 * 3. hashCode()
 * 4. toString()
 * 5. copy()
 *
 */
data class Customer(val name: String, val email: String)

/**
 * Set default function parameters. No need to overload function with multiple parameters
 */
fun foo(a: Int = 0, b: String = "default") {
    println("a: $a and b: $b")
}

/**
 * Turtle class to illustrate calling of multiple methods on the same object
 */
class Turtle {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0

    fun penUp() = println("Pen Up")
    fun penDown() = println("Pen Down")
    fun turn(degree: Double) = println("Turning $degree degrees")
    fun forward(pixels: Double) = println("Moving forward by $pixels pixels")
}