package com.example.instadev.view.auth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.instadev.domain.usecases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    val loginUseCase: LoginUseCase
): ViewModel() {

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

    fun onClickSelected() {
        viewModelScope.launch {
            loginUseCase.invoke(
                _uiState.value.email,
                _uiState.value.password
            )
        }
    }

     private fun isEmailValid(): Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(_uiState.value.email).matches()


    private fun isPasswordValid(): Boolean = _uiState.value.password.length >= 8


    private fun isFormValid() {
        val enabledSetting =isEmailValid() && isPasswordValid()
        _uiState.update { state ->
            state.copy(isLoginEnabled = enabledSetting)
        }
    }



}

