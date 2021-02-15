package com.example.jobapi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jobapi.databinding.ActivityMainBinding
import com.example.jobapi.databinding.JobCardBinding
import com.example.jobapi.model.JobData
import com.example.jobapi.viewModel.MainViewModel

class JobAdapter(val jobData: List<JobData>): RecyclerView.Adapter<JobAdapter.ViewHolder>(){


   class ViewHolder(val binding: JobCardBinding) : RecyclerView.ViewHolder(binding.root) {
       fun setText(jobData: JobData){
            binding.tvDisplay.text=jobData.title
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var binding: JobCardBinding = JobCardBinding.inflate(LayoutInflater.from(parent.context),parent , false)
         return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var jobItem = jobData[position]
        holder.setText(jobItem)
    }

    override fun getItemCount(): Int {
       return jobData.size
    }




}