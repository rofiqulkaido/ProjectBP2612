package com.example.rofiqul2612

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.username)
        val txtPassword:EditText = findViewById(R.id.password)
        val logModel = LoginModel()


        //event
        btnLogin.setOnClickListener {
            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validasi login
            if(logModel.loginCheck() == true ){
                //call home activity
                val intentHome = Intent(this,HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}