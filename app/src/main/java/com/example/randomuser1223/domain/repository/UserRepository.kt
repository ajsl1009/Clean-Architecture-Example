package com.example.randomuser1223.domain.repository

import com.example.randomuser1223.domain.entity.UserEntity

interface UserRepository {
    suspend fun getUserList(): List<UserEntity>
}