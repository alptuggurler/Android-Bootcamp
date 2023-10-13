package com.example.kotlindersleri.degiskenler

class DegiskenOlusturma {
}

fun main() {
    //Bir	öğrencinin	adını	,yaşını ,boyunu ve	adının	baş
    //harfininin tutulduğu	değişken	oluşturunuz
    var studentName : String = "Alptug"
    var studentAge : Int = 23
    var studentBoy : Double = 1.65
    var studentFirstLather : Char = 'A'
    var studentDevamDurumu : Boolean = true

    println(studentName)
    println(studentAge)
    println(studentBoy)
    println(studentFirstLather)
    println(studentDevamDurumu)

    var urun_id : Int = 3416
    var urun_adi : String = "Macbook Pro"
    var  urun_adet : Int = 100
    var urun_fiyati : Int = 42999
    var urun_tedarikcisi : String = "Apple"

    println("Ürün id : $urun_id ")
    println("Ürün adi : $urun_adi")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyati $")
    println("Ürün tedarikcisi : $urun_tedarikcisi")


    var a = 10
    var b = 20

    println(" $a x $b : ${a*b}")

    //Sabitler - Constant
    //val(kotlin)
    var sayi = 30
    sayi = 100
    println(sayi)

    val numara = 40 // tanimlandiktan sonra degistirilemez
    println(numara)


    // tur donusumu
    val i = 42
    val d = 78.95

    //Sayısaldan sayısala Dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //Sayısaldan metine
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()

    println(sonuc3)
    println(sonuc4)

    // metinden sayısaya dönüşüm
    val yazi = "62.26"
    val sonuc5 = yazi.toDoubleOrNull()
    if(sonuc5 != null)
    {
        println(sonuc5)
    }else{
        println("Hatali Sayi")
    }
   sonuc5?.let {
       println(it)
   }
}