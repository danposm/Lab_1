package com.example.lab_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val changeTextButton = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)


        changeTextButton.setOnClickListener {
            text.text = "Button clicked!"
        }
    }
}