package com.example.trungnh.demoapp.models

import com.example.trungnh.demoapp.models.Genre
import com.google.gson.annotations.SerializedName

class Movie {

    @SerializedName("id")
    val id: Int = 0

    @SerializedName("vote_average")
    val voteAverage: Double = 0.0

    @SerializedName("title")
    val title: String = ""

    @SerializedName("release_date")
    val releaseDate: String = ""

    @SerializedName("genres")
    val genres: List<Genre> = listOf()

    @SerializedName("overview")
    val overview: String = ""

    @SerializedName("poster_path")
    val posterPath: String = ""

    @SerializedName("homepage")
    val homepage: String = ""

    @SerializedName("budget")
    val budget: Int = 0

}