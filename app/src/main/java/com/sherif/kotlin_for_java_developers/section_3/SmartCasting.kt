package com.sherif.kotlin_for_java_developers.section_3

fun main(args: Array<String>) {

    val employee = Employee("Sherif", 500)

    val  something: Any = employee

    if(something is Employee){
        val newEmployee = something as Employee // casting is not needed in kotlin due to smart casting                  
        println(newEmployee.name)
    }



}