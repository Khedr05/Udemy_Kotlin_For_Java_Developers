package com.sherif.kotlin_for_java_developers.section_3


fun main(args: Array<String>) {

    val employee1 = EmployeeV3("Sherif", 500)
    println(employee1)

    // How to skip the dollar sign in the output
    val change = 4.22
    println("To show the value of change, we use $change")
    // also we can use the curly braces to show the value of the variable
    println("To show the value of change with the curly braces, we use ${change}")
    // we use double dollar signs to show the value of the variable
    println("To show the value of change with the dollar sign, we use $$change")
    // also we can use the backslash to escape the dollar sign but kotlin is smart enough to use it without the backslash
    println("To show the value of change with the backslash, we use \$$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")

    println("The employee's id is ${employee1.id}")


}

class EmployeeV3(var name:String, val id:Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}