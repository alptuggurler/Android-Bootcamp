package com.example.kotlindersleri.odevler

fun main() {

    val o2 = Odev2()
    val sonuc1 = o2.soru1(5.0)
    println(sonuc1)

    o2.soru2(5,7)

    val sonuc3 =o2.soru3(5)
    println(sonuc3)

    o2.soru4("deneme")


    println("İç Açılar toplamı ${ o2.soru5(6)}.")


    println("Toplam maas ${o2.soru6(160)}")

    println("Toplam fiyat ${o2.soru7(0)}")
}