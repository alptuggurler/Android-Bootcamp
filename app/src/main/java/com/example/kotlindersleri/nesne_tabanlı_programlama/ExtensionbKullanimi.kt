package com.example.kotlindersleri.nesne_tabanlı_programlama

fun main() {
    val sonuc = 5.carpi(2)
    println(sonuc)
}


fun Int.carpi(sayi:Int): Int{
    return this * sayi
}