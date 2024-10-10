package com.example.questbasickotlin_0065

fun nullSafety() {
    //neverNull has String type
    var neverNull: String = "This can't be Null"

    //Throws a compiler error
    //neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    //This is Ok
    nullable = null
}