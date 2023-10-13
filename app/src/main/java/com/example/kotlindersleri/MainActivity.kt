package com.example.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var str1 : String? = null
    lateinit var str2:String // lateinit val ile kullanılmaz ; çükü lateinit daha sonra değer atıyacağım demek
    //lateinit var sayi:Int //  int larla kullanılmaz
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        str2 = "Merhaba"
    }
}