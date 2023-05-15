package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class cronograma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cronograma)
        val btncroenero = findViewById<ImageButton>(R.id.boton_cronograma_enero)
        val añadircro = findViewById<Button>(R.id.añadircrono)

        // Agregar un OnClickListener al botón
        btncroenero.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, eventos_enero::class.java)
            startActivity(intent)
        }
        // Agregar un OnClickListener al botón
        añadircro.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, crear_cronograma::class.java)
            startActivity(intent)
        }
    }
}