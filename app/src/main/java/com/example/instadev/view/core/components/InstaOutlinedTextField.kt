package com.example.instadev.view.core.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun InstaOutlinedTextField(
    modifier: Modifier = Modifier,
    textHint: String,
    colorHint: Color = MaterialTheme.colorScheme.onBackground,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(30),
        value = value,
        label = {
            InstaText(
                text = textHint,
                color = colorHint
            )
        },
        onValueChange = {
            onValueChange(it)
        }
    )
}