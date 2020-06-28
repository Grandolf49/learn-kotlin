/**
 * Created by grandolf49 on 28-06-2020
 *
 * Basics of Kotlin
 */

/**
 * Main Function: Entry point of the program
 */
fun main() {
    println("Basic of Kotlin")

    /**
     * Function invocations
     */
    println("Function Invocations")
    println(sum(32, -45))
    println(sumInferredReturnType(4, 30))
    printSum(23, 50)
    println()

    /**
     * Variables
     * 1. Read only variables should be defined as 'val'. They can be assigned a value only once
     * 2. Variables that can be reassigned should be declared as 'var'
     */
    println("Variables")
    val a: Int = -1 // Immediate assignment
    val b = 2       // Int type is inferred
    var c = 5
    c += 10
    println("a: $a, b: $b, c: $c")
    println()

    /**
     * String Templates
     */
    println("String Templates")
    val s1 = "a is $a and b is $b" // Simple name in template
    val s2 = "${s1.replace("is", "was")}, but now is $a" // arbitrary expression in a template
    println("Simple name in a template: $s1")
    println("An arbitrary expression in a template: $s2")
    println()

    /**
     * Conditional Expressions
     */
    println("Conditional Expressions")
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
    println("Max of 34 and 53 is ${maxOf(34, 53)}")

    fun maxOfAsExpression(a: Int, b: Int) = if (a > b) a else b // Using if as an expression
    println("Max of -4 and -5 is ${maxOfAsExpression(-4, -5)}")
    println()

    /**
     * Nullable Values and Null Check
     *
     * 1. A reference must be explicitly marked as Nullable when null value is possible
     */
    println("Nullable Values")
    // Append '?' to the data type if it is possible that it can hold null values
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }
    println("Value of \"34\" is ${parseInt("34")}")
    println("Value of \"34aasd\" is ${parseInt("34aasd")}")

    //  Using a function that produces null values
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // x and y can be null. Hence apply null check before going ahead
        if (x != null && y != null) {
            println("Product of $x and $y is ${x * y}")
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }
    printProduct("21", "-53")
    printProduct("32", "92int")
    println()

    /**
     * Type Checks and Automatic Casts
     *
     * 1. The 'is' operator checks if an expression is an instance of a type
     * 2. If an immutable local variable or property is checked, no need to cast it explicitly
     */
    println("Type Checks and Automatic Casts")
    fun getType(obj: Any): Any? {
        if (obj is String) {
            return "String"
        } else if (obj is Int) {
            return "Integer"
        } else if (obj is Double) {
            return "Double"
        } else {
            return "Don't know the type"
        }
    }
    println("34 is of type: ${getType(34)}")
    println("'Hello World' is of type: ${getType("Hello World")}")
    println("3.14 is of type: ${getType(3.14)}")
    println("'{ println(\"I am lambda\") }' is of type: ${getType({ println("I am lambda") })}")
    println()

    /**
     * For Loop
     */
    println("For Loop")
    val items = listOf("apple", "banana", "oranges")
    for (item in items) {
        println(item)
    }
    // For loop by index
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println()

    /**
     * While Loop
     */
    println("While Loop")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println()

    /**
     * When Expression
     */
    println("When Expression")
    fun describeObject(obj: Any): String =
        when (obj) {
            is String -> {
                "String"
            }
            is Int -> {
                "Integer"
            }
            is Double -> {
                "Double"
            }
            else -> {
                "Don't know the type"
            }
        }
    println("34 is ${describeObject(34)}")
    println("'34' is ${describeObject("34")}")
    println()

    /**
     * Ranges
     *
     * To check whether a number is within or out of a range using the 'in' operator
     */
    // To check within a range
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("Fits in range")
    }
    // To check if number is out of range
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    // Iterate over a range
    for (t in 1..10) {
        print("$t ")
    }
    println()
    // Iterate over a progression
    for (t in 1..10 step 2) {
        print("$t ")
    }
    println()
    // Decrement a for loop
    for (t in 9 downTo 0 step 3) {
        print("$t ")
    }
    println()

}

/**
 * Basic function declaration with return type
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * Function with expression body and inferred return type
 */
fun sumInferredReturnType(a: Int, b: Int) = a + b

/**
 * Void Function. Can return a type Unit
 */
fun printSum(a: Int, b: Int) {
    /**
     * String Templates - Printing variables in a string
     */
    println("Sum of $a and $b is ${a + b}")
}