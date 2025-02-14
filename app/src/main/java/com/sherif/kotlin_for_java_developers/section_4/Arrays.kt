package com.sherif.kotlin_for_java_developers.section_4

import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("Sherif", "Sherif2", "Sherif3") // String Array
    val longs1 = arrayOf(1L, 2L, 3L) // Long Array
    val longs2 = arrayOf<Long>(1, 2, 3) // Long Array
    val longs3 = arrayOf(1, 2, 3) // Int Array

    println(names is Array<String>) // check if the array is of type String will print true
    println(longs1 is Array<Long>) // check if the array is of type Long will print true
    println(longs2 is Array<Long>) // check if the array is of type Long will print true
    println(longs3 is Array<Int>) // check if the array is of type Int will print true


    println(longs1[2]) // print the value of the array at index 2

    val evenNumbers = Array(16) { i -> i * 2 } // create an array of even numbers
    for(number in evenNumbers){
        println(number)
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 } // create an array of 100000 numbers
    val allZeroes = Array(100) { 0 } // create an array of 100 zeroes

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for(number in someArray){
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10 } // create an array of 6 numbers
    for(number in someArray){
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a') // create an array of mixed types
    for(element in mixedArray){
        println(element)
    }
    println(mixedArray is Array<*>) // check if the array is of type Any will print true
    println(mixedArray.isArrayOf<Any>()) // check if the array is of type Any will print true

    val myIntArray = arrayOf(3, 9, 434, 2, 33.8)
    // DummyClass().printNumbers(myIntArray) error because the array is not of type Int and the function expects an array of Int
    val myIntArray2 = intArrayOf(3, 9, 434, 2, 33) // create an array of int
    DummyClass().printNumbers(myIntArray2) // print the array of int

    // var someOtherArray = Array<Int>(5) error because the array is not initialized
    var someOtherArray : Array<Int>// create an array of int
    var someOtherArray2 = IntArray(5) // create an array of int
    for(number in someOtherArray2) {
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray()) // print the array of even numbers

    val convertedIntArray = myIntArray2.toTypedArray() // convert the array to an array of Int

}