package com.sherif.kotlin_for_java_developers.section_3

fun main(args: Array<String>) {

    val filePash = "C:\\somedir\\filename.txt"
    // to avoid the backslash we can use the raw string
    val filePash2 = """C:\somedir\filename.txt"""
    // multiline strings
    val multiline = """
        123
        456
        789 
        101112
        131415
    """
    println(multiline)

    // to remove the leading stars use the trimMargin function
    val multiline2 = """
        *123
        *456
        *789 
        *101112
        """.trimMargin("*")
    println(multiline2)

    // recommended to use the trimIndent function to remove the leading spaces and use | in first of every line
    val multiline3 = """
        |123
        |456
        |789 
        |101112
        |""".trimMargin()
    println(multiline3)


}