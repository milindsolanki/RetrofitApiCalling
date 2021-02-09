package com.example.myfirstretrofitapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstretrofitapplication.adapter.ListAdapter
import com.example.myfirstretrofitapplication.R
import com.example.myfirstretrofitapplication.api.ApiServices
import com.example.myfirstretrofitapplication.api.RestClient
import com.example.myfirstretrofitapplication.beans.news.Article
import com.example.myfirstretrofitapplication.beans.news.ExampleNews
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    private var mApiService: ApiServices? = null
    private var mAdapter: ListAdapter? = null
    var dataList = ArrayList<Article>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mApiService = RestClient.client.create(ApiServices::class.java)

        intiView()
    }

    private fun intiView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter = ListAdapter(this, dataList)
        recyclerView.adapter = mAdapter
        fetchDataList()
    }

    private fun fetchDataList() {
        val call = mApiService!!.getNews()
        call.enqueue(object : Callback<ExampleNews> {
            override fun onResponse(call: Call<ExampleNews>, response: Response<ExampleNews>) {
                Log.d("TAG", response.body().toString())
                dataList.addAll(response.body()!!.articles)
            }

            override fun onFailure(call: Call<ExampleNews>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

        /*val call=mApiService!!.getDtaa()
        call.enqueue(object :retrofit2.Callback<List<Example>>
        {


            override fun onResponse(call: Call<List<Example>>, response: Response<List<Example>>) {
              dataList.addAll(response.body()!!)
                mAdapter!!.notifyDataSetChanged()
            }
            override fun onFailure(call: Call<List<Example>>, t: Throwable) {
            }

        })
*/
    }

//    private fun fetchDataList() {
//        val call =mApiService!!.getDtaa()
//        call.enqueue(object : retrofit2.Callback<List<Example>> {
//            override fun onResponse(call: Call<List<Example>>, response: Response<List<Example>>) {
//
//                Log.e("TAG", "Successful : " + response.isSuccessful)
//                dataList.addAll(response.body()!!)
//                mAdapter!!.notifyDataSetChanged()
//
//            }
//            override fun onFailure(call: Call<List<Example>>, t: Throwable) {
//                Log.e("TAG", "Got error : " + t.toString())
//
//            }
//
//        })
//    }
}
