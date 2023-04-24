@file:Suppress("ClassName")

package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class jagan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jagan)

        val buttonjag1 = findViewById<Button>(R.id.vstjag1)
        buttonjag1.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g503703-d15201251-Reviews-Food_Court-Puri_Puri_District_Odisha.html")
        startActivity(openURL)
        }

        val buttonjag2 = findViewById<Button>(R.id.vstjag2)
        buttonjag2.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g503703-d8587030-Reviews-The_Grand_Regency-Puri_Puri_District_Odisha.html")
        startActivity(openURL)
        }

        val buttonjag3 = findViewById<Button>(R.id.vstjag3)
        buttonjag3.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g503703-d9711087-Reviews-Hare_Krishna-Puri_Puri_District_Odisha.html")
        startActivity(openURL)
        }

        val buttonjag4 = findViewById<Button>(R.id.vstjag4)
        buttonjag4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g503703-d1200970-Reviews-Chung_Wah_Restaurant-Puri_Puri_District_Odisha.html")
        startActivity(openURL)
        }
    }

}