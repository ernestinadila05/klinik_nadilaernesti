package com.nadila.klinik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    private lateinit var btnSignIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.txtSignUp)
        btnSignIn = findViewById(R.id.btnSignIn)
        txtSignUp.setOnClickListener() {
            val intent = Intent(this@PageLogin, PageRegister::class.java)
            startActivity(intent)
        }
        btnSignIn.setOnClickListener() {
            val intent = Intent(this@PageLogin, PageDoctors::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}