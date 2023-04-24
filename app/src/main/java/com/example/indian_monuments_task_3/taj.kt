@file:Suppress("ClassName")

package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class taj : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taj)

        val buttontaj1 = findViewById<Button>(R.id.vsttaj1)
        buttontaj1.setOnClickListener{
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297683-d804436-Reviews-Joney_s_Place-Agra_Agra_District_Uttar_Pradesh.html")

            startActivity(openURL)
        }

        val buttontaj2 = findViewById<Button>(R.id.vsttaj2)
        buttontaj2.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
                openURL.data=Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297683-d7236058-Reviews-Treat_Restaurant-Agra_Agra_District_Uttar_Pradesh.html")

            startActivity(openURL)

        }
        val buttontaj3 = findViewById<Button>(R.id.vsttaj3)
        buttontaj3.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data=Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297683-d9817562-Reviews-Yes_Restaurant-Agra_Agra_District_Uttar_Pradesh.html")

            startActivity(openURL)
        }
        val buttontaj4 = findViewById<Button>(R.id.vsttaj4)
        buttontaj4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297683-d14093495-Reviews-25_Hours_Hangout_Cafe-Agra_Agra_District_Uttar_Pradesh.html")

            startActivity(openURL)
        }
    }
}