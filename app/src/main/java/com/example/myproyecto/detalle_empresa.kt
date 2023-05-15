package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton

class detalle_empresa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_empresa)
        val botonevenemp = findViewById<ImageButton>(R.id.btnevenemp)
        val botonevenempdos = findViewById<ImageButton>(R.id.btnevenempdos)

        // Agregar un OnClickListener al botón
        botonevenemp.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, elementos::class.java)
            startActivity(intent)





        }
        // Agregar un OnClickListener al botón
        botonevenempdos.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, detalle_evento::class.java)
            startActivity(intent)

        }

    }
}