package com.example.trungnh.demoapp.models

import com.google.gson.annotations.SerializedName

class MovieResult {

    @SerializedName("results")
    val results: List<Movie> = listOf()

    @SerializedName("page")
    val page: Int = 0

    @SerializedName("total_pages")
    val totalPages: Int = 0

}