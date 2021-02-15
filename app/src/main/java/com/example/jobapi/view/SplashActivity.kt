package com.example.jobapi.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.jobapi.R
import com.example.jobapi.viewModel.SplashViewModel
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {

    val viewModel by viewModels<SplashViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        viewModel.setDelay()
        observe()
    }

    fun observe() {
        viewModel.delayFlag.observe(this, object: Observer<Boolean> {
            override fun onChanged(t: Boolean?) {
                setIntent()
            }

        })
    }

    fun setIntent() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }








}