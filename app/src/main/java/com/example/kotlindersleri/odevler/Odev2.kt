package com.example.kotlindersleri.odevler

class Odev2 {

    //Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri
    //döndüren bir metod yazınız. Mile = Km x 0.621
    fun soru1(km:Double): Double{
        val sonuc = km * 0.621
        return sonuc
    }

    //Kenarları parametre olarak girilen ve dikdörtgenin alanını
    //hesaplayan bir metod yazınız
    fun soru2(uzunKenar: Int , kisaKenar: Int){
        println("Dikdörtgenin alanı : ${uzunKenar*kisaKenar}")
    }

    //Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri
    //döndüren metodu yazınız.
    fun soru3(fak: Int) : Int{
        var toplam = 1
        for (i in 1..fak){
            toplam *= i
        }
        return toplam
    }

    // Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu
    //gösteren bir metod yazınız.
    fun  soru4(kelime: String) {
        var sayac = 0

        for (i in kelime) {
            if (i == 'e') {
                sayac += 1
            }
        }
        println("$kelime kelimesinde toplamda $sayac tane 'e' harfi vardır.")
    }

    //Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod yazınız.
    //• İç açılar toplamı = ( (Kenar sayısı - 2) x 180 )
    fun soru5(kenarSayisi: Int) : Int{
        val icToplam = ( (kenarSayisi - 2 )* 180 )
        return icToplam
    }

    // Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
    //• 1 günde 8 saat çalışılabilir.
    //• Çalışma saat ücreti : 40 ₺
    //• Mesai saat ücreti : 80 ₺
    //• 150 saat üzeri mesai sayılır
    fun soru6(gun:Int):Int{

        if(gun > 150){
            val mesai = gun%150
            val toplamMaas = (150*40)+(mesai*80)
            return toplamMaas
        }
       else{
            val toplamMaas = (gun*40)
            return toplamMaas
        }

    }

    //Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu yazınız.

    //• 1 saat = 50 ₺
    //• 1 saat aşımından sonra her 1 saat , 10 ₺’dir
    fun soru7(saat:Int): Int{
        return (50 + (saat-1)*10 )

    }

}