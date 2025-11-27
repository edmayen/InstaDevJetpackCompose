package com.example.instadev.domain.usecases

import com.example.instadev.domain.repository.AuthRepository

class LoginUseCase(
    private val authRepository: AuthRepository
) {

    operator fun invoke(user: String, password: String) {
        if (user.contains("@hotmail.com")) {
            return
        }
        val response = authRepository.doLogin(user, password)
    }
}