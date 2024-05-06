package com.jaleny.bookcatalogue.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.jaleny.bookcatalogue.ui.theme.Typography
import com.jaleny.bookcatalogue.ui.theme.primary
import com.jaleny.bookcatalogue.ui.theme.text


@Composable
fun BookDetailsCard3(

) {

    // Transparent white bg
    Box(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(start = 20.dp, end = 16.dp, top = 40.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = Color.Transparent),
        contentAlignment = Alignment.Center
    ) {

        // white box layout
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.onSurface),
        )

        // Content
        BookImageContentView3()

    }
}



@Composable
fun BookImageContentView3(

) {
    // content
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

        // image
        Image(
            painter = rememberAsyncImagePainter(
                model =  "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/allen.jpg"
            ),
            contentDescription = "",
            modifier = Modifier
                .size(240.dp, 140.dp),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onSurface)
                .padding(bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Zend Framework in Action",
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center,
                color = text
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Tariq Ahmed with Jon Hirschi, Faisal Abid",
                style = MaterialTheme.typography.labelMedium,
                textAlign = TextAlign.Center,
                color = text.copy(0.7F)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(24.dp))
                    .background(primary.copy(.10F))
                    .padding(start = 12.dp, end = 12.dp, top = 5.dp, bottom = 5.dp),
                contentAlignment = Alignment.Center
            ) { Text(text = "Open Source, Mobile", style = Typography.labelMedium, color = primary) }

        }
        Text(
            text =  "Zend Framework in Action is a comprehensive tutorial that shows how to use the Zend Framework to create web-based applications and web services. This book takes you on an over-the-shoulder tour of the components of the Zend Framework as you build a high quality, real-world web application.",
        )
    }}