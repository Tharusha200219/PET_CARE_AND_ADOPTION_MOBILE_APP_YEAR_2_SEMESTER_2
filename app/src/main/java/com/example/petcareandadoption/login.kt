package com.example.petcareandadoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val secbutton = findViewById<Button> (R.id.login)
        secbutton.setOnClickListener{
            val intent = Intent(this,Home_page::class.java)
            startActivity(intent)
            finish()
        }
    }
}