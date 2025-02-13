package com.sherif.kotlin_for_java_developers.section_3

fun main(args: Array<String>) {


    val x = 0x00101101
    val y = 0x11011011
    var z = 0x00000000;

    z = x and y // can not use the & operator in kotlin
    z = x or y  // can not use the | operator in kotlin
    z = x xor y // can not use the ^ operator in kotlin

}