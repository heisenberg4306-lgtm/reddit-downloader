package com.example.redditdownloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subredditInput = findViewById<EditText>(R.id.subreddit_input)
        val downloadButton = findViewById<Button>(R.id.download_button)
        val statusText = findViewById<TextView>(R.id.status_text)

        downloadButton.setOnClickListener {
            val subreddit = subredditInput.text.toString()
            if (subreddit.isNotEmpty()) {
                statusText.text = "Downloading from r/$subreddit..."
            } else {
                statusText.text = "Please enter a subreddit name"
            }
        }
    }
}