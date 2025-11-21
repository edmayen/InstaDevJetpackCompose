package com.example.instadev.view.auth.registerbyemail

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instadev.R
import com.example.instadev.view.core.components.InstaButton
import com.example.instadev.view.core.components.InstaOutlinedButton
import com.example.instadev.view.core.components.InstaOutlinedTextField
import com.example.instadev.view.core.components.InstaText

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegisterEmailScreen() {

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
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = padding)
                    .padding(horizontal = 16.dp)
            ) {
                InstaText(
                    modifier = Modifier.padding(top = 8.dp),
                    text = stringResource(R.string.register_screen_title_email),
                    style = MaterialTheme.typography.titleLarge
                )
                InstaText(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.register_screen_subtitle_email),
                    style = MaterialTheme.typography.bodyMedium
                )
                InstaOutlinedTextField(
                    modifier = Modifier.padding(top = 12.dp),
                    textHint = stringResource(R.string.register_screen_textfield_register_email),
                    value = "",
                    onValueChange = { email ->

                    }
                )
                InstaText(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.register_screen_body_email),
                    style = MaterialTheme.typography.bodySmall
                )
                InstaButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    text = stringResource(R.string.register_screen_button_next),
                    enabled = false,
                    onClick = {}
                )
                InstaOutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    text = stringResource(R.string.register_screen_button_register_with_phone),
                    onClick = {}
                )
            }
        }
    )

}