package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class crear_evento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_evento)
        val botonguardar = findViewById<Button>(R.id.boton_guardar_evento)
        val botoncancelar = findViewById<Button>(R.id.boton_cancelar)

        // Agregar un OnClickListener al botón
        botonguardar.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, elementos::class.java)
            startActivity(intent)


        }
        // Agregar un OnClickListener al botón
        botoncancelar.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, empresa::class.java)
            startActivity(intent)
        }
    }
}