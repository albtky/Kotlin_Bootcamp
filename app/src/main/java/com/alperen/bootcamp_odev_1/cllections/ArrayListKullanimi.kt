package com.alperen.bootcamp_odev_1.cllections

fun main() {
    //tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //veri ekleme
    meyveler.add("elma")//0.
    meyveler.add("muz")//1.
    meyveler.add("kiraz")//2.

    println(meyveler)


    // güncelleme
    meyveler[1]= "yeni muz"
    println(meyveler)

    //Insert, içeriği ekleme
    // indexi kaydırıyor
    meyveler.add(1,"portakal")
    println(meyveler)

    // okuma
    print(meyveler[3])
    print(meyveler.get(3))
    //ikisi aynı şey

    println("boyut:${meyveler.size}")
    println("boyut:${meyveler.count()}")// arraylistin boyutu
    println("Boş kontrol:${meyveler.isEmpty()}")// boş mu dolu mu
    println("İçeririyor mu :${meyveler.contains("kiraz")}")

    meyveler.reverse()//terinse çevirme

    meyveler.sort()// string oldugu için harf sırasına göre sıraladı
    println(meyveler)

    for (meyve in meyveler)
    {
        println("sonuç ${meyve}")
    }
    for ((indeks,meyve) in meyveler.withIndex())
    // enumareted() iosta
    {
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)//2. indexteki elemanı siler
    println(meyveler)

    meyveler.clear()//içini boşaltma işlemi

    
}