package com.example.prakramapp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun AddProfileScreen(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var dob by remember { mutableStateOf("") }
    var occupation by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Image(
            painter = painterResource(id = R.drawable.threeiconmenuback),
            contentDescription ="background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(
                    alpha = 0.8f
                )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.default_photo),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )

            androidx.compose.material3.Text(
                text = "Dr. Rohit Savita",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                fontSize = 33.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W800,
                color= Color.White
                )

            androidx.compose.material3.Text(
                text = "Phone No- +917355001237",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W800,
                color= Color.White

                )
            androidx.compose.material3.Text(
                text = "Dr. Rohit Savita is a psychiatrist who specializes in the diagnosis, treatment, and prevention of mental health disorders. He has completed his medical training in psychiatry and is trained to offer a range of mental health treatments, including psychotherapy and medication management.\n" +
                        "\n" +
                        "As a psychiatrist, Dr. Savita has expertise in the treatment of a variety of mental health conditions, such as depression, anxiety, bipolar disorder, schizophrenia, personality disorders, and addiction. He works with his patients to develop personalized treatment plans that may include therapy, medication, and lifestyle modifications.\n" +
                        "\n" +
                        "Dr. Savita is committed to providing compassionate and comprehensive care to his patients. He takes the time to listen to their concerns, understand their needs, and work with them to achieve their goals. He believes that mental health is just as important as physical health and strives to help his patients achieve optimal mental well-being.",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                fontSize = 21.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W800,
                color= Color.White

                )
        }

    }

}
//@Preview(showBackground = true)
//@Composable
//fun AddProfileScreenPreview() {
//    AddProfileScreen(navController)
//}

