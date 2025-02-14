package com.sherif.kotlin_for_java_developers.section_4

fun main(args: Array<String>) {


    val myInt = 10
    var myLong = 22L // L is used to specify that the value is long
   // myLong = myInt  error : type mismatch kotlin do not support implicit conversions
    myLong = myInt.toLong() // to convert the value to long we need to use the toLong function


    val myByte: Byte = 111
    var myShort: Short
    // myShort = myByte  error : type mismatch kotlin do not support implicit conversions
    myShort = myByte.toShort() // to convert the value to short we need to use the toShort function


    var myDouble = 65.984
    val myFloat = 123.45f // f is used to specify that the value is float
    myDouble = myFloat.toDouble() // to convert the value to double we need to use the toDouble function


    val char = 'b'
    // char = 65 error : type mismatch kotlin do not support implicit conversions
    val myCharInt = 65
    println(myCharInt.toChar()) // to convert the value to char we need to use the toChar function


    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass()
        .isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any // Any is the root of the kotlin class hierarchy and is the default type for all classes

    val unit: Unit // Unit is the default return type for functions that do not return anything like void in java



}