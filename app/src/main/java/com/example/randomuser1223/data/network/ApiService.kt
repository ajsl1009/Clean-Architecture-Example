package com.example.randomuser1223.data.network

import com.example.randomuser1223.data.spec.UserSpec
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/test")
    suspend fun getUserList(): Response<UserSpec>
}