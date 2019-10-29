package com.example.responsi309

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        val btn=findViewById<Button>(R.id.btnlogin)
        var intent=intent
        val nama=intent.getStringExtra("nama")
        val email=intent.getStringExtra("email")
        val password=intent.getStringExtra("password")
        val alamat=intent.getStringExtra("alamat")
        val nohandaphone=intent.getStringExtra("nohandphone")

        btn.setOnClickListener {
            intent= Intent(this@Preview,MainActivity::class.java)

            startActivity(intent)
        }
        val hasilpreview =findViewById<TextView>(R.id.hasilpreview)
        hasilpreview.text="Nama : "+nama+"\nEmail : "+email+"\nPassword : "+password+"\nAlamat : "+alamat+"\nNo Handphone : "+nohandaphone

    }
}