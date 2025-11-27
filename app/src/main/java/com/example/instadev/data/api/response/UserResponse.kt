package com.example.instadev.data.api.response

import com.example.instadev.common.UserModeCatalog
import com.example.instadev.domain.model.UserModel

data class UserResponse(
    val userId: String?,
    val name: String?,
    val nickName: String?,
    val followers: Int?,
    val following: List<String>?,
    val userType: Int?
)

fun UserResponse.toDomain(): UserModel = UserModel(
    userId = userId ?: "",
    name = name ?: "",
    nickName = nickName ?: "",
    followers = followers ?: 0,
    following = following ?: emptyList(),
    userType = UserModeCatalog.getEnumByType(userType ?: 0)

)