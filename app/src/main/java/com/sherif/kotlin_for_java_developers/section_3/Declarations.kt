package com.sherif.kotlin_for_java_developers.section_3

fun main(args: Array<String>) {

    val number1:Int = 25
    val number2 = 25 // you can not write the type of the variable compiler can infer it

    //number1 = 30 -> error : val cannot be reassigned
    //number2 = 30 -> error : val cannot be reassigned

    var number3 = 25
    number3 = 30 // var can be reassigned
    println(number3)

    var number4:Int
    number4 = 25  // var can be reassigned
    println(number4)
    //number4 = "sherif" -> error : type mismatch

    val employee1 = Employee("Sherif", 500)
    employee1.name = "sherif ashraf"

    // employee1 = Employee("Sherif", 500)  val cannot be reassigned

    val employee2: Employee

    // here is no problem because the compiler can know that only one of the two cases will be executed
    if(number3 > number4){
        employee2 = Employee("Sherif ashraf", 500)
    }else{
        employee2 = Employee("Sherif khedr", 505)
    }
}

class Employee (var name:String, val id:Int){

}