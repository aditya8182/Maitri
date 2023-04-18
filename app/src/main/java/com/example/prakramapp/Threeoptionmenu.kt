package com.example.prakramapp

//import androidx.compose.material.icons.filled.LibraryMusic
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Threeoptionmenu(navController: NavHostController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(R.drawable.krishna),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                TextButton(
                    onClick = {navController.navigate(consultant.route) },
                    modifier = Modifier
                        .size(140.dp)
                        .background(Color.Gray.copy(alpha = 0.7f), RoundedCornerShape(16.dp))
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.consultant),
                            contentDescription = "Consultant",
                            Modifier.size(90.dp)
                        )
                        Text(
                            text = "Consultant",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily.Serif
                        )
                    }
                }

                Spacer(modifier = Modifier.size(32.dp))
                TextButton(
                    onClick = { navController.navigate(chatbot1.route) },
                    modifier = Modifier
                        .size(140.dp)
                        .background(Color.Gray.copy(alpha = 0.7f), RoundedCornerShape(16.dp))
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chatbot),
                            contentDescription = "Chatbot",
                            Modifier.size(86.dp)
                        )
                        Text(
                            text = "Chatbot",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily.Serif
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(32.dp))
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.size(90.dp))
                TextButton(
                    onClick = { navController.navigate(gita_content.route) },
                    modifier = Modifier
                        .size(140.dp)
                        .background(Color.Gray.copy(alpha = 0.7f), RoundedCornerShape(16.dp))
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.book),
                            contentDescription = "Gita Book",
                            Modifier.size(90.dp)
                        )
                        Text(
                            text = "Gita",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily.Serif
                        )
                    }
                }
            }
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                fontFamily = FontFamily(
                    Font(R.font.bold)
                ),
                text = "Maitri",
                fontSize = 80.sp,
                color = Color.DarkGray
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun Threeoptionpreview()
//{
//    Threeoptionmenu(navController)
//}
