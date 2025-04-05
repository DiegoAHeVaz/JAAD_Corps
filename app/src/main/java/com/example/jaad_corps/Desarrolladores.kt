package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Desarrolladores : AppCompatActivity() {
        @SuppressLint("SuspiciousIndentation", "CutPasteId", "MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.desarrolladores)

            val boton = findViewById<Button>(R.id.regreso)
            boton.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }
}