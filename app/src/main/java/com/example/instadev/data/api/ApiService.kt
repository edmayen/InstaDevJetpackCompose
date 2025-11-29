package com.example.instadev.data.api

import com.example.instadev.data.api.response.UserResponse
import retrofit2.http.GET

interface ApiService {

    @GET("doLogin/.json")
    suspend fun doLogin(): List<UserResponse>
}