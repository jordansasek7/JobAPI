package com.example.jobapi.repo

import com.example.jobapi.model.JobData

object JobRepo {
    suspend fun getAllJobs(): List<JobData> {
        return RetroFitInstance.jobService.getAllJobs()
    }

    suspend fun getJobsDescription(description: String): List<JobData> {
        return RetroFitInstance.jobService.getJobsDescription(description)
    }

    suspend fun getJobsLocation(location: String): List<JobData> {
        return RetroFitInstance.jobService.getJobsLocation(location)
    }

    suspend fun getJobsDL(description: String, location: String): List<JobData> {
        return RetroFitInstance.jobService.getJobsDL(description,location)
    }

}