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

    //check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    }else {
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length) //18
    println(nullable?.length) // null

    //notNull dosn,t accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() {
    nullSafety()
}