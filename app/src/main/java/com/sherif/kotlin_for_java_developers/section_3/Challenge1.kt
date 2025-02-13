package com.sherif.kotlin_for_java_developers.section_3

fun main(args: Array<String>) {

    // Declare two immutable strings variables called hello1 and hello2. Assign "Hello to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
    println(if(hello1 === hello2) true else false)
    // Another way
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    // Do the same thing as above, but test for structural equality
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    // Declare a mutable variable of type Int and assign it the value of 2988
    var num = 2988

    // Declare an immutable variable of type Any and assign it
    // the string "The Any type is the root of the Kotlin class hierarchy".
    // Then, using a smart cast, print out the uppercased string
    val any: Any
    any = "The Any type is the root of the Kotlin class hierarchy"
    if(any is String){
        println(any.uppercase())
    }

    // Using one line of code, print out the following. Make sure your code is nicely indented
    //     1
    //    11
    //   111
    //  1111
    println("""    
              |    1
              |   11
              |  111
              | 1111
              | """.trimMargin())





}