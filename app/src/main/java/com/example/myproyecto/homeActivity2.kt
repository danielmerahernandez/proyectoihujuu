package com.example.myproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class homeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val persona = Persona()
        persona.nombre = "Marcos"
        persona.categoria = "diseño web"
        persona.edad = 26
        val gson = Gson()
        val json:String = gson.toJson(persona)

        Log.d("RESULTADO", json)
    }
}