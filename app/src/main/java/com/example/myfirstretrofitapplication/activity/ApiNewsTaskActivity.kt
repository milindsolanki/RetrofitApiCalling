package com.example.myfirstretrofitapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstretrofitapplication.R
import com.example.myfirstretrofitapplication.adapter.NewsAdapter
import com.example.myfirstretrofitapplication.api.ApiServices
import com.example.myfirstretrofitapplication.api.RestClient
import com.example.myfirstretrofitapplication.beans.news.Article
import kotlinx.android.synthetic.main.activity_api_news_task.*
import retrofit2.Call
import retrofit2.Response
import java.util.ArrayList

class ApiNewsTaskActivity : AppCompatActivity() {
    private var apiServices: ApiServices? = null
    private var mAdapter: NewsAdapter? = null
    private var newsList = java.util.ArrayList<Article>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_news_task)
        apiServices = RestClient.client.create(ApiServices::class.java)
        intiView()
    }

    private fun intiView() {
        rvNews.layoutManager = LinearLayoutManager(this)
        mAdapter = NewsAdapter(this, newsList)
        rvNews.adapter = mAdapter
       // fatchNewsData()


    }

    /*private fun fatchNewsData() {

        val call = apiServices!!.getNews()
        call.enqueue(object :
            retrofit2.Callback<List<Article>> {
            override fun onResponse(call: Call<List<Article>>, response: Response<List<Article>>) {
                newsList = response.body() as ArrayList<Article>
                val newsData = arrayOf(newsList.size)
                for (i in newsList) {
                    // newsData=newsList.get(i).
                }


            }

            override fun onFailure(call: Call<List<Article>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }*/
}