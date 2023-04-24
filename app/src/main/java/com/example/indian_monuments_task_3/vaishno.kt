@file:Suppress("ClassName")

package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vaishno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaishno)

        val buttonmaa1 = findViewById<Button>(R.id.vstmaa1)
        buttonmaa1.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g297620-d6788181-Reviews-McDonald_s-Jammu_City_Jammu_District_Jammu_Jammu_and_Kashmir.html")
        startActivity(openURL)
        }
        val buttonmaa2 = findViewById<Button>(R.id.vstmaa2)
        buttonmaa2.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297620-d10762804-Reviews-Blue_Coriander_The_Restaurant-Jammu_City_Jammu_District_Jammu_Jammu_and_Kashmir.html")
        startActivity(openURL)
        }

        val buttonmaa3 = findViewById<Button>(R.id.vstmaa3)
        buttonmaa3.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297620-d10763231-Reviews-The_LimeTree-Jammu_City_Jammu_District_Jammu_Jammu_and_Kashmir.html")

        startActivity(openURL)
        }

        val buttonmaa4 = findViewById<Button>(R.id.vstmaa4)
        buttonmaa4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g297623-d12880623-Reviews-Earthen_Oven_Restaurant-Srinagar_Srinagar_District_Kashmir_Jammu_and_Kashmir.html")
        startActivity(openURL)
        }
    }


}