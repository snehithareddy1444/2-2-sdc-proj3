package com.example.experiment3
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Three : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.three)

        val h = findViewById<Button>(R.id.home)
        h.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

