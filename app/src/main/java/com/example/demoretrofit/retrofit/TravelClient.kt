package com.example.demoretrofit.retrofit

import com.example.demoretrofit.common.Constant
import com.example.demoretrofit.model.TravelPojo
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface TravelClient {
    @GET("/api/v1/news/all")
    fun reposPoJo(): Call<TravelPojo>

    companion object {
        fun getInstance(): TravelClient {
            val httpClient = OkHttpClient.Builder()
            val builder = Retrofit.Builder().baseUrl(Constant.BASE_URI)
                .addConverterFactory(GsonConverterFactory.create())
            val retrofit = builder.client(httpClient.build()).build()
            return retrofit.create(TravelClient::class.java)
        }
    }
}