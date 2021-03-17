package com.example.actividaddelasatividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador  = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById<Button>(R.id.dirigir)
        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        val text_view : TextView = findViewById(R.id.textView)
        contador++
        text_view.text = contador.toString()
        println("***********************************************************"+contador)
    }

    override fun onDestroy() {
        super.onDestroy()
        contador = contador
    }



}
