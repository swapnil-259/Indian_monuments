package com.example.indian_monuments_task_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

@Suppress("ClassName")
class indiagate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indiagate)

        val buttonig1 = findViewById<Button>(R.id.vstig1)
        buttonig1.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/ShowUserReviews-g304551-d24132557-r881176547-Sababa_Cafe-New_Delhi_National_Capital_Territory_of_Delhi.html")
        startActivity(openURL)
        }

        val buttonig2 = findViewById<Button>(R.id.vstig2)
        buttonig2.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d8030329-Reviews-Asian_Haus-New_Delhi_National_Capital_Territory_of_Delhi.html")
            startActivity(openURL)
        }

        val buttonig3 = findViewById<Button>(R.id.vstig3)
        buttonig3.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g304551-d25100348-Reviews-Red_Breeks_Cafe-New_Delhi_National_Capital_Territory_of_Delhi.html")
            startActivity(openURL)
        }

        val buttonig4 = findViewById<Button>(R.id.vstig4)
        buttonig4.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304551-d12864171-Reviews-JUGGERNAUT-New_Delhi_National_Capital_Territory_of_Delhi.html")
            startActivity(openURL)

        }
    }
}
