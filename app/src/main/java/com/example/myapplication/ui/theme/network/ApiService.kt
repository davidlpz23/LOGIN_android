package com.example.myapplication.ui.theme.network

import com.example.myapplication.ui.theme.network.models.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): UserResponse
}
