package com.example.trungnh.demoapp.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.trungnh.demoapp.models.Movie
import com.example.trungnh.demoapp.network.ApiService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.logging.Handler
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(val service: ApiService) {

    init {
        Log.e(TAG, "New Instance")
    }

    val moviesPopular: MutableLiveData<List<Movie>> by lazy {
        MutableLiveData(emptyList())
    }

    init {
        fetchMoviesPopular(1)
    }

    fun fetchMoviesPopular(page: Int) {
        Log.e(TAG, "fetchMoviesPopular")
        service.getPopularMovie(page = page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { result ->
                moviesPopular.value = result.results
                Log.e(TAG, "Loaded: ${result.results.size}")
            }
    }

    companion object {
        const val TAG = "MovieRepository"
    }

}