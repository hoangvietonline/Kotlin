package com.example.demoretrofit.retrofit

import com.example.demoretrofit.model.TravelPojo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TravelRepository private constructor() {
    companion object Factory {
        @JvmStatic
        fun getInstance(): TravelRepository {
            return TravelRepository()
        }
    }

    fun getListItem(
        callBack: ResponseCallBack<TravelPojo>
    ) {
        val call: Call<TravelPojo> =
            TravelClient.getInstance().reposPoJo()
        enqueue(call, callBack)
    }

    private fun <T> enqueue(call: Call<T>, callBack: ResponseCallBack<T>) {
        call.enqueue(object : Callback<T> {
            override fun onFailure(call: Call<T>?, t: Throwable?) {
                callBack.onFail(t?.message.toString())
            }

            override fun onResponse(call: Call<T>?, response: Response<T>?) {
                response?.let {
                    if (it.isSuccessful){
                        callBack.onSuccess(response.body())
                    }else{
                        callBack.onFail("response is fail")
                    }
                }
            }
        })
    }
}
