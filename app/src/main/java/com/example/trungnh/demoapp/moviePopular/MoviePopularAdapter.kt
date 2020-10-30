package com.example.trungnh.demoapp.moviePopular

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.trungnh.demoapp.databinding.ItemMovieBinding
import com.example.trungnh.demoapp.models.Movie
import com.example.trungnh.demoapp.network.ApiService

class MoviePopularAdapter : RecyclerView.Adapter<MoviePopularAdapter.ViewHolder>() {

    private var movies: List<Movie> = listOf()

    fun submitMovie(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            binding.movie = movie
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e(TAG, "onBindViewHolder")
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        Log.e(TAG, "getItemCount: ${movies.size}")
        return movies.size
    }

    companion object {
        const val TAG = "MoviePopularAdapter"
    }

}