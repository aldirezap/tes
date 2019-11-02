package com.example.responsi113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AccountActivity : AppCompatActivity() {
    private lateinit var NamaLengkap: TextView
    private lateinit var Jkelamin: TextView
    private lateinit var rvUsia: TextView
    private lateinit var rvAlamat : TextView
    private lateinit var rvEmail: TextView
    private lateinit var btn_kembali: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)


        NamaLengkap = findViewById(R.id.tv_accnama)
        Jkelamin= findViewById(R.id.tv_jk)
        rvUsia = findViewById(R.id.tv_usia)
        rvAlamat = findViewById(R.id.tv_alamat)
        rvEmail = findViewById(R.id.tv_email)
        btn_kembali = findViewById(R.id.btn_accback)

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


            NamaLengkap.setText(nama_lengkap)
            Jkelamin.setText(j_kelamin)
            rvUsia.setText(usia)
            rvAlamat.setText(alamat)
            rvEmail.setText(mail)
        }

        btn_kembali.setOnClickListener(){
            intent = Intent(this,HomeActivity::class.java )
            intent.putExtra("nama_lengkap",nama_lengkap)
            intent.putExtra("j_kelamin",j_kelamin)
            intent.putExtra("usia",usia)
            intent.putExtra("alamat",alamat)
            intent.putExtra("mail",mail)
            startActivity(intent)
        }
    }

}
