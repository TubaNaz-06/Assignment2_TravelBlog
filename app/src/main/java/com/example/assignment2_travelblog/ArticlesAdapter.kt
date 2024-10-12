package com.example.assignment2_travelblog

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)

        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size


    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles.get(position)
        holder.title.text = article.title
        holder.img.setImageResource(article.img)
        holder.desc.text = article.desc
        holder.footer.text = article.footer
        holder.readmore.setOnClickListener {

            val intent = Intent( holder.itemView.context, ArticleDetailsActivity::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("desc", article.desc)
            intent.putExtra("detail", article.detail)
            intent.putExtra("image", article.img )
            holder.itemView.context.startActivity(intent)
        }


        }

    }
