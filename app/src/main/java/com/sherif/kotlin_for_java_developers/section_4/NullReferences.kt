package com.sherif.kotlin_for_java_developers.section_4

fun main(args: Array<String>) {

    // val str : String = null error because String is not nullable to make the variable nullable use ?
    val str : String? = null
    val str2 : String? = "This isn't null"
    if(str2 != null) {
        str2.toUpperCase()
    }
    // or use the safe call operator ?
    str2?.toUpperCase()

    val str3: String? = null
    println("What happens when we do this: ${str3?.toUpperCase()}")

    //val countryCode: String? = bankBranch?.address?.country?.countryCode this line for check null safety

    // Elvis operator ?:
    val str4: String? = null
    val str5: String = str4 ?: "This is the default value" // if str4 is null then use the default value
    println(str5)

    // val countryCode: String? = bankBranch?.address?.country?.countryCode ?: "US" if countryCode is null then use the default value

    val something: Any = arrayOf(1, 2, 3, 4)
    val str6 = something as? String // as? is safe cast operator it will return null if the cast is not possible
    println(str6)

    // Non null assertion operator !!
    val str7: String? = "This isn't null"
    val str8 = str7!!.toUpperCase() // if str7 is null then throw a NullPointerException

    val str9: String? = null
    val str10 = str9!! // if str9 is null then throw a NullPointerException
    val str11 = str10.toUpperCase() // the exception will be thrown in line 35 not in this line when we use the null value

    // val countryCode = bankBranch!!.address!!.country!!.countryCode!! this is not a good idea because if it throw a NullPointerException
    // we will know only the line number and do not know which of them is null

    val str12: String? = "This isn't null"
    // printText(str12) error because the function expects a String not a String?
    printText(str12!!) // if str12 is null then throw a NullPointerException we say to the compiler that we know for sure that str12 is not null
    str12?.let { printText(it) } // if str12 is null then the let block will not be executed

    val str13: String? = null
    val str14 = "This is not nullable"
    println(str13 == str14) // false because str13 is null and str14 is not null equal operator is safe operator

}

fun printText(text: String) {
    println(text)
}