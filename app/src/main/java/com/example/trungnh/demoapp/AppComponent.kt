package com.example.trungnh.demoapp

import androidx.fragment.app.Fragment
import com.example.trungnh.demoapp.moviePopular.MoviePopularFragment
import com.example.trungnh.demoapp.network.ApiServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, ApiServiceModule::class])
interface AppComponent {

    fun inject(fragment: MoviePopularFragment)

}