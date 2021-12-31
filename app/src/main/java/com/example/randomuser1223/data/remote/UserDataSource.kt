package com.example.randomuser1223.data.remote

import com.example.randomuser1223.data.spec.UserSpec

interface UserDataSource {
    suspend fun getUserList(): UserSpec
}