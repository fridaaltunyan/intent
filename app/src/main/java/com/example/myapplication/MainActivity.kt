package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myEmail = findViewById<EditText>(R.id.email)
        val myName = findViewById<EditText>(R.id.name)
        val mySame = findViewById<EditText>(R.id.surname)
        val myPh = findViewById<EditText>(R.id.phone)
        val myFbt = findViewById<Button>(R.id.butfir)
        myFbt.setOnClickListener {
            val message = myPh.text
            val mail = myEmail.text
            val intent = Intent(this,Secondactivity::class.java)
            intent.putExtra("number","$message")
            intent.putExtra("email","$mail")
            startActivity(intent)
        }

    }
}
