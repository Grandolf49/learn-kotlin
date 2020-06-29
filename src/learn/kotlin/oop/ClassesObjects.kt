package learn.kotlin.oop

/**
 * Created by grandolf49 on 30-06-2020
 *
 * Classes and Objects in Kotlin
 */

fun main() {
    println("Classes and Objects in Kotlin")

    /**
     * Object Instantiation
     *
     * 1. Simple instantiation
     * 2. Using primary constructor
     * 3. Using secondary constructor
     *
     * In Kotlin, there is no 'new' keyword
     */
    // Pass only a particular parameter in the constructor
    var personDefault = Person(firstName = "Chinmay")
    var person = Person("Chinmay", "Kulkarni")
    var persons = Person(listOf(Person("Chinmay"), Person("Bob"), Person("John")))
}

/**
 * Class declaration - Primary constructor
 *
 * 1. If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted
 * 2. Else the constructor keyword is required, and the modifiers go before it:
 * 3. Primary constructor cannot contain any code.
 * 4. Initialization of code can be placed in initializer blocks - 'init' keyword
 * 5. Initialize parameters in primary constructors to define default values
 * 6. To make a class have children, mark it with 'open' keyword.
 */
open class Person(firstName: String, lastName: String = "none") {

    /**
     * Initializer Blocks
     *
     * 1. Put initialization code here
     * 2. Init blocks are executed in the same order as they appear
     * 3. Parameters of the primary constructor can be used in the initializer blocks
     */
    init {
        println("This is init block. I am called first")
        println("Modifying the firstName: $firstName to ${firstName.toLowerCase()}")
    }

    init {
        println("I am called second.")
    }

    /**
     * Secondary Constructors
     *
     * 1. If a class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
     * either directly or indirectly through another secondary constructor(s).
     * 2. Delegation to another constructor of the same class is done using the 'this' keyword
     * 3. Code in all initializer blocks and property initializer is executed before the secondary constructor body.
     * 4. 'this' call can only be omitted if the Class does not have a primary constructor. In this case the delegation
     * still happens implicitly.
     */
    private var personList: MutableList<Person> = mutableListOf()

    constructor(personList: List<Person>) : this(firstName = "default"/*This is invocation of the primary constructor.*/) {
        println("Secondary Constructor")
        this.personList = personList.toMutableList()
    }
}

/**
 * 1. If a non-abstract class does not declare any constructors, by default, a primary constructor with no arguments will
 * be generated with public visibility.
 * 2. If we don't want the class to have a public constructor, we need to declare an empty primary constructor with
 * non-public visibility.
 */
class DontCreateMe private constructor() {
    /**
     * 1. An object of this class cannot be instantiated even though it is not abstract.
     * 2. This class cannot have child classes as well since the primary constructor is non-public
     * 3. This basically acts as an abstract class.
     */
}

/**
 * Inheritance
 *
 * 1. All classes in Kotlin have a common superclass 'Any', that is the default superclass for a class with no supertypes declared
 * 2. 'Any' has three methods: equals(), hashCode() and toString(). Thus, they are defined for all Kotlin classes
 * 3. By default, Kotlin classes are final i.e. they can’t be inherited. To make a class inheritable, mark it with the open keyword
 * 4. If the derived class has a primary constructor, the base class can (and must) be initialized right there, using
 * the parameters of the primary constructor.
 */
class Child(firstName: String) : Person(firstName) {

}