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