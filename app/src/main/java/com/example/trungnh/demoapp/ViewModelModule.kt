package com.example.trungnh.demoapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.trungnh.demoapp.data.MovieRepository
import dagger.Binds
import dagger.Module
import javax.inject.Inject
import javax.inject.Provider

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}

class ViewModelFactory @Inject constructor(
    val repository: MovieRepository
) : ViewModelProvider.Factory {

    init {
        Log.e(TAG, "New Instance")
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MovieRepository::class.java).newInstance(repository)
    }

    companion object {
        const val TAG = "ViewModelFactory"
    }
}