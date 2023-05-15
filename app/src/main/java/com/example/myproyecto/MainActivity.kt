package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val persona = Persona()
       persona.nombre = "Marcos"
       persona.categoria = "diseño web"
        persona.edad = 26
        val gson = Gson()
        val json:String = gson.toJson(persona)

        Log.d("RESULTADO", json )

       startTimer()
    }

  fun startTimer() {
        object: CountDownTimer(3000,1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(applicationContext, login::class.java).apply { }
                startActivity(intent)
            }


        }.start()


    }


}
