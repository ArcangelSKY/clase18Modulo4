package com.example.clase18modulo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val activity2 = Intent(this, MainActivity2::class.java)
            startActivity(activity2)

        }
    }
}