package com.example.rofiqul2612

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //instance
        val btnMore:Button = findViewById(R.id.buttonmore)
        val btnKid:Button = findViewById(R.id.buttonbookkid)

        //
        btnMore.setOnClickListener {
            val intent = Intent (this, AboutActivity::class.java)
            startActivity(intent)
        }

        btnKid.setOnClickListener {
            val intent = Intent (this, BookKidActivity::class.java)
            startActivity(intent)
        }
    }




}