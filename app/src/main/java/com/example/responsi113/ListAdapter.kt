package com.example.responsi113

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.responsi113.model.dataKlub
import com.example.responsi113.model.klub

    class ListAdapter (private val listAdapter: ArrayList<klub>) : RecyclerView.Adapter<ListAdapter.klubViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):klubViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_klub, parent, false)
            return klubViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listAdapter.size
        }

        override fun onBindViewHolder(holder: klubViewHolder, position: Int) {
            val lclub = dataKlub.listklub[position]
            holder.tvName.text = lclub.klub
            holder.tvDetail.text = lclub.deskripsi
            Glide.with(holder.itemView.context)
                .load(lclub.gambar)
                .into(holder.imgPoster)
        }

        inner class klubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
        }

    }