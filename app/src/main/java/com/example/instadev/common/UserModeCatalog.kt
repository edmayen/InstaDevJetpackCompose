package com.example.instadev.common


enum class UserModeCatalog(val userType: Int) {
    REGULAR_USER(0),
    CONTENT_CREATOR_USER(1),
    BUSINESS_USER(2);

    companion object {
        @JvmStatic
        fun getEnumByType(userType: Int): UserModeCatalog {
            return UserModeCatalog.entries.first { it.userType == userType }
        }
    }
}
