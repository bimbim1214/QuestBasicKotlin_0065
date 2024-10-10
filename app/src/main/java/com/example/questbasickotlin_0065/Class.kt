package com.example.questbasickotlin_0065

class Motor()

class Contact(val id: int, var Email: String)

fun main(){
    val contact = Contact(1, "mary@gmail.com")

    println(contact.email)

    contact.email = "jane@gmail.com"
}
