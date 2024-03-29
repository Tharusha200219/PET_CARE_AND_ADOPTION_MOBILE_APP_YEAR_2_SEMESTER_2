package com.example.petcareandadoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

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
        val secbutton4 = findViewById<LinearLayout>(R.id.backgroun_gradient)
        secbutton3.setOnClickListener {
            val intent = Intent(this, home2::class.java)
            startActivity(intent)
            finish()
        }

    }
}
