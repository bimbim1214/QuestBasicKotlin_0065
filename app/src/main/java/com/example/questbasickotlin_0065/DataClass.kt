package com.example.questbasickotlin_0065

import android.provider.ContactsContract.CommonDataKinds.Email

//Data class adalah class yang digunakan untuk menyimpan data
//data class meyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
//Data Class juga menyyediakan fungnsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

}