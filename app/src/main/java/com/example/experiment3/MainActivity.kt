package com.example.experiment3
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = findViewById<Button>(R.id.bt1)
        val y = findViewById<Button>(R.id.bt2)
        val z = findViewById<Button>(R.id.bt3)

        x.setOnClickListener {
            startActivity(Intent(this, One::class.java))
        }
        y.setOnClickListener {
            startActivity(Intent(this, Two::class.java))
        }
        z.setOnClickListener {
            startActivity(Intent(this, Three::class.java))
        }
    }
}
