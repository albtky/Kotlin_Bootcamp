package com.alperen.bootcamp_odev_1.standart_programlama

fun main() {

    println(ConvertKm(200))
    println("****************")
    println(DikdörtgenAlan(2, 3))
    println("****************")
    println(Faktoriyel(20))
    println("****************")
    println("Kelimenin içindeki 'e' sayısı : ${E_Sayısı("Alperens")}")
    println("****************")
    println(İçAçı(3))
    println("****************")
    println("otopark ücreti: ${otoparkUcret(0.5)}")


}

fun otoparkUcret(süre: Double): Double {
    var ücret = 0.0
    if (süre > 1)
        ücret += 50 + (süre - 1) * 10

    else
        ücret = 50.0
    return ücret

}

fun İçAçı(kenarSayısı: Int): Int {
    return ((kenarSayısı - 2) * 180) / kenarSayısı
}

fun ConvertKm(mesafe: Int): Double {
    val sonuc = mesafe * 0.621
    return sonuc
}

fun DikdörtgenAlan(kısaKenar: Int, uzunKenar: Int): Int {
    val alan = 2 * (kısaKenar + uzunKenar)
    return alan
}

fun Faktoriyel(sayı: Int): Int {
    var sonuc = 0
    for (i in sayı..1) {
        sonuc += i
    }
    return sonuc
}

fun E_Sayısı(kelime: String): Int {
    var a = 0
    for (i in kelime) {
        if (i == 'e' || i == 'E') {
            a++
        }
    }
    return a
}


