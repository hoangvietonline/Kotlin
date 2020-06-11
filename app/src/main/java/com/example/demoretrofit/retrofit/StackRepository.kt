package com.example.demoretrofit.retrofit

import com.example.demoretrofit.model.StackOverFollowPojo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StackRepository private constructor() {
    private object Holder {
        val INSTANCE = StackRepository()
    }

    companion object Factory {
        @JvmStatic
        fun getInstance(): StackRepository {
            return Holder.INSTANCE
        }
    }

    fun getListItem(
        order: String,
        sort: String,
        site: String,
        callBack: ResponseCallBack<StackOverFollowPojo>
    ) {
        val call: Call<StackOverFollowPojo> =
            StackOverFlowClient.getInstance().reposPojo(order, sort, site)
        enqueue(call, callBack)
    }

    private fun <T> enqueue(call: Call<T>, callBack: ResponseCallBack<T>?) {
        call.enqueue(object : Callback<T> {
            override fun onFailure(call: Call<T>?, t: Throwable?) {
                callBack?.onFail(t?.message.toString())
            }

            override fun onResponse(call: Call<T>?, response: Response<T>?) {
                if (response?.isSuccessful!!) {
                    callBack?.onSuccess(response.body())
                } else
                    callBack?.onFail("response is fail")
            }
        })
    }
}