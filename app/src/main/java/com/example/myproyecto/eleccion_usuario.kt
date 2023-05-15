package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class eleccion_usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleccion_usuario)
        val botonEmpresa = findViewById<ImageButton>(R.id.imageButtoneventoempresa3)
        val botonPersonacomun = findViewById<ImageButton>(R.id.imageButtoneventoempresa)
        val botonbuscaremp = findViewById<ImageButton>(R.id.buscarempresa)

        // Agregar un OnClickListener al botón
        botonEmpresa.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, empresa::class.java)
            startActivity(intent)

        }

        // Agregar un OnClickListener al botón
        botonPersonacomun.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, elementos::class.java)
            startActivity(intent)
        }

        // Agregar un OnClickListener al botón
        botonbuscaremp.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, ver_empresas::class.java)
            startActivity(intent)
        }
    }

}