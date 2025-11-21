package com.example.instadev.view.auth.register

data class RegisterUiState(
    val phoneNumber: String = "",
    val isPhoneNumberValid: Boolean = false,
    val isLoading: Boolean = false,
)