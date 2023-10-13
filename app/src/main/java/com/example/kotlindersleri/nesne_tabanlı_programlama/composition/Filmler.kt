package com.example.kotlindersleri.nesne_tabanlı_programlama.composition

data class Filmler (val film_id:Int,
                    val film_ad:String,
                    var film_yil:Int,
                    var kategori:Kategoriler,
                    var yonetmen:Yonetmenler){

}