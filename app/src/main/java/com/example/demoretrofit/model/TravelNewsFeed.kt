package com.example.demoretrofit.model
import com.google.gson.annotations.SerializedName

data class TravelNewsFeed(
	@SerializedName("id") val id: Int,
	@SerializedName("title") val title: String,
	@SerializedName("thumbnail") val thumbnail: String,
	@SerializedName("decscription") val decscription: String,
	@SerializedName("thumbnailone") val thumbnailone: String,
	@SerializedName("decscriptionone") val decscriptionone: String,
	@SerializedName("thumbnailtwo") val thumbnailtwo: String,
	@SerializedName("decscriptiontwo") val decscriptiontwo: String,
	@SerializedName("thumbnailthree") val thumbnailthree: String,
	@SerializedName("decscriptionthree") val decscriptionthree: String,
	@SerializedName("created_at") val created_at: String,
	@SerializedName("updated_at") val updated_at: String?=null
)