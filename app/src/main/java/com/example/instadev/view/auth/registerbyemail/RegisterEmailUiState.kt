package com.example.instadev.view.auth.registerbyemail

data class RegisterEmailUiState(
    val email: String = "",
    val isEmailValid: Boolean = false,
    val isLoading: Boolean = false,
)