package com.example.demoretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.demoretrofit.model.StackOverFollowPojo
import com.example.demoretrofit.retrofit.ResponseCallBack
import com.example.demoretrofit.retrofit.StackRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StackRepository.getInstance().getListItem("desc","activity","stackoverflow",object :ResponseCallBack<StackOverFollowPojo>{
            override fun onSuccess(obj: StackOverFollowPojo) {
                obj.items.forEach {
                    Log.d("TAG", "onSuccess: ${it.link}")
                }
            }

            override fun onFail(message: String) {
                Log.d("TAG", "onFail: $message")
            }
        })
    }
}