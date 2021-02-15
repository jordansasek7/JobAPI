package com.example.jobapi.repo

import com.example.jobapi.model.JobData
import retrofit2.http.GET
import retrofit2.http.Query

interface JobService {


  //All jobs
  @GET( "positions.json")
  suspend fun getAllJobs():List<JobData>
  //Search by location
  @GET( "positions.json")
  suspend fun getJobsLocation(@Query("location")location: String):List<JobData>
  //Search by description
  @GET( "positions.json")
  suspend fun getJobsDescription(@Query("description") description: String ): List<JobData>
  //Search by description and location
  @GET( "positions.json")
  suspend fun getJobsDL(@Query("description") description: String, @Query("location") location: String): List<JobData>
}