package com.example.instadev.data.repository

import android.util.Log
import com.example.instadev.data.api.ApiService
import com.example.instadev.data.api.response.UserResponse
import com.example.instadev.data.api.response.toDomain
import com.example.instadev.domain.model.UserModel
import com.example.instadev.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor (
    private val api: ApiService
): AuthRepository {

    override suspend fun doLogin(user: String, password: String): List<UserModel> {
        val response = try {
            api.doLogin()
        } catch (e: Exception) {
            Log.i("DOLOGIN", e.message.toString())
            listOf()
        }
        return response.map { it.toDomain() }
    }
}