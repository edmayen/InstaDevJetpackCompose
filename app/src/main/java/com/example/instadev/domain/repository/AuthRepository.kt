package com.example.instadev.domain.repository

import com.example.instadev.domain.model.UserModel

interface AuthRepository {

    fun doLogin(
        user: String,
        password: String
    ): UserModel
}