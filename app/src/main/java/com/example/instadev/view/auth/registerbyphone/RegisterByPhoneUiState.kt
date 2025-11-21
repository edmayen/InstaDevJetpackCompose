package com.example.instadev.view.auth.registerbyphone

data class RegisterByPhoneUiState(
    val phoneNumber: String = "",
    val isPhoneNumberValid: Boolean = false,
    val isLoading: Boolean = false,
)