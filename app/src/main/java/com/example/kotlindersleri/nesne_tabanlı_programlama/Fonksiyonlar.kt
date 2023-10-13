package com.example.kotlindersleri.nesne_tabanlı_programlama

class Fonksiyonlar {
    //void geri dönüşü olmayan fonks
    fun selamla1(){
        val sonuc = "Merhaba Ali"
        println(sonuc)
    }

    fun selamla2() :String{
        val sonuc = "Merhaba Ali"
        return  sonuc
    }

    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(x: Int, y: Int): Int {
        val toplam = x+y
        return  toplam
    }
    //overloading
    fun carp(sayi1:Int,sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Int,sayi2:Double){
        println("Çarpma : ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2:Double){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1:Int,sayi2:Int,sayi3:Int){
        println("Çarpma : ${sayi1*sayi2*sayi3}")
    }
}