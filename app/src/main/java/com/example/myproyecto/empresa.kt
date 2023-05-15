package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class empresa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empresa)
        val botonañadirevento = findViewById<Button>(R.id.buttonañadirevento)
        val botonvermas = findViewById<Button>(R.id.buttondetalleevento)

        // Agregar un OnClickListener al botón
        botonañadirevento.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, crear_evento::class.java)
            startActivity(intent)





        }
        // Agregar un OnClickListener al botón
        botonvermas.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, detalle_evento::class.java)
            startActivity(intent)

        }
    }
}