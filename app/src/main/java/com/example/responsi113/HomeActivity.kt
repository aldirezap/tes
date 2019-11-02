package com.example.responsi113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi113.model.dataKlub
import com.example.responsi113.model.klub
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var iv_acc:ImageView
    private lateinit var rvklub: RecyclerView
    private var list: ArrayList<klub> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        iv_acc= findViewById(R.id.iv_acc)
        rvklub = findViewById(R.id.listviewbola)
        rvklub.setHasFixedSize(true)
        list.addAll(dataKlub.listklub)
        showBolaList()

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

        iv_acc.setOnClickListener(){
            val intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("nama_lengkap",nama_lengkap)
            intent.putExtra("j_kelamin",j_kelamin)
            intent.putExtra("usia",usia)
            intent.putExtra("alamat",alamat)
            intent.putExtra("mail",mail)
            startActivity(intent)
        }

        iv_back.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showBolaList() {
        rvklub.layoutManager = LinearLayoutManager(this)
        val ladapter = ListAdapter(list)
        rvklub.adapter = ladapter

    }




}