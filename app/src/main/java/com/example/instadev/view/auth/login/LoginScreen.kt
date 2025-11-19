package com.example.instadev.view.auth.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.instadev.R
import com.example.instadev.view.core.components.InstaButton
import com.example.instadev.view.core.components.InstaText

@Preview
@Composable
fun LoginScreen(
    viewModel: LoginViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(horizontal = 24.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            InstaText(
                modifier = Modifier
                    .padding(top = 24.dp),
                text = stringResource(R.string.login_screen_header_text_spain),
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(Modifier.weight(1f))
            Image(
                modifier = Modifier
                    .size(56.dp),
                painter = painterResource(R.drawable.instadev_logo),
                contentDescription = "InstaDev logo header"
            )
            Spacer(Modifier.weight(1.3f))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(30),
                value = uiState.email,
                label = {
                    InstaText(
                        text = stringResource(R.string.login_screen_textfield_email),
                        color = MaterialTheme.colorScheme.onBackground
                    )
                },
                onValueChange = {
                    viewModel.onEmailChange(it)
                }
            )
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(30),
                value = uiState.password,
                label = {
                    InstaText(
                        text = stringResource(R.string.login_screen_textfield_password),
                        color = MaterialTheme.colorScheme.onBackground
                    )
                },
                onValueChange = {
                    viewModel.onPasswordChange(it)
                }
            )
            Spacer(Modifier.height(12.dp))
            InstaButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(R.string.login_screen_button_login),
                enabled = uiState.isLoginEnabled,
                onClick = {}
            )
            TextButton(onClick = {}) {
                InstaText(
                    text = stringResource(R.string.login_screen_text_forgot_password),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(Modifier.weight(1f))
            OutlinedButton (
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                border = BorderStroke(
                    1.dp,
                    MaterialTheme.colorScheme.primary
                )
            ) {
                InstaText(
                    modifier = Modifier.padding(vertical = 4.dp),
                    text = stringResource(R.string.login_screen_button_register),
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Icon(
                modifier = Modifier
                    .width(60.dp)
                    .padding(vertical = 24.dp),
                painter = painterResource(R.drawable.ic_meta),
                contentDescription = "Meta logo footer",
                tint = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}