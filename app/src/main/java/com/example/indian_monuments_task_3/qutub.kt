@file:Suppress("ClassName")

package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class qutub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qutub)

        val buttonqtb1 = findViewById<Button>(R.id.vstqtb1)
        buttonqtb1.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d945697-Reviews-Olive_Bar_Kitchen-New_Delhi_National_Capital_Territory_of_Delhi.html")

            startActivity(openURL)
        }
        val buttonqtb2= findViewById<Button>(R.id.vstqtb2)
        buttonqtb2.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d7342485-Reviews-Dramz-New_Delhi_National_Capital_Territory_of_Delhi.html")

            startActivity(openURL)
        }
        val buttonqtb3 = findViewById<Button>(R.id.vstqtb3)
        buttonqtb3.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d13958283-Reviews-Bo_Tai_Qutub-New_Delhi_National_Capital_Territory_of_Delhi.html")
        startActivity(openURL)
        }
        val buttonqtb4 = findViewById<Button>(R.id.vstqtb4)
        buttonqtb4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d8602560-Reviews-Lavaash_by_Saby-New_Delhi_National_Capital_Territory_of_Delhi.html")
        startActivity(openURL)
        }
    }

}