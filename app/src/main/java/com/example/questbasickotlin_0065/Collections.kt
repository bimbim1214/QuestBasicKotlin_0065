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

    //list muutable
    val shape: MutableList<String> = mutableListOf("Circle", "Squire", "Triangle")
    println(shape)

    //menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list Read Only
    val shapeLocked:List<String> = shape
    println(shapeLocked)
}

//set adalah kumpulan data yang tidak dimiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
//set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat  di uabh
//set Read Only menggunakan setOf
//set mutbale menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    //set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Squere", "Triangle")
    println(shape)

    //menambahkan data ke dalam set mutable
    shape.add("RectangLe")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("circle")
    println(shape)

    //set Read-Only
    val shapesLocked:Set<String> = shape
    println(shapesLocked)
}

//map adalah kumpulan data yang disusun dalam pasangan key-value
//map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubajh
//map Read-Only menggunakan mapOf
//map muttable menggunakan mutableMapOf

fun ContohMap() {
    println()
    println("=== Map ===")

    //map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(shape)

    //menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data di dalam map mutable
    shape["Squere"] = 5
    println(shape)

    //map Read-Only
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}