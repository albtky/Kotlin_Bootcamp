package com.alperen.bootcamp_odev_1.cllections

fun main() {
    val o1 = Ogrenciler(200,"zeynep","9c")
    val o2 = Ogrenciler(220,"alperen","3c")
    val o3 = Ogrenciler(203,"onur","1c")

    // ogrenciler classından nesneler var bu listede
    val ogrencilerListesi = ArrayList<Ogrenciler>()

    // 3 tane ogrenci nesnesi
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }

    // sıralama - Sort
    println("Sayısal :Küçükten > Büyüğe")
    // ASC : ascend deniyor
    val sıralama1 = ogrencilerListesi.sortedWith(compareBy{it.no})

    for (o in sıralama1)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }
    println("Sayısal :büyükten > küçüğe")
    // DESC: descend deniyor
    val sıralama2 = ogrencilerListesi.sortedWith(compareByDescending{it.no})

    for (o in sıralama2)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }

    println("Metinsel : küçükten > büyüğe")
    // ad'a göre küçükten büyüğe sıralama yapıyor
    val sıralama3 = ogrencilerListesi.sortedWith(compareByDescending{it.ad})

    for (o in sıralama3)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }

    println("Metinsel : büyükten > küçüğe")
    // ad'a göre büyükten küçüğe sıralama yapıyor
    val sıralama4 = ogrencilerListesi.sortedWith(compareByDescending{it.ad})

    for (o in sıralama4)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }

    // filtreleme

    println("Filtreleme 1 ")
    // numarası 150den büyük olanları verir
    val filtreleme1 = ogrencilerListesi.filter { it.no > 150  }
    for (o in filtreleme1)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }
    println("Filtreleme 2 ")
    // Ad içerisinde y olanları bana veriyor
    val filtreleme2 = ogrencilerListesi.filter { (it.ad).contains("y")   }
    for (o in filtreleme2)
    {
        println("No : ${o.no} - ad : ${o.ad} - sınıf : ${o.no}")
    }


}