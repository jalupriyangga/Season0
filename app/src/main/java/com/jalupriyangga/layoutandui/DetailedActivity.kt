package com.jalupriyangga.layoutandui

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_detailed)

        val titleFromOtherAcctivity = intent.getStringExtra("title") ?: "No title"
        val textView : TextView = findViewById(R.id.textView)
        textView.text = titleFromOtherAcctivity
    }
}