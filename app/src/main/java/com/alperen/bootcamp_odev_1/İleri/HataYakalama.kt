package com.alperen.bootcamp_odev_1.İleri

import java.lang.Exception

fun main() {
    //1. compile error
    val a = 10

    //   x = 100

    // 2. exception : runtime error

    val x = 10
    val y = 0


    try {
        println("Sonuç: ${x / y}")
        println("işlem tamam")
    } catch (e: Exception) {// exception sınıfından bir hata anlamına gelyor

        println("İkinci sayı 0 olamaz ")
    }


}