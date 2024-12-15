package com.jalupriyangga.layoutandui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Button button:
        val button: Button = findViewById(R.id.buttonButton)
        var isClicked = false

        button.setOnClickListener {
            if (!isClicked) {
                Log.i("MainActivity", "Button clicked")
                button.text = "Clicked"
            } else {
                Log.i("MainActivity", "Button unClicked")
                button.text = "BUTTON"
            }
            isClicked = !isClicked
        }

    }
}

