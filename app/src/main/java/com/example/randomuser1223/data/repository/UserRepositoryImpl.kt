package com.example.randomuser1223.data.repository

import com.example.randomuser1223.data.remote.UserDataSource
import com.example.randomuser1223.domain.entity.UserEntity
import com.example.randomuser1223.domain.mapper.Mapper
import com.example.randomuser1223.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource,
) : UserRepository {
    override suspend fun getUserList(): List<UserEntity> = Mapper.mapToEntity(userDataSource.getUserList())
}