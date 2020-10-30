package com.example.trungnh.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trungnh.demoapp.moviePopular.MoviePopularFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MoviePopularFragment())
            .commit()
    }
}