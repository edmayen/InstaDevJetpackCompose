package com.example.instadev.view.auth.registerbyphone

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RegisterByPhoneViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(RegisterByPhoneUiState())
    val uiState: StateFlow<RegisterByPhoneUiState> = _uiState.asStateFlow()

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