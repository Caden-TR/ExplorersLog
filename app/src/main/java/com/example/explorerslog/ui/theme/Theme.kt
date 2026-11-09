package com.example.explorerslog.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Navy = Color(0xFF10233A)
private val Paper = Color(0xFFF7F5EF)
private val Green = Color(0xFF17704A)
private val Orange = Color(0xFFF2A65A)

private val AppColours = lightColorScheme(
    primary = Green,
    onPrimary = Color.White,
    secondary = Orange,
    onSecondary = Navy,
    background = Paper,
    onBackground = Navy,
    surface = Paper,
    onSurface = Navy,
)

// You do not need to change this file. It sets the colours used by buttons and text.
@Composable
fun ExplorersLogTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = AppColours, content = content)
}
