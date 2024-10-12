package com.example.assignment2_travelblog

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.title1)
    val img: ImageView = itemView.findViewById(R.id.img1)
    val desc: TextView = itemView.findViewById(R.id.desc1)
    val footer: TextView = itemView.findViewById(R.id.footer1)
    val readmore: TextView = itemView.findViewById(R.id.readmore1)
}