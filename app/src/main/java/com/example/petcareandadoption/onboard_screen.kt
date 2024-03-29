package com.example.petcareandadoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen)

        val secbutton = findViewById<Button> (R.id.onb2)
        secbutton.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)
            finish()
        }

    }
}