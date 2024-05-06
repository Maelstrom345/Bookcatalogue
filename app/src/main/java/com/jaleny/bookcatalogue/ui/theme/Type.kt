package com.jaleny.bookcatalogue.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jaleny.bookcatalogue.R

private val Grotesk = FontFamily(
    Font(R.font.grotesk_light),
    Font(R.font.grotesk_medium, FontWeight.W500),
    Font(R.font.grotesk_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    displayMedium = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W600,
        fontSize = 48.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    headlineSmall= TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Grotesk,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Grotesk,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp

    )
)