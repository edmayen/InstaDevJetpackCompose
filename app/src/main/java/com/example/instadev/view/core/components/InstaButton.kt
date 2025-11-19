package com.example.instadev.view.core.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun InstaButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit,
    shape: Shape = MaterialTheme.shapes.extraLarge,
    colors: Color = MaterialTheme.colorScheme.primary
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = colors
        ),
        onClick = onClick,
        enabled = enabled,
        shape = shape
    ) {
        InstaText(
            modifier = Modifier.padding(vertical = 4.dp),
            text = text,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}