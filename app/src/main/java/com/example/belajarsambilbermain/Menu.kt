package com.example.belajarsambilbermain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.R.layout.simple_list_item_1
//import android.widget.ArrayAdapter
//import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*
import android.content.Intent

class Menu : AppCompatActivity() {

    val id:Int = 10
    val language:String = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //button mengirim data
        btn_membaca.setOnClickListener() {
            intent = Intent(this, Membaca::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("languagge_value", language)
            startActivity(intent)
        }

        btn_menghitung.setOnClickListener() {
            intent = Intent(this, Menghitung::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("id_language", language)
            startActivity(intent)
        }

        btn_ing.setOnClickListener() {

        }

        btn_bernyanyi.setOnClickListener() {

        }

    }
}
