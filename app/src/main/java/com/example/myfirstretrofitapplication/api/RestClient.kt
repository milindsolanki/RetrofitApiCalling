package com.example.myfirstretrofitapplication.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestClient {

   // private var BASE_URL = "https://simplifiedcoding.net/demos/"
   private var BASE_URL = "http://newsapi.org/v2/"

    private var mRetrofit: Retrofit? = null
    val client: Retrofit
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return mRetrofit!!
        }
}

//    val client: Retrofit
//        get() {
//            if (mRetrofit == null) {
//                mRetrofit = Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build()
//            }
//            return mRetrofit!!
//        }


