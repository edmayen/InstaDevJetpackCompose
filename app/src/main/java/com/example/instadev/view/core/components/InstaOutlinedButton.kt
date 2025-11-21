package com.example.instadev.view.core.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun InstaOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    colors: Color = MaterialTheme.colorScheme.primary
) {
    OutlinedButton (
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        border = BorderStroke(
            1.dp,
            colors
        )
    ) {
        InstaText(
            modifier = Modifier.padding(vertical = 4.dp),
            text = text,
            color = colors
        )
    }
}