package learn.kotlin.basics

/**
 * Created by grandolf49 on 28-06-2020
 *
 * Control Flow Expressions and Loops: if, when, for, while
 */
fun main() {
    println("Control Flow Expressions and Loops: if, when, for, while")

    /**
     * If expression (not a statement)
     *
     * 1. 'if' is an expression i.e. it returns a value.
     * 2. Therefore there is no ternary operator (condition ? then : else)
     * 3. if branches can be blocks, and the last expression is the value of a block
     */
    println("If Expression")
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
     * When Expression
     *
     * 1. Scope of variable, introduced in when subject, is restricted to when body.
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
     * For Loop
     *
     * 'for' iterates through anything that provides an iterator, i.e.
     * 1. has a member- or extension-function iterator(), whose return type
     *      a. has a member- or extension-function next(), and
     *      b. has a member- or extension-function hasNext() that returns Boolean.
     *
     * 2. A for loop over a range or an array is compiled to an index-based loop that does not create an iterator object.
     */
    println("For Loop")
    // Creating a read only list of strings - with iterator
    val items = listOf("apple", "banana", "oranges")
    for (item in items) {
        println(item)
    }
    // For loop by index - without iterator
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println()

    /**
     * While and Do While Loop
     */
    println("While Loop")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println("Do While Loop")
    do {
        val y = index
        print("$y ")
        index++
    } while (y < 10)
    println()
    println()

}