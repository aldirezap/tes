package com.example.responsi113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tv_logusername:EditText
    private lateinit var tv_logpass:EditText
    private lateinit var btn_login:Button
    private lateinit var tv_logregis:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_logusername = findViewById(R.id.tv_logusername)
        tv_logpass = findViewById(R.id.tv_logpass)
        btn_login = findViewById(R.id.btn_login)
        tv_logregis = findViewById(R.id.tv_logregis)

        var nama_lengkap : String? = " "
        var j_kelamin : String? = " "
        var usia : String? = " "
        var alamat : String? = " "
        var mail : String? = " "

        if(intent.extras != null){
            val bundle = intent.extras
            nama_lengkap = bundle?.getString("nama_lengkap")
            j_kelamin = bundle?.getString("j_kelamin")
            usia = bundle?.getString("usia")
            alamat = bundle?.getString("alamat")
            mail = bundle?.getString("mail")
        }


        btn_login.setOnClickListener(){
            if(tv_logusername.text.toString() == "yasir" && tv_logpass.text.toString() == "123456"){
                val intent = Intent (this,HomeActivity::class.java)
                intent.putExtra("nama_lengkap",nama_lengkap)
                intent.putExtra("j_kelamin",j_kelamin)
                intent.putExtra("usia",usia)
                intent.putExtra("alamat",alamat)
                intent.putExtra("mail",mail)
                startActivity(intent)
            }else
                Toast.makeText(this,"Username atau Password salah",Toast.LENGTH_LONG).show()
        }

        tv_logregis.setOnClickListener() {
            val intent = Intent(this, RegisterActivity::class .java)
            startActivity(intent)
        }

    }

}
