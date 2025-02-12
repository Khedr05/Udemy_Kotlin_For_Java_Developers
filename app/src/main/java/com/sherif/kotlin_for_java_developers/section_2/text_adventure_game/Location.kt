
package com.sherif.kotlin_for_java_developers.section_2.text_adventure_game


data class Location(val locationID: Int, val description: String){


    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destinationID: Int){
        exits[direction] = destinationID
    }

}