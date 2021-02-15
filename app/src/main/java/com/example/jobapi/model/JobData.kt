package com.example.jobapi.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter=true)
data class JobData(
    val company: String,
    @Json(name="company_logo")
    val companyLogo: String?,
    @Json(name="company_url")
    val companyUrl: String?,
    @Json(name ="created_at")
    val createdAt: String?,
    val description: String?,
    @Json(name= "how_to_apply")
    val howToApply: String,
    val id: String,
    val location: String,
    val title: String,
    val type: String,
    val url: String
)