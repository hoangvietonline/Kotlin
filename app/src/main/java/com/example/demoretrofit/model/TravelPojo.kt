package com.example.demoretrofit.model

import com.google.gson.annotations.SerializedName

data class TravelPojo(
	@SerializedName("error") val error: Int,
	@SerializedName("status") val status: Int,
	@SerializedName("data") val data: List<TravelNewsFeed>,
	@SerializedName("message") val message: String
)