package com.alperen.bootcamp_odev_1.cllections

fun main() {
    // içeriğini karıştırıyor
    val meyveler = HashSet<String>()
    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("kiraz")

    println(meyveler)

    // aynı veriyi tekrar kaydetmiyor
    meyveler.add("elma")
    println(meyveler)

    // 1. indexteki veriyi bana verir
    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())// boş mu değil mi

    for (n in meyveler)
    {
        println("SOnuç : $n")
    }
    for ((i,n)  in meyveler.withIndex())
    {
        println("$i. : $n")
    }

    //içerik bazlı temizleme
    meyveler.remove("elma")

    // içeriği temizleme

    meyveler.clear()




}