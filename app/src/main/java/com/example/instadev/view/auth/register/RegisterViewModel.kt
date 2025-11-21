package com.example.instadev.view.auth.register

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RegisterViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(RegisterUiState())
    val uiState: StateFlow<RegisterUiState> = _uiState.asStateFlow()

    fun onPhoneNumberChange(phoneNumber: String) {
        _uiState.update {
            it.copy(phoneNumber = phoneNumber)
        }
        isPhoneNumberValid(phoneNumber)
    }

    private fun isPhoneNumberValid(phoneNumber: String) {
        val isValid = phoneNumber.length == 10
        _uiState.update {
            it.copy(isPhoneNumberValid = isValid)
        }
    }

}