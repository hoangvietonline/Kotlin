package com.example.demoretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("reputation")
    @Expose
    var reputation: Int,
    @SerializedName("user_id")
    @Expose
    var user_id: Int,
    @SerializedName("user_type")
    @Expose
    var user_type: String,
    @SerializedName("accept_rate")
    @Expose
    var accept_rate: Int,
    @SerializedName("profile_image")
    @Expose
    var profile_image: String,
    @SerializedName("display_name")
    @Expose
    var display_name: String,
    @SerializedName("link")
    @Expose
    var link: String
)