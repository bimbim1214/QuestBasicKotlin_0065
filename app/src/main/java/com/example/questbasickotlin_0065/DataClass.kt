package com.example.questbasickotlin_0065

import android.provider.ContactsContract.CommonDataKinds.Email

//Data class adalah class yang digunakan untuk menyimpan data
//data class meyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
//Data Class juga menyyediakan fungnsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)