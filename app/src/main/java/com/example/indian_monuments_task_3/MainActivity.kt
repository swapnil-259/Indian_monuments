package com.example.indian_monuments_task_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener{
            val  intent = Intent(this,taj::class.java)
            startActivity(intent)

        }
        val button2 = findViewById<Button>(R.id.btn2)
        button2.setOnClickListener{
            val intent = Intent(this,qutub::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.btn3)
        button3.setOnClickListener{
            val intent= Intent(this,prem::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<Button>(R.id.btn4)
        button4.setOnClickListener{
            val intent= Intent(this,vaishno::class.java)
            startActivity(intent)
        }
        val button5= findViewById<Button>(R.id.btn5)
        button5.setOnClickListener{
            val intent= Intent(this,jagan::class.java)
            startActivity(intent)
        }
        val button6 = findViewById<Button>(R.id.btn6)
        button6.setOnClickListener{
            val intent= Intent(this,indiagate::class.java)
            startActivity(intent)
        }



    }
}