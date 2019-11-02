package com.example.responsi113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var tv_regisnama:EditText
    private lateinit var tv_jk:EditText
    private lateinit var tv_usia:EditText
    private lateinit var tv_alamat:EditText
    private lateinit var tv_email:EditText
    private lateinit var btn_regisdaftar: Button
    private lateinit var btn_regisback: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tv_regisnama = findViewById(R.id.tv_regisnama)
        tv_jk = findViewById(R.id.tv_jk)
        tv_usia = findViewById(R.id.tv_usia)
        tv_alamat = findViewById(R.id.tv_alamat)
        tv_email = findViewById(R.id.tv_email)
        btn_regisdaftar = findViewById(R.id.btn_regisdaftar)
        btn_regisback = findViewById(R.id.btn_regisback)

        btn_regisdaftar.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("nama_lengkap",tv_regisnama.text.toString())
            intent.putExtra("j_kelamin",tv_jk.text.toString())
            intent.putExtra("usia",tv_usia.text.toString())
            intent.putExtra("alamat",tv_alamat.text.toString())
            intent.putExtra("mail",tv_email.text.toString())
            Toast.makeText(this,"Data Diri Tersimpan",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        btn_regisback.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
