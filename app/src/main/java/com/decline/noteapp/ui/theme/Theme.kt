package com.decline.noteapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = PrimaryDark,
    onPrimary = onPrimaryDark,
    secondary = SecondaryDark,
    onSecondary = onSecondaryDark,
    surface = SurfaceDark,
    onSurface = onSurfaceLight,
    background = BackgroundDark,
    onBackground = onBackgroundDark
)

private val LightColorPalette = lightColors(
    primary = PrimaryLight,
    onPrimary = onPrimaryLight,
    secondary = SecondaryLight,
    onSecondary = onSecondaryLight,
    surface = SurfaceLight,
    onSurface = onSurfaceLight,
    background = BackgroundLight,
    onBackground = onBackgroundLight

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun NoteAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()

    if(darkTheme) {
        systemUiController.setStatusBarColor(
            color = StatusBarColorDark)

    } else {
        systemUiController.setStatusBarColor(
            color = StatusBarColorLight)
    }




    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}