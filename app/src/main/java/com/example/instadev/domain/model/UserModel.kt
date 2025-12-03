package com.example.instadev.domain.model

import com.example.instadev.common.UserModeCatalog

data class UserModel(
    val userId: String,
    val name: String,
    val nickName: String,
    val followers: Int,
    val following: List<String>,
    val userType: UserModeCatalog,
    val verified: Boolean
)

