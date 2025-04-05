package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Crear : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crearscreen)

        val regresar = findViewById<Button>(R.id.regresar)
            regresar.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        val perfilion = findViewById<Button>(R.id.profile)
        perfilion.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }

        val conocer = findViewById<Button>(R.id.conocer)
         conocer.setOnClickListener {
            val intent = Intent(this, FormularioCrear::class.java)
            startActivity(intent)
        }

        val no = findViewById<Button>(R.id.no)
        no.setOnClickListener {
            val intent = Intent(this, FormularioCrear::class.java)
            startActivity(intent)
        }

        val cae = findViewById<Button>(R.id.cae)
        cae.setOnClickListener {
            val intent = Intent(this, FormularioCrear::class.java)
            startActivity(intent)
        }

    }

    }
