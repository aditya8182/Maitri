package com.example.prakramapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextPainter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun GitaScreen(navController: NavHostController) {
    BoxWithConstraints {
        val constraints =
            maxWidth / 2 // set the maximum width of the image to half of the screen width
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription ="background Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer(
                        alpha = 0.8f
                    )
            )

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Chapters",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                )

                Button(onClick = {

                    navController.navigate(chapter1.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 1",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter2.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 2",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter3.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 3",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter4.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 4",
                        color = Color.Yellow
                    )
                }
               Button(onClick = {

                    navController.navigate(chapter5.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 5",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter6.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 6",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter7.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 7",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter8.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                   colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 8",
                        color = Color.Yellow
                   )
                }
                Button(onClick = {

                    navController.navigate(chapter9.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 9",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter10.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 10",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter11.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 11",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter12.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 12",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter13.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 13",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter14.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 14",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter15.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 15",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter16.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 16",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter17.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 17",
                        color = Color.Yellow
                    )
                }
                Button(onClick = {

                    navController.navigate(chapter18.route)
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(vertical = 8.dp),
                    colors = buttonColors(Color.Gray)
                ) {
                    Text(text = "Chapter 18",
                        color = Color.Yellow
                    )
                }



            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun Gitapreview()
//{
//    MyScreen()
//}

