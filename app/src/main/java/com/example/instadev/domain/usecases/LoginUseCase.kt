package com.example.instadev.domain.usecases

import com.example.instadev.domain.model.UserModel
import com.example.instadev.domain.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor (
    private val authRepository: AuthRepository
) {

     suspend operator fun invoke(user: String, password: String): UserModel? {
        if (user.contains("@hotmail.com")) {
            return null
        }
        val response = authRepository.doLogin(user, password)
         return response.random()
    }
}