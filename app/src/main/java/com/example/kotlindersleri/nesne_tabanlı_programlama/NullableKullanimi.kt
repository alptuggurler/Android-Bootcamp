package com.example.kotlindersleri.nesne_tabanlı_programlama

fun main() {
    //Nullable - Null safety - Optional(Switf)
    var x = "Merhaba"

    //Tanımlama
    var str:String? = null

    str = " merhaba "
    //Yöntem 1
    println("Yööntem 1 : ${str?.trim()}")

    //Yöntem 2
    //println("Yööntem 2 : ${str!!.trim()}")

    //Yöntem 3

    if (str != null){
        println("Yööntem 3: ${str.trim()}")
    }else{
        println("Sonuç Null")
    }
    //yöntem 4
    str?.let {
        println("Yööntem 4: ${it.trim()}")
    }
}