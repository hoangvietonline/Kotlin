package com.example.demoretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.demoretrofit.model.TravelPojo
import com.example.demoretrofit.retrofit.ResponseCallBack
import com.example.demoretrofit.retrofit.TravelRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TravelRepository.getInstance().getListItem(object :ResponseCallBack<TravelPojo>{
            override fun onSuccess(obj: TravelPojo) {
                obj.data.forEach {
                    Log.d("TAG", "onSuccess: ${it.title}")
                }
            }

            override fun onFail(message: String) {
                Log.d("TAG", "onFail: $message")
            }
        })
    }
}
