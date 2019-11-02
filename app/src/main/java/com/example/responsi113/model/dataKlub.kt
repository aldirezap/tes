package com.example.responsi113.model

import com.example.responsi113.R

object dataKlub {
    private val club = arrayOf(
        "LIVERPOOL",
        "MANCHESTER UNITED",
        "CHELSEA",
        "REAL MADRID",
        "BARCELONA",
        "JUVENTUS",
        "A.C MILAN",
        "INTER MILAN",
        "BAYERN MUNCHEN",
        "BORRUSIA DORTMUND"
    )
    private val detail = arrayOf(
        "LIVERPOOL adalah klub sepak bola terhebat",
        "MANCHESTER UNITED adalah klub papan tengah liga inggris",
        "CHELSEA adalah klub nomor 1 , tapi di london",
        "REAL MADRID adalah klub dengan gelar liga champions terbanyak",
        "BARCELONA adalah satu satunya klub yang dapat meraih sixtuple",
        "JUVENTUS adalah klub dengan gelar liga italia terbanyak",
        "A.C MILAN adalah klub dengan gelar liga champions terbanyak setelah real madrid",
        "INTER MILAN adalah satu satunya klub Italia yang dapat meraih treble winner",
        "BAYERN MUNCHEN adalah klub yang bermain di liga jerman",
        "BORRUSIA DORTMUND adalah klub dengan basis supporter paling kreatif "
    )

    private val poster = intArrayOf(
        R.drawable.ipul,
        R.drawable.munited,
        R.drawable.chelsea,
        R.drawable.madrid,
        R.drawable.barca,
        R.drawable.juve,
        R.drawable.acmilan,
        R.drawable.inter,
        R.drawable.munchen,
        R.drawable.dortmund
    )
    val  listklub: ArrayList<klub>
    get() {
        val list = arrayListOf<klub>()
        for (position in club.indices) {
            val lclub = klub ()
            lclub.klub = club[position]
            lclub.deskripsi = detail[position]
            lclub.gambar= poster[position]
            list.add(lclub)
        }
        return list
    }
}