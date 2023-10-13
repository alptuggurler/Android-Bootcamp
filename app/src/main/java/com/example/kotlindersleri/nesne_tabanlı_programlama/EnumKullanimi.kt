package com.example.kotlindersleri.nesne_tabanlı_programlama

fun main() {
    ucretHesaplama(124,KonserveBoyut.ORTA)
}
fun ucretHesaplama(adet:Int, boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet ${adet * 30} ₺")
        KonserveBoyut.ORTA -> println("Toplam Maliyet ${adet * 40} ₺")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet ${adet * 50} ₺")
    }
}