package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class Secondactivity: MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondlayout)
        val butCall = findViewById<Button>(R.id.butphon)
        val butEmail = findViewById<Button>(R.id.butmail)
        val buCam = findViewById<Button>(R.id.butcam)
        val message2 = intent.getStringExtra("number")
        val message3 = intent.getStringExtra("email")
        butCall.setOnClickListener {

            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$message2"))
            startActivity(intent)

        }
        buCam.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }
        butEmail.setOnClickListener {
            val emailIntent = Intent()
            emailIntent.type ="text/html"
            emailIntent.action=Intent.ACTION_SEND
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"My first  share")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"message")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "$message3")
            startActivity(Intent.createChooser(emailIntent,"Test"))

        }

    }
    }


