package com.example.trungnh.demoapp.moviePopular

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trungnh.demoapp.DaggerAppComponent
import com.example.trungnh.demoapp.ViewModelFactory
import com.example.trungnh.demoapp.databinding.FragmentMoviePopularBinding
import javax.inject.Inject

class MoviePopularFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by viewModels<MoviePopularViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        DaggerAppComponent.create().inject(this)

        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentMoviePopularBinding.inflate(inflater, container, false)

        binding.viewModel = viewModel

        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = MoviePopularAdapter()
        }

        viewModel.moviesPopular.observe(viewLifecycleOwner) {
            binding.movies = it
        }

        return binding.root
    }

    companion object {
        const val TAG = "MoviePopularFragment"
    }

}