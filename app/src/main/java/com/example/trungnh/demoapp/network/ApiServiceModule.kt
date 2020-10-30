package com.example.trungnh.demoapp.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApiServiceModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

}