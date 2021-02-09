package com.example.myfirstretrofitapplication.api


import com.example.myfirstretrofitapplication.beans.news.Article
import com.example.myfirstretrofitapplication.beans.news.ExampleNews
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {
    // @GET("marvel")

    //fun getDtaa(): Call<List<Example>>

    @GET("top-headlines?Sources=google-news&apiKey=9a0c8e375ada4198a26f7a52638c4b78")

    fun getNews(): Call<ExampleNews>

}