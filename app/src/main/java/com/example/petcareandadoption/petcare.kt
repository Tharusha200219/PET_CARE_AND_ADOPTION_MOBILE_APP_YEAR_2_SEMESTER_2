package com.example.petcareandadoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class petcare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petcare)

        val secbutton = findViewById<Button>(R.id.petcare)
        secbutton.setOnClickListener {
            val intent = Intent(this, petcare::class.java)
            startActivity(intent)
            finish()
        }

        val secbutton2 = findViewById<Button>(R.id.category)
        secbutton2.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
            finish()
        }

        val secbutton3 = findViewById<Button>(R.id.profile)
        secbutton3.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
            finish()
        }

        val secbutton4 = findViewById<Button>(R.id.home)
        secbutton4.setOnClickListener {
            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
            finish()
        }
    }
}
