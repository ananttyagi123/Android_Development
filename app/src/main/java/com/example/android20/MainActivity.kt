package com.example.android20

import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true


        //  menuInflater.inflate()
        // it allows you to create menu or list of items
        // R.custom_menu.menu is the custom_menu.xml file  then it connects sto the kt file
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Search -> {
                Toast.makeText(this, "Search is Selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.Whatsapp -> {
                Toast.makeText(this, "WhatsApp is Selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.Facebook -> {
                Toast.makeText(this, "Facebook is Selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.Instagram -> {
                Toast.makeText(this, "Instagram is Selected", Toast.LENGTH_SHORT).show()
                return true
            }

            else->super.onOptionsItemSelected(item)
        }
    }
}

