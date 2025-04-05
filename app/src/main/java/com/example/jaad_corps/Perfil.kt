package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Perfil : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_screen)

        val boton = findViewById<Button>(R.id.regreso)
        boton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val boton1 = findViewById<Button>(R.id.salir)
        boton1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}