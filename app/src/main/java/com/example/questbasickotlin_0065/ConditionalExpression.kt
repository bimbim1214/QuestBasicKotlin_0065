package com.example.questbasickotlin_0065

import java.lang.NumberFormatException

//conditional Expresion adalah ekspresi yang mengembalilkan nilai berdasarkan kondisi tertentu
//conditional expresion menggunakan if-else, when, dan try-catch
fun ConditionalStantement() {
    println("=== Conditional Expression ===")

    //if-else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    }else {
        println("Negative Number")
    }

    //when
    val day = 1
    when (day) {
        1-> println("sunday")
        2-> println("monday")
        3-> println("tuesday")
        4-> println("wednesday")
        5-> println("thursday")
        6-> println("fryday")
        7-> println("saturday")
        else -> println("invalid day")
    }

    //Try-Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e:NumberFormatException) {
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyoya", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke$-x")
        x++
    }
}
