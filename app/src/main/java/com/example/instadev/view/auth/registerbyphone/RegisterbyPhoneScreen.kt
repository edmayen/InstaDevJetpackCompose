package com.example.instadev.view.auth.registerbyphone

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.instadev.R
import com.example.instadev.view.core.components.InstaButton
import com.example.instadev.view.core.components.InstaOutlinedButton
import com.example.instadev.view.core.components.InstaOutlinedTextField
import com.example.instadev.view.core.components.InstaText

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegisterByPhoneScreen(
    viewModel: RegisterByPhoneViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                ),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBackIosNew,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = it)
                    .padding(horizontal = 16.dp)
            ) {
                InstaText(
                    modifier = Modifier.padding(top = 8.dp),
                    text = stringResource(R.string.register_screen_title_phone),
                    style = MaterialTheme.typography.titleLarge
                )
                InstaText(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.register_screen_subtitle_phone),
                    style = MaterialTheme.typography.bodyMedium
                )
                InstaOutlinedTextField(
                    modifier = Modifier.padding(top = 12.dp),
                    textHint = stringResource(R.string.register_screen_textfield_register_phone),
                    value = uiState.phoneNumber,
                    onValueChange = { phoneNumber ->
                        viewModel.onPhoneNumberChange(phoneNumber)
                    }
                )
                InstaText(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.register_screen_body),
                    style = MaterialTheme.typography.bodySmall
                )
                InstaButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    text = stringResource(R.string.register_screen_button_next),
                    enabled = uiState.isPhoneNumberValid,
                    onClick = {}
                )
                InstaOutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    text = stringResource(R.string.register_screen_button_register_with_email),
                    onClick = {}
                )
            }
        }
    )
}