package com.example.assignment2_travelblog

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ArticleDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_details)

        val title = intent.getStringExtra("title")
        val detail = intent.getStringExtra("detail")
        val image = intent.getIntExtra("image", 0)

        findViewById<TextView>(R.id.title1).text = title
        findViewById<TextView>(R.id.textviewdesc1).text = detail
        findViewById<ImageView>(R.id.img1).setImageResource(image)

    }
}