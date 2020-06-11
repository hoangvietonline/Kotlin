package com.example.demoretrofit.retrofit

interface ResponseCallBack<T> {
    fun onSuccess(obj: T)
    fun onFail(message: String)
}