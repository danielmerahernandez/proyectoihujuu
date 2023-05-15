package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class elementos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elementos)
        val btndetallesevento = findViewById<Button>(R.id.detalle)
        val botoncronograma = findViewById<Button>(R.id.cronogramabtn)

        // Agregar un OnClickListener al botón
        botoncronograma.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, cronograma::class.java)
            startActivity(intent)

        }

        // Agregar un OnClickListener al botón
        btndetallesevento.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, detalle_evento::class.java)
            startActivity(intent)
        }
    }
}