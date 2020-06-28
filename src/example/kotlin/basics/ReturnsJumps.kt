package example.kotlin.basics

/**
 * Created by grandolf49 on 28-06-2020
 *
 * Returns and Jumps in Kotlin
 *
 * Kotlin has three structural jump expressions:
 *
 * 1. return - By default returns from the nearest enclosing function or anonymous function.
 * 2. break - Terminates the nearest enclosing loop.
 * 3. continue - Proceeds to the next step of the nearest enclosing loop.
 */
fun main() {
    println("Returns and Jumps in Kotlin")

    /**
     * Break and Continue Labels
     *
     * Any expression in Kotlin can be marked with a label.
     * Label in Kotlin is of the form - {label name}@ E.g. loop@
     */
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 5 && j == 5) {
                break@loop
            }
        }
    }
    println()

}