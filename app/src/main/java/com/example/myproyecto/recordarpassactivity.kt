package com.example.myproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class recordarpassactivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recordarpassactivity)
        val txtmail : TextView = findViewById(R.id.txtEmailcambio)
        val btnCambiar : Button = findViewById(R.id.botonCambio)
        btnCambiar.setOnClickListener()
        {
            sendPasswordReset(txtmail.text.toString())

        }


        firebaseAuth= Firebase.auth

    }

    private fun sendPasswordReset (email: String)
    {
     firebaseAuth.sendPasswordResetEmail(email)
         .addOnCompleteListener(){ task ->
             if (task.isSuccessful)
             {
               Toast.makeText(baseContext,"verifique el estado de su nueva contraseña en el correo", Toast.LENGTH_SHORT).show()
             }
             else
             {
                 Toast.makeText(baseContext,"error no se pudo completar el proceso", Toast.LENGTH_SHORT).show()
             }
         }

    }
}