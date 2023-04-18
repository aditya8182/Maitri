package com.example.prakramapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Prakram(navController: NavHostController) {

    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Image(
                painter = painterResource(id = R.drawable.krishna),
                contentDescription = "Krishna Photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer(
                        alpha = 0.8f,
                        // Blur the image using ImageFilter
                        // Note: requires androidx.compose.ui:ui-graphics dependency
                        //imageFilter = ImageFilter.blur(4.dp, 4.dp)
                    )
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    fontFamily = FontFamily(
                        Font(R.font.bold)
                    ),
                    text = "Maitri",
                    fontSize = 60.sp,
                    color = Color.DarkGray
                )
                Text(
                    text = "सत्त्वमात्मा शरीरं च त्रयमेतन्त्त्रिदण्डत् |\n" +
                            "लोकस्तिष्ठति संयोगात्तत्र सर्वं प्रतिष्ठितम् ||\n" +
                            "स पुमांश्र्चेतनं तच्च तच्चाधिकरणं स्मृतम् |",
                    fontSize = 22.sp,
                    color = Color.Unspecified,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {
                              navController.navigate(secondscreen.route)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                )
                {
                    Text(text = "Get Started")
                }
            }

        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun PrakramAppPreview()
//{
//    Prakram(navController)
//}