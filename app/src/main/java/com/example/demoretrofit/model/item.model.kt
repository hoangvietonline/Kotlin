package com.example.demoretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("tags")
    @Expose
    var tags: List<String>,
    @SerializedName("owner")
    @Expose
    var owner: Owner,
    @SerializedName("is_answered")
    @Expose
    var is_answered: Boolean,
    @SerializedName("view_count")
    @Expose
    var view_count: Int,
    @SerializedName("accepted_answer_id")
    @Expose
    var accepted_answer_id: Int,
    @SerializedName("answer_count")
    @Expose
    var answer_count: Int,
    @SerializedName("score")
    @Expose
    var score: Int,
    @SerializedName("last_activity_date")
    @Expose
    var last_activity_date: Int,
    @SerializedName("creation_date")
    @Expose
    var creation_date: Int,
    @SerializedName("last_edit_date")
    @Expose
    var last_edit_date: Int,
    @SerializedName("question_id")
    @Expose
    var question_id: Int,
    @SerializedName("content_license")
    @Expose
    var content_license: String,
    @SerializedName("link")
    @Expose
    var link: String,
    @SerializedName("title")
    @Expose
    var title: String
)