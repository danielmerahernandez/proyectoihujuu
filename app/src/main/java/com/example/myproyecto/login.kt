package com.example.myproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class login : AppCompatActivity() {
  private lateinit var firebaseAuth: FirebaseAuth
  private lateinit var authStateListener: FirebaseAuth

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    val btnlogin: Button = findViewById(R.id.loginbutton)
    val txtEmail: TextView = findViewById<TextView>(R.id.email)
    val txtPassword: TextView = findViewById(R.id.password)
    val btncrear_CuentaNueva : TextView = findViewById(R.id.btncrearcuentanueva1)
    val btnRecordar: TextView = findViewById(R.id.btnOlvidar)

    firebaseAuth=Firebase.auth
    btnlogin.setOnClickListener()
    {
      signIn(txtEmail.toString(),txtPassword.toString())
      val intent = Intent(applicationContext,homeActivity2::class.java).apply {}
      startActivity(intent)
    }
    btncrear_CuentaNueva.setOnClickListener()
    {
      val i = Intent(this,registro::class.java)
      startActivity(i)
    }
    btnRecordar.setOnClickListener()
    {
      val i = Intent(this,recordarpassactivity::class.java)
      startActivity(i)
    }

  }
  private fun signIn(email: String, password: String)
  {
    firebaseAuth.signInWithEmailAndPassword(email, password)
      .addOnCompleteListener(this) { task ->
        if (task.isSuccessful) {
          val user = firebaseAuth.currentUser
          Toast.makeText(baseContext, user?.uid.toString(), Toast.LENGTH_SHORT).show()
          //ir a la segunda acivity
        } else {
          Toast.makeText(baseContext,"error de email y/o contraseña",Toast.LENGTH_SHORT)
            .show()
        }
      }
  }}











