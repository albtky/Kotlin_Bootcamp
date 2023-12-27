package com.alperen.bootcamp_odev_1.interface_kullanimi

class ClassA: MyInterface {

    // İnterface birden fazla classta kullanılabilir
    // bir class birden fazla interface alabilir
    override val degisken: Int= 10
    override fun metdo1() {
        println("metod 1 çalıştı")

    }
    override fun metod2(): String {
        return "metod 2 çalıştı"
    }
}