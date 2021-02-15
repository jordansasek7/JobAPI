package com.example.jobapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.jobapi.R
import com.example.jobapi.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       loadFragment()
    }

    fun loadFragment() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.container, SearchFragment.newInstance(), "BlankFragment")
                .commit()
    }
}