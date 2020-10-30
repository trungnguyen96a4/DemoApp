package com.example.trungnh.demoapp.moviePopular

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.trungnh.demoapp.models.Movie
import com.example.trungnh.demoapp.network.ApiService

@BindingAdapter("app:items")
fun setItems(recyclerView: RecyclerView, movies: List<Movie>?) {
    movies?.also {
        Log.e("BindingAdapter", "${movies.size}")
        (recyclerView.adapter as MoviePopularAdapter).submitMovie(it)
    }
}

@BindingAdapter("app:urlImage")
fun loadImage(imageView: ImageView, urlImage: String) {
    Glide.with(imageView)
        .load("${ApiService.BASE_URL_IMG}${urlImage}")
        .apply(RequestOptions.overrideOf(150, 200))
        .into(imageView)
}