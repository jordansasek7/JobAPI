package com.example.jobapi.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobapi.model.JobData
import com.example.jobapi.repo.JobRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _job = MutableLiveData<List<JobData>>()
    val job: LiveData<List<JobData>> = _job

    private val _description = MutableLiveData<String>()
    val description: LiveData<String> get() = _description

    private val _location = MutableLiveData<String>()
    val location: LiveData<String> get() = _location

    fun getJobs() {
        viewModelScope.launch(Dispatchers.IO) { _job.postValue(JobRepo.getAllJobs()) }
    }

    fun getJobsDescription(description: String) {
        viewModelScope.launch(Dispatchers.IO) { _job.postValue(JobRepo.getJobsDescription(description)) }
    }

    fun getJobsLocation(location: String) {
        viewModelScope.launch(Dispatchers.IO) { _job.postValue(JobRepo.getJobsLocation(location)) }
    }

    fun getJobsDL(description: String, location: String) {
        viewModelScope.launch(Dispatchers.IO) { _job.postValue(JobRepo.getJobsDL(description, location)) }
    }

    fun setJob(description: String, location: String) {
        if (description.isNullOrBlank()) {
            _description.value = ""
        } else {
            _description.value = description
        }
        if (location.isNullOrBlank()) {
            _location.value = ""
        } else {
            _location.value = location
        }
    }
}