package com.example.myfirstretrofitapplication.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myfirstretrofitapplication.R
import com.example.myfirstretrofitapplication.beans.news.Article
import com.example.myfirstretrofitapplication.utils.CommanUtils
import com.example.myfirstretrofitapplication.utils.ViewHolder
import kotlinx.android.synthetic.main.news_adpter.view.*

class NewsAdapter(val context: Context, val articleList: ArrayList<Article>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(CommanUtils.inflateLayout(parent, R.layout.news_adpter))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.txtNewsTitle.text = articleList[position].title
        holder.itemView.txtAuthorName.text = articleList[position].author
        //holder.itemView.txtDateNews.text = articleList[position].
        Glide.with(context).load(articleList[position].urlToImage).into(holder.itemView.imgNews)

    }

    override fun getItemCount(): Int = articleList.size
}