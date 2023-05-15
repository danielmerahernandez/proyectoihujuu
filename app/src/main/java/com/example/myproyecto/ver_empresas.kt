package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ver_empresas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_empresas)
        val botonempcomfa= findViewById<ImageButton>(R.id.boton_empresa_comfa)

        // Agregar un OnClickListener al botón
        botonempcomfa.setOnClickListener {
            // Lanzar la actividad activity_elementos
            val intent = Intent(this, detalle_empresa::class.java)
            startActivity(intent)

        }
    }
}