@file:Suppress("ClassName")

package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class prem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prem)

        val buttonprem1 = findViewById<Button>(R.id.vstprm1)
        buttonprem1.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g951350-d10236387-Reviews-11_Flowers_Rooftop_Cafe-Vrindavan_Mathura_District_Uttar_Pradesh.html")

        startActivity(openURL)
        }
        val buttonprem2 = findViewById<Button>(R.id.vstprm2)
        buttonprem2.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Hotel_Review-g951350-d1754338-Reviews-MVT_Guesthouse_Restaurant-Vrindavan_Mathura_District_Uttar_Pradesh.html")
        startActivity(openURL)
        }
        val buttonprem3 = findViewById<Button>(R.id.vstprm3)
        buttonprem3.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g951350-d20348007-Reviews-Namaste_Restaurant_Vrindavan-Vrindavan_Mathura_District_Uttar_Pradesh.html")
        startActivity(openURL)
        }
        val buttonprem4 = findViewById<Button>(R.id.vstprm4)
        buttonprem4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g951350-d10789908-Reviews-56_Delight_s_Restaurant-Vrindavan_Mathura_District_Uttar_Pradesh.html")
        startActivity(openURL)
        }
    }
}