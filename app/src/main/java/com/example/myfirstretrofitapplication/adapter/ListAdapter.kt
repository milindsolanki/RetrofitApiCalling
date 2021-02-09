package com.example.myfirstretrofitapplication.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myfirstretrofitapplication.R
import com.example.myfirstretrofitapplication.beans.news.Article
import com.example.myfirstretrofitapplication.utils.CommanUtils.inflateLayout
import com.example.myfirstretrofitapplication.utils.ViewHolder

import kotlinx.android.synthetic.main.item_datalist_adpter.view.*


class ListAdapter(val context: Context, val datalist: ArrayList<Article>) :

    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(inflateLayout(parent, R.layout.item_datalist_adpter))

    override fun getItemCount() = datalist.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

//         Glide.with(context).load(datalist[position].imageurl).into(holder.itemView.imageView)
//
//
//         holder.itemView.textView.text = datalist[position].name
//         holder.itemView.queId.text = datalist[position].firstappearance
//         holder.itemView.closedReason.text = datalist[position].realname
//         holder.itemView.userType.text = datalist[position].team


    }


}