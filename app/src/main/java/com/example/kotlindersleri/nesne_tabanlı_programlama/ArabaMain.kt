package com.example.kotlindersleri.nesne_tabanlı_programlama

fun main() {
    //Nesene oluşturma

    val bmw = Araba("Kırmızı",0,false)

    //okuma
    //bmw.bilgiAl()

    //veri atama
    bmw.renk = "Mavi"
    bmw.hiz = 12
    bmw.calisiyormu = true
    //bmw.bilgiAl()
   // bmw.durdur()
    //bmw.bilgiAl()

    val sahin = Araba("Beyaz",100,true)
    sahin.bilgiAl()
   // sahin.durdur()
    sahin.hizlan(100)
    sahin.bilgiAl()
    sahin.yavasla(150)
    sahin.bilgiAl()

}