package com.aurora.tv.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val AuroraColorScheme = darkColorScheme(

    primary = AuroraColors.Primary,

    secondary = AuroraColors.Secondary,

    background = AuroraColors.Background,

    surface = AuroraColors.Surface,

    onBackground = AuroraColors.OnBackground,

    onSurface = AuroraColors.OnSurface
)

@Composable
fun AuroraTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(

        colorScheme = AuroraColorScheme,

        typography = AuroraTypography,

        shapes = AuroraShapes,

        content = content
    )

}