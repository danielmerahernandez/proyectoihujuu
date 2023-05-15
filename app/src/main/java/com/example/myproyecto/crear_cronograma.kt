package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class crear_cronograma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cronograma)
        val btncrearcrono = findViewById<Button>(R.id.btncrono)

        // Agregar un OnClickListener al botón
        btncrearcrono.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, cronograma::class.java)
            startActivity(intent)

        }
    }
}