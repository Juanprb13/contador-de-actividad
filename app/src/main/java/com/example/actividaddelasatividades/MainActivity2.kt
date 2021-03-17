package com.example.actividaddelasatividades

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button : Button = findViewById<Button>(R.id.volver)
        button.setOnClickListener {
            finish()
        }
    }
}