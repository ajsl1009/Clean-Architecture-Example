package com.example.randomuser1223.data.remote

import com.example.randomuser1223.data.network.ApiService
import com.example.randomuser1223.data.spec.UserSpec
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
) : UserDataSource {
    override suspend fun getUserList(): UserSpec {
        apiService.getUserList(100).let {
            if (it.isSuccessful) {
                return it.body() ?: UserSpec()
            } else {
                throw Exception("${it.errorBody()}")
            }
        }
    }
}