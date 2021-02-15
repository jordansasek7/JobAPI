package com.example.jobapi.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.jobapi.R
import com.example.jobapi.databinding.SearchFragmentBinding
import com.example.jobapi.model.JobData
import com.example.jobapi.repo.JobRepo.getAllJobs
import com.example.jobapi.viewModel.MainViewModel


class SearchFragment : Fragment() {
    private lateinit var binding: SearchFragmentBinding
    private var location :String? = null
    private var description :String? =null
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = SearchFragmentBinding.inflate(inflater, container, false).also { binding = it }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)

        binding.btnSearch.setOnClickListener {
            viewModel.setJob(binding.JobDesc.text.toString(),binding.JobLoc.text.toString())
            viewModel.getJobs()
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SearchFragment()

    }
}