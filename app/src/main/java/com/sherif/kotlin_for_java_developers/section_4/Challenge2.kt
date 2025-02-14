package com.sherif.kotlin_for_java_developers.section_4

fun main(args: Array<String>) {

    // Task 1

    val myFloat1 = -3847.384F
    val myFloat2: Float = 3847.384F
    val myFloat3 = 3847.384.toFloat()

    // Task 2

    val myFloat4: Float? = null

    // Task 3

    val shortArray = shortArrayOf(1,2,3,4,5)

    // Task 4

    var intArray: Array<Int?> = arrayOfNulls(40)
    intArray = Array(40){i -> (i+1) * 5}
    intArray.forEach { println(it) }

    // More shorten way in one line
    val intArray1 = Array<Int?>(40) {i -> (i+1) * 5}

    // Task 5

    val charArray = charArrayOf('a', 'b', 'c')
    DummyClass().method1(charArray)

    // Task 6

    val x: String? = "I AM IN UPPERCASE"
    var z = "Sherif"
    z = x?.toLowerCase()?:"I give up!"

    // Task 7

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    // Task 8

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()







}