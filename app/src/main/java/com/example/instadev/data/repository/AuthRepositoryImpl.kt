package com.example.instadev.data.repository

import com.example.instadev.data.api.response.UserResponse
import com.example.instadev.data.api.response.toDomain
import com.example.instadev.domain.model.UserModel
import com.example.instadev.domain.repository.AuthRepository

class AuthRepositoryImpl: AuthRepository {

    override fun doLogin(user: String, password: String): UserModel {
        val userResponse = UserResponse(
            userId = "",
            name = "",
            nickName = "",
            followers = 0,
            following = emptyList(),
            userType = 0
        )

        return userResponse.toDomain()
    }
}