package com.example.myproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class registro : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val txtnombre_nuevo : TextView = findViewById(R.id.edtNombre)
        val txtemail_nuevo: TextView = findViewById(R.id.edtEmail)
        val txtpassword1: TextView = findViewById(R.id.edtPassword)
        val txtpassword2: TextView = findViewById(R.id.edtPasswordnuevo2)
        val btncrear : Button = findViewById(R.id.btncrearcuentanueva)
        btncrear.setOnClickListener()
        {
            var pass1 = txtpassword1.text.toString()
            var pass2 = txtpassword2.text.toString()
            if (pass1.equals(pass2))
            {
               createAccount(txtemail_nuevo.text.toString(),txtpassword1.text.toString())
            }
            else
            {
                Toast.makeText(baseContext, "error: las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
                txtpassword1.requestFocus()
            }
        }





        firebaseAuth= Firebase.auth
    }
    private fun createAccount(email: String, password:String)
    {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){ task->
                if (task.isSuccessful)
                {
                    Toast.makeText(baseContext,"tu registro fue exitoso",Toast.LENGTH_SHORT).show()

                }
                else
                {
                    Toast.makeText(baseContext,"algo salio mal, Error:" + task.exception, Toast.LENGTH_SHORT).show()
                }
            }
    }
}