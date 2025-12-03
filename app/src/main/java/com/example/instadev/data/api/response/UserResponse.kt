package com.example.instadev.data.api.response

import com.example.instadev.common.UserModeCatalog
import com.example.instadev.domain.model.UserModel
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val userId: String?,
    val name: String?,
    val nickName: String? = "",
    val followers: Int? = 0,
    val following: List<String>? = listOf(),
    val userType: Int?,
    val verified: Boolean? = false
)

fun UserResponse.toDomain(): UserModel = UserModel(
    userId = userId ?: "",
    name = name ?: "",
    nickName = nickName ?: "",
    followers = followers ?: 0,
    following = following ?: emptyList(),
    userType = UserModeCatalog.getEnumByType(userType ?: 0),
    verified = verified ?: false

)