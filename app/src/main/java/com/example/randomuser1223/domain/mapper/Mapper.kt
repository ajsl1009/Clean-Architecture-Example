package com.example.randomuser1223.domain.mapper

import com.example.randomuser1223.data.spec.UserSpec
import com.example.randomuser1223.domain.entity.UserEntity

object Mapper {
    fun mapToEntity(spec: UserSpec): List<UserEntity> {
        val userList = arrayListOf<UserEntity>()
        for (user in spec.results) {
            userList.add(
                UserEntity(
                    user.name.title + "." + user.name.first + " " + user.name.last,
                    user.phone,
                    user.picture.medium,
                )
            )
        }
        return userList
    }
}