package com.example.questbasickotlin_0065

//list adalah kumpulan data yang disusun secara berurutan dari
//list bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
//list bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//list read only menggunakan listof
//list mutable menggunakan mutableListof

fun ContohList(){
    println("=== List ===")
    //list Read only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)
}