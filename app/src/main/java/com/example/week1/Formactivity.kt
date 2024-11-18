package com.example.week1

import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formactivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var button: Button
    lateinit var display: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formactivity)

        name = findViewById(R.id.editName)
        button = findViewById(R.id.Submit)
        display = findViewById(R.id.textView)

        button.setOnClickListener {
            var data : String = name.text.toString()

            display.text = data

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}