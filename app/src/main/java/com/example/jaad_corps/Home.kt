package com.example.jaad_corps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.ActionBarDrawerToggle

class Home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var menuButton: Button

    @SuppressLint("SuspiciousIndentation", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)

        menuButton = findViewById(R.id.menu)
        menuButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        val regresar = findViewById<Button>(R.id.profile)
        regresar.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }
        val boton = findViewById<Button>(R.id.conocer)
        boton.setOnClickListener {
            val intent = Intent(this, NewsScreen::class.java)
            startActivity(intent)
        }
        val boton1 = findViewById<Button>(R.id.crear)
        boton1.setOnClickListener {
            val intent = Intent(this, Crear::class.java)
            startActivity(intent)
        }

        navigationView.setNavigationItemSelectedListener(this)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this, drawerLayout, R.string.openDrawer, R.string.closeDrawer
        )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_perfil -> {
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
            }
            R.id.nav_desarrolladores -> {
                val intent = Intent(this, Desarrolladores::class.java)
                startActivity(intent)
            }
            R.id.nav_preguntasfrec -> {
                val intent = Intent(this, Preguntas_Frecuentes::class.java)
                startActivity(intent)
            }
            R.id.nav_ayudaysopo -> {
                val intent = Intent(this, Problemas::class.java)
                startActivity(intent)
            }
            R.id.nav_creditos -> {
                val intent = Intent(this, Creditos::class.java)
                startActivity(intent)
            }
        }


        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
