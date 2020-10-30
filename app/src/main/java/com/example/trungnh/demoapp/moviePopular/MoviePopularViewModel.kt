package com.example.trungnh.demoapp.moviePopular

import android.util.Log
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.trungnh.demoapp.data.MovieRepository
import com.example.trungnh.demoapp.models.Movie
import javax.inject.Inject

class MoviePopularViewModel @Inject constructor(val repository: MovieRepository) : ViewModel() {

    init {
        Log.e(TAG, "New Instance")
    }

    val moviesPopular: LiveData<List<Movie>>
        get() {
            return repository.moviesPopular
        }

    companion object {
        const val TAG = "MoviePopularViewModel"
    }

}