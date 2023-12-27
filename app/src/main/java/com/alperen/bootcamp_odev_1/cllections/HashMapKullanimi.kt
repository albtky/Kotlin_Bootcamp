package com.alperen.bootcamp_odev_1.cllections

fun main() {
    //dictionary

    val iller= HashMap<Int,String>()

    iller.put(16,"bursa")
    iller.put(34,"istanbul")
    iller[6]= "ankara"
    println(iller)

    println(iller.get(16))

    // güncelleme

    iller.put(16,"yeni bursa")
    println(iller)

    //boyut
    println(iller.size)
    //boşluk
    println(iller.isEmpty())

    //anahtar index gibi düşün
    for ((anahtar, deger)in iller  )
    {
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)




}