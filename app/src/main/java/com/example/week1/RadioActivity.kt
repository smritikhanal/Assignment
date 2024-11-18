package com.example.week1

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var Apple : RadioButton
    lateinit var Kiwi : RadioButton
    lateinit var Strawberry : RadioButton
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        Apple = findViewById(R.id.radioApple)
        Kiwi = findViewById(R.id.radioKiwi)
        Strawberry = findViewById(R.id.radioStrawberry)

        Apple.setOnClickListener{
            image.setImageResource(R.drawable.apple)
        }
        Kiwi.setOnClickListener{
            image.setImageResource(R.drawable.kiwi)
        }
        Strawberry.setOnClickListener{
            image.setImageResource(R.drawable.strawberry)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}