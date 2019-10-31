package com.example.responsi_149

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            if (email.text.toString() == "obitagnio@gmail.com" || password.text.toString() == "kepobangetsih123") {
                intent = Intent(this, Home::class.java)
            }
            else {
                Toast.makeText(getApplicationContext(), "Email koe salah cuk", Toast.LENGTH_LONG).show()
            }
            startActivity(intent)

        }
    }
}