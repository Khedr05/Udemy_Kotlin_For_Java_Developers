package com.sherif.kotlin_for_java_developers.section_3


fun main(args: Array<String>) {

    val employee1 = EmployeeV2("ashraf", 0)
    val employee2 = EmployeeV2("Sherif", 1)
    val employee3 = EmployeeV2("Sherif", 1)

    println(employee1 == employee2)
    println(employee2 == employee3) // calls the equals method
    println(employee1.equals(employee2)) // calls the equals method
    println(employee2.equals(employee3))

    val employee4 = employee2
    println(employee4 === employee2) // checks if the references are the same


    println(employee4 != employee2) // calls the equals method it is the same as the == operator will return false
    println(employee4 !== employee2) // checks if the references are the same it is the same as the === operator will return false
    println(employee2 != employee3) // calls the equals method it is the same as the == operator will return false
    println(employee2 !== employee3) // checks if the references are the same it is the same as the === operator will return true

}


class EmployeeV2 (var name:String, val id:Int){

    override fun equals(obj: Any?): Boolean {
        if(obj is EmployeeV2){
            return name == obj.name && id == obj.id
        }
        return false
    }
}