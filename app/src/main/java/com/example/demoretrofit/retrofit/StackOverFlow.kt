package com.example.demoretrofit.retrofit

import com.example.demoretrofit.common.Constant
import com.example.demoretrofit.model.StackOverFollowPojo
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface StackOverFlowClient {
    @GET("/2.2/search/advanced")
    fun reposPojo(
        @Query("order") oder: String,
        @Query("sort") sort: String,
        @Query("site") site: String
    ): Call<StackOverFollowPojo>

    companion object Factory {
        fun getInstance(): StackOverFlowClient {
            val httpClient = OkHttpClient.Builder()
            val builder =
                Retrofit.Builder().baseUrl(Constant.BASE_URI)
                    .addConverterFactory(GsonConverterFactory.create())
            val retrofit = builder.client(httpClient.build()).build()
            return retrofit.create(StackOverFlowClient::class.java)
        }
    }
}