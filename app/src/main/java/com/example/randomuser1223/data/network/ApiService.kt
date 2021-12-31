package com.example.randomuser1223.data.network

import com.example.randomuser1223.data.spec.UserSpec
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/api")
    suspend fun getUserList(@Query("results") result: Int): Response<UserSpec>
}