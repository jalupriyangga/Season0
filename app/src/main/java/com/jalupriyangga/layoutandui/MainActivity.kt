package com.jalupriyangga.layoutandui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        val titleTextView : TextView = findViewById(R.id.titleTextView)
        val subtitleTextView : TextView = findViewById(R.id.subtitleTextView)

        val learnMoreButton : Button = findViewById(R.id.learnMoreButton)
        learnMoreButton.setOnClickListener {
            // TODO: Navigate main activity to detailed activity
            Log.d("MainActivity", "Learn more button clicked")
            val title = titleTextView.text
            val intent : Intent = Intent(it.context, DetailedActivity::class.java)
            intent.putExtra("title", title)
            startActivity(intent)
        }
    }
}

