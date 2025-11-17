package com.example.instadev.view.auth.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    fun onEmailChange(email: String) {
        _uiState.update { state ->
            state.copy(email = email)
        }
        isFormValid()
    }

    fun onPasswordChange(pass: String) {
        _uiState.update { state ->
            state.copy(password = pass)
        }
        isFormValid()
    }

     private fun isEmailValid(): Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(_uiState.value.email).matches()


    private fun isPasswordValid(): Boolean = _uiState.value.password.length >= 8


    fun isFormValid() {
        val enabledSetting =isEmailValid() && isPasswordValid()
        _uiState.update { state ->
            state.copy(isLoginEnabled = enabledSetting)
        }
    }



}

