package example.kotlin.basics

/**
 * Created by grandolf49 on 28-06-2020
 *
 * Basic Data Types in Kotlin
 */

fun main() {
    println("Data Types in Kotlin")

    /**
     * Numbers in Kotlin:
     * ______________________________________________________________________________________________
     * Type	    Size (bits)	Min value	                        Max value
     * ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
     * Byte	    8	        -128    	                        127
     * Short	16	        -32768	                            32767
     * Int	    32	        -2,147,483,648 (-2^31)	            2,147,483,647 (231 - 1)
     * Long	    64	        -9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)
     * ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
     * 1. All variables initialized with integer values not exceeding the maximum value of Int have the inferred type Int.
     * 2. If the initial value exceeds this value, then the type is Long.
     * 3. To specify the Long value explicitly, append the suffix L to the value.
     *
     * Float and Double:
     * ______________________________________________________________________
     * Type	    Size (bits)	Significant Bits    Exponent Bits   Decimal Bits
     * ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
     * Float    32          24                  8               6-7
     * Double   64          53                  11              15-16
     */
    val one = 1 // Int
    val billion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    // Get name of variable type
    println("$one is of type ${one.javaClass.name}")
    println("$billion is of type ${billion.javaClass.name}")
    println(oneLong.javaClass.name)
    println(oneByte.javaClass.name)
    println(pi.javaClass.name)
    println(e.javaClass.name)
    println(eFloat.javaClass.name)

}