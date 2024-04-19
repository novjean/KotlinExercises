package com.novatech.kotlinexercises

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val tv : TextView = findViewById(R.id.tv100)
//        tv.setText("this is the updated text")

        val et : EditText = findViewById(R.id.et1)
        // alternate way of finding view
//        val ett = findViewById<EditText>(R.id.et1)

        // getting input from edittext
        val edittextInput = et.text

        val button : Button = findViewById(R.id.btn1)
        button.setOnClickListener(){
            // execute this code
            Toast.makeText(this@MainActivity,
                "" + edittextInput,
                Toast.LENGTH_LONG).show()
        }

        val imageview = findViewById<ImageView>(R.id.iv1)

        // use this to change image resource
//        imageview.setImageResource(R.drawable.newImage)


    }
}