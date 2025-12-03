package com.example.instadev.domain.repository

import com.example.instadev.domain.model.UserModel
import javax.inject.Inject

interface AuthRepository {

    suspend fun doLogin(
        user: String,
        password: String
    ): List<UserModel>
}