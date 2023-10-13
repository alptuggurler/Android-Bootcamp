package com.example.kotlindersleri.nesne_tabanlı_programlama

fun main() {
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen sonuc : $gelenSonuc")

    f.selamla3("Alp")

    val gelenToplam = f.toplama(5,23)
    println(gelenToplam)

    f.carp(1,2,3)
}