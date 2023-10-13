package com.example.kotlindersleri.nesne_tabanlı_programlama.paket2

import com.example.kotlindersleri.nesne_tabanlı_programlama.paket1.A

class B: A() {

    fun fonksiyon(){
       // val nesne = A()
       // println(nesne.publicDegisken)
       // println(nesne.internalDegisken)
        //println(nesne.varsayilanDegisken)
        println(protectedDegisken)
        println(internalDegisken)
        println(varsayilanDegisken)
        println(protectedDegisken)
        fonksiyon1()
    }

}