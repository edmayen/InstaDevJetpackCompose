package com.example.instadev.view.auth.login

data class LoginUiState(
    val email: String = "aris@aris.com",
    val password: String = "123qwerty",
    val isLoading: Boolean = false,
    val isLoginEnabled: Boolean = false
)
