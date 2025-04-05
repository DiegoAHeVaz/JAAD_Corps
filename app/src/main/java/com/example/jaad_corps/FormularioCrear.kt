package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class FormularioCrear : AppCompatActivity(){

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulariocrear)

        val regresar = findViewById<Button>(R.id.regresar)
        regresar.setOnClickListener {
            val intent = Intent(this, Crear::class.java)
            startActivity(intent)
        }
        val boton = findViewById<Button>(R.id.enviar)

        boton.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Hemos recibido tu pedido, estara listo en 1 mes")
                .setPositiveButton("Ok") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }
}


