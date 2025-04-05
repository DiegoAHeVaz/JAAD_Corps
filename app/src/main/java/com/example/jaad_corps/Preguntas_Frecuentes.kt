package com.example.jaad_corps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Preguntas_Frecuentes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preguntas_frecuentes)

        val regresar = findViewById<Button>(R.id.regresar)
        regresar.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val boton = findViewById<Button>(R.id.enviar)

        boton.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Gracias por tus comentarios, seguiremos mejorando la app en base a ellos")
                .setPositiveButton("Cerrar") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }

}
