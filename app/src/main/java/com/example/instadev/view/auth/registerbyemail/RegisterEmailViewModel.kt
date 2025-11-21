package com.example.instadev.view.auth.registerbyemail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RegisterEmailViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(RegisterEmailUiState())
    val uiState = _uiState.asStateFlow()

    fun onEmailChange(email: String) {
        _uiState.update { it.copy(email = email) }
        isEmailValid()
    }

    private fun isEmailValid() {
        val isValid = android.util.Patterns.EMAIL_ADDRESS.matcher(_uiState.value.email).matches()
        _uiState.update { it.copy(isEmailValid = isValid) }
    }

}