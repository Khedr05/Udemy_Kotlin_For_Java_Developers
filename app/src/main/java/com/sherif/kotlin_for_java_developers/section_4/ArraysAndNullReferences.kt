package com.sherif.kotlin_for_java_developers.section_4

fun main(args: Array<String>) {

    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString())

    val nullableInts2 = arrayOfNulls<Int>(5)
    for (i in nullableInts2) {
        println(i)
    }
    println(nullableInts2[3].toString())
    // compiler know that this are nullable array without using ? because it smart enough to know
}