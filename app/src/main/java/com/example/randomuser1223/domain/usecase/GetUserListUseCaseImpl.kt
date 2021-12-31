package com.example.randomuser1223.domain.usecase

import com.example.randomuser1223.domain.entity.UserEntity
import com.example.randomuser1223.domain.repository.UserRepository
import javax.inject.Inject

class GetUserListUseCaseImpl @Inject constructor(
    private val userRepository: UserRepository,
) : GetUserListUseCase {
    override suspend fun invoke(): List<UserEntity> {
        return userRepository.getUserList()
    }
}