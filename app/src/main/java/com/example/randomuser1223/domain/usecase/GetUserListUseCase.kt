package com.example.randomuser1223.domain.usecase

import com.example.randomuser1223.domain.entity.UserEntity

interface GetUserListUseCase {
    suspend operator fun invoke(): List<UserEntity>
}