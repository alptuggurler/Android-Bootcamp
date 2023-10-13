package com.example.kotlindersleri.nesne_tabanlı_programlama

data class Araba(var renk:String , var hiz:Int ,var calisiyormu : Boolean ) {
    init {// bir classdan nesne oluşturdunda çalışan kod
        println("******Constructor çalıştı*****")
    }

    fun calistir(){
        calisiyormu = true
        hiz = 5
    }
    fun durdur(){
        calisiyormu = false
        hiz = 0
    }
    fun hizlan(kacKM:Int){
        hiz += kacKM

    }
    fun yavasla(kacKM:Int){
        hiz -= kacKM
    }
    fun bilgiAl(){

        println("Renk ${renk}")
        println("Renk ${hiz}")
        println("Renk ${calisiyormu}")
        println("-----------------")

        //this veya self(swift)
        // super
    }

}