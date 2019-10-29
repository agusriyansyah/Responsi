package com.example.responsi309

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama=findViewById<EditText>(R.id.nama)
        val email=findViewById<EditText>(R.id.email)
        val password=findViewById<EditText>(R.id.password)
        val alamat=findViewById<EditText>(R.id.alamat)
        val nohandphone=findViewById<EditText>(R.id.hp)
        val btn=findViewById<Button>(R.id.btd_daftar)

        btd_daftar.setOnClickListener {
            val nama_2=nama.text.toString()
            val email_2=email.text.toString()
            val password_2=password.text.toString()
            val alamat_2=alamat.text.toString()
            val nohandphone_2=nohandphone.text.toString()

            val intent=Intent(this@Register,Preview::class.java)
            intent.putExtra("nama",nama_2)
            intent.putExtra("email",email_2)
            intent.putExtra("password",password_2)
            intent.putExtra("alamat",alamat_2)
            intent.putExtra("nohandphone",nohandphone_2)

            startActivity(intent)
        }


    }
}
