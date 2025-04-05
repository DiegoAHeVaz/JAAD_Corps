package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewsScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_screen)

        val regresar = findViewById<Button>(R.id.regresar)
        regresar.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val perfilon = findViewById<Button>(R.id.profile)
        perfilon.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }

    }

}