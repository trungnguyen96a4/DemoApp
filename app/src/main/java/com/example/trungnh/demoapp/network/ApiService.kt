package com.example.trungnh.demoapp.network

import com.example.trungnh.demoapp.models.MovieResult
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    companion object {
        const val BASE_URL_IMG = "https://image.tmdb.org/t/p/original/"
        const val API_KEY = "4b6dbb466a7dcc286e614fe5d5845299"
    }

    @GET("movie/popular")
    fun getPopularMovie(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("page") page: Int = 1
    ): Observable<MovieResult>

    @GET("movie/top_rated")
    fun getTopRatedMovie(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("page") page: Int = 1
    ): Observable<MovieResult>

}