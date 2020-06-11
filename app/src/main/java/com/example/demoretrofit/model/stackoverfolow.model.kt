package com.example.demoretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class StackOverFollowPojo(
    @SerializedName("items")
    @Expose
    var items: List<Items>,
    @SerializedName("has_more")
    @Expose
    var has_more: Boolean,
    @SerializedName("quota_max")
    @Expose
    var quota_max: Int,
    @SerializedName("quota_remaining")
    @Expose
    var quota_remaining: Int
)