package com.example.android20

import android.os.Bundle
import android.view.Menu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            return super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.custom_menu,menu)
            return true
        }
        }
    }
}