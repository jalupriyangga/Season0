package com.jalupriyangga.layoutandui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

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

        //Inputtext
        val inputEditText: EditText = findViewById(R.id.inputEditText)


        // Button button:
        val button: Button = findViewById(R.id.buttonButton)
        var isClicked = false

        button.setOnClickListener {
            val input = inputEditText.text.toString()
            if (!isClicked) {
                Log.i("MainActivity", input)
                Log.i("MainActivity", "Button clicked")
                button.text = "Clicked"
                Toast.makeText(it.context, input, Toast.LENGTH_SHORT).show()
                Snackbar.make(it, input, Snackbar.LENGTH_SHORT).show()
            } else {
                Log.i("MainActivity", "Button unClicked")
                button.text = "BUTTON"
            }
            isClicked = !isClicked
        }

    }
}

