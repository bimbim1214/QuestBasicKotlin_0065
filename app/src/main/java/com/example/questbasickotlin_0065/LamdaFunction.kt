package com.example.questbasickotlin_0065

//Lamda Function adalah fungsi yang tidak memiliki nama
//Lamda Function biasanya digunakan untuk membuat fungsi yang sederhana
//Lamda Function menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}
 //dapat ditulis dalam ekspresi lamda sbb :
fun main() {
    uppercaseString("hello")
     println({ string: String -> string.uppercase() }("hello"))
     //hello
}