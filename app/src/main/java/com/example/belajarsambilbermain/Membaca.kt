package com.example.belajarsambilbermain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_membaca.*

class Membaca : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membaca)

        val bundle:Bundle = intent.extras
        val id = bundle.get("id_value")
        val language = bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG).show()

        btn_kembali.setOnClickListener(){
            intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }
    }
}
