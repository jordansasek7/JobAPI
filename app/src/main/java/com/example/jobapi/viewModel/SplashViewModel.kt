package com.example.jobapi.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobapi.model.JobData
import com.example.jobapi.repo.JobRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel: ViewModel(){

    private val _delayFlag= MutableLiveData<Boolean>()
    val delayFlag: LiveData<Boolean> = _delayFlag

    fun setDelay() {
        viewModelScope.launch(Dispatchers.IO) { delay(4000)
        _delayFlag.postValue(true)}
    }

}