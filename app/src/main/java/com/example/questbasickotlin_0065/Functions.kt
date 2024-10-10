package com.example.questbasickotlin_0065

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, world!")
}
fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name")
}

//named argument
//named argument merupakan cara untuk memanggil fungnsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! you are $age yers old.")
}

//default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! you are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("john")
    withNamedArgument(name = "john", age = 30)
    withDefaultParameter(age = 35)
}