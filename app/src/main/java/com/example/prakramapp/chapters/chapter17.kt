package com.example.prakramapp.chapters




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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
import com.example.prakramapp.R


@Composable
fun Chapter17(navController: NavHostController) {
    BoxWithConstraints {
        val constraints =
            maxWidth / 2 // set the maximum width of the image to half of the screen width
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.chapterbackground),
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
                    text = "Chapter 17 - Sraddhatraya Vibhaga Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Yoga through Discerning the Three Divisions of Faith",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The seventeenth chapter of the Bhagavad Gita is Sraddhatraya Vibhaga Yoga. In this chapter, Krishna describes the three types of faith corresponding to the three modes of the material nature. Lord Krishna further reveals that it is the nature of faith that determines the quality of life and the character of living entities. Those who have faith in passion and ignorance perform actions that yield temporary, material results while those who have faith in goodness perform actions in accordance with scriptural instructions and hence their hearts get further purified.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 1",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अर्जुन उवाच |\n" +
                            "ये शास्त्रविधिमुत्सृज्य यजन्ते श्रद्धयान्विता: |\n" +
                            "तेषां निष्ठा तु का कृष्ण सत्वमाहो रजस्तम: ॥1॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Arjuna said: But, O Krsna, what is the state [i.e., where do the rites undertaken by them end?] of those who, endued with faith, adore [Adore-perform sacrifices, distribute wealth etc. in honour of gods and others.] by ignoring the injunctions of the scriptures? Is it sattva, rajas or tamas?\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 2",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "श्रीभगवानुवाच |\n" +
                            "त्रिविधा भवति श्रद्धा देहिनां सा स्वभावजा |\n" +
                            "सात्विकी राजसी चैव तामसी चेति तां शृणु ॥2॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "The Blessed Lord said: That faith of the embodied beings, born of their own nature, is threefold-born of sattva, rajas and tamas. Hear about it.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 3",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "सत्वानुरूपा सर्वस्य श्रद्धा भवति भारत |\n" +
                            "श्रद्धामयोऽयं पुरुषो यो यच्छ्रद्ध: स एव स: ॥3॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "O scion of the Bharata dynasty, the faith of all beings is in accordance with their minds. This person is made up of faith as the dominant factor. He is verily what his faith is.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 4",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यजन्ते सात्विका देवान्यक्षरक्षांसि राजसा: |\n" +
                            "प्रेतान्भूतगणांश्चान्ये यजन्ते तामसा जना: ॥4॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Those having the sattva quality worship the gods; those having rajas, the demi-gods and ogres; and other people possessed of tamas worship ghosts and the hosts of spirits.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 5",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अशास्त्रविहितं घोरं तप्यन्ते ये तपो जना: |\n" +
                            "दम्भाहङ्कारसंयुक्ता: कामरागबलान्विता: ॥5॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Those persons who, given to ostentation and pride, and possessed of passion, attachment and strength, undertake severe austerities not sanctioned in the scriptures;",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 6",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "कर्षयन्त: शरीरस्थं भूतग्राममचेतस: |\n" +
                            "मां चैवान्त:शरीरस्थं तान्विद्ध्यासुरनिश्चयान् ॥6॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "(And who,) being non-discriminating, torture, all the organs in the body as also even Me who reside in the body, -know them as possessed of demoniacal conviction.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 7",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "आहारस्त्वपि सर्वस्य त्रिविधो भवति प्रिय: |\n" +
                            "यज्ञस्तपस्तथा दानं तेषां भेदमिमं शृणु ॥7॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Food also, which is dear to all, is of three kinds; and so also are sacrifices, austerity and charity. Listen to this classification of them.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 8",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "आयु:सत्वबलारोग्यसुखप्रीतिविवर्धना: |\n" +
                            "रस्या: स्निग्धा: स्थिरा हृद्या आहारा: सात्विकप्रिया: ॥8॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Foods that augment life, firmness of mind, strength, health, happiness and delight, and which are succulent, oleaginous, substantial and agreeable, are dear to one endowed with sattva.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 9",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "कट्वम्ललवणात्युष्णतीक्ष्णरूक्षविदाहिन: |\n" +
                            "आहारा राजसस्येष्टा दु:खशोकामयप्रदा: ॥9॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Foods that are bitter, sour, salty, very hot, pungent, dry and burning, and which production pain, sorrow and disease, are dear to one having rajas.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 10",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यातयामं गतरसं पूति पर्युषितं च यत् |\n" +
                            "उच्छिष्टमपि चामेध्यं भोजनं तामसप्रियम् ॥10॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Food which is not properly cooked, lacking in essence, putrid and stale, and even ort and that which is unfit for sacrifice, is dear to one possessed of tamas.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 11",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अफलाकाङ्क्षिभिर्यज्ञो विधिदृष्टो य इज्यते |\n" +
                            "यष्टव्यमेवेति मन: समाधाय स सात्विक: ॥11॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "That sacrifice which is in accordance with the injunctions, (and is) performed by persons who do not hanker after results, and with the mental conviction that it is surely obligatory, is done through sattva.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 12",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अभिसन्धाय तु फलं दम्भार्थमपि चैव यत् |"+
              "  इज्यते भरतश्रेष्ठ तं यज्ञं विद्धि राजसम् ॥12॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "But that sacrifice which is performed having in view a result, as also for ostentation, -know that sacrifice to be done through rajas, O greatest among the descendants of Bharata.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 13",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "विधिहीनमसृष्टान्नं मन्त्रहीनमदक्षिणम् |\n" +
                            "श्रद्धाविरहितं यज्ञं तामसं परिचक्षते ॥13॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "They declare that sacrifice as 'done through tamas' which is contrary to injunction, in which food is not distributed, in which mantras are not used, in which offerings are not made to priests, and which is devoid of faith.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 14",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "देवद्विजगुरुप्राज्ञपूजनं शौचमार्जवम् |\n" +
                            "ब्रह्मचर्यमहिंसा च शारीरं तप उच्यते ॥14॥\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "The worship of gods, twice-born, venerable persons and the wise; purity, straightforwardness, celibacy and non-injury, -are said to be bodily austerity.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 15",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अनुद्वेगकरं वाक्यं सत्यं प्रियहितं च यत् |\n" +
                            "स्वाध्यायाभ्यसनं चैव वाङ्मयं तप उच्यते ॥15॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "That speech which causes no pain, which is true, agreeable and beneficial; as well as the practice of study of the scriptures, -is said to be austerity of speech.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 16",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "मन: प्रसाद: सौम्यत्वं मौनमात्मविनिग्रह: |\n" +
                            "भावसंशुद्धिरित्येतत्तपो मानसमुच्यते ॥16॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Tranquillity of mind, gentleness, reticence, withdrawal of the mind, purity of heart, -these are what is called mental austerity.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 17",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "श्रद्धया परया तप्तं तपस्तत्त्रिविधं नरै: |\n" +
                            "अफलाकाङ्क्षिभिर्युक्तै: सात्विकं परिचक्षते ॥17॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "When that threefold austerity is undertaken with supreme faith by people who do not hanker after results and are self-controlled, they speak of it as born of sattva.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 18",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "सत्कारमानपूजार्थं तपो दम्भेन चैव यत् |\n" +
                            "क्रियते तदिह प्रोक्तं राजसं चलमध्रुवम् ॥18॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "That austerity which is undertaken for earning a name, being honoured and worshipped, and also ostentatiously, -that is spoken of as born of rajas, belonging to this world, uncertain and transitory.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 19",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "मूढग्राहेणात्मनो यत्पीडया क्रियते तप: |\n" +
                            "परस्योत्सादनार्थं वा तत्तामसमुदाहृतम् ॥19॥\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "That austerity which is undertaken with a foolish intent, by causing pain to oneself, or for the destruction of others-that is said to be born of tamas.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 20",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "दातव्यमिति यद्दानं दीयतेऽनुपकारिणे |\n" +
                            "देशे काले च पात्रे च तद्दानं सात्विकं स्मृतम् ॥20॥\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "That gift is referred to as born of sattva which gift is given with the idea that it ought to be given, to one who will not serve in return, and at the (proper) place, (proper) time and to a (proper) person.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 21",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यत्तु प्रत्युपकारार्थं फलमुद्दिश्य वा पुन: |\n" +
                            "दीयते च परिक्लिष्टं तद्दानं राजसं स्मृतम् ॥21॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "But the gift which is given expecting reciprocation, or again, with a desire for its result, and which is given grudgingly, - that is considered to be born of rajas.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 22",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अदेशकाले यद्दानमपात्रेभ्यश्च दीयते |\n" +
                            "असत्कृतमवज्ञातं तत्तामसमुदाहृतम् ॥22॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "The gift which is made at an improper place and time, and to undeserving persons, without proper treatment and with disdain, is declared to be born of tamas.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 23",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "ॐ तत्सदिति निर्देशो ब्रह्मणस्त्रिविध: स्मृत: |\n" +
                            "ब्राह्मणास्तेन वेदाश्च यज्ञाश्च विहिता: पुरा ॥23॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "'Om-tat-sat' ['Om, That, Existence': 'Om iti brahma, Om is Brahman'; 'Tattvamasi, Thou art That'; and 'Sadeva somya idamagra asit, This was Existence alone in the beginning, O amiable one'-in these texts Brahman is indicated by the words Om, tat, sat.]-this is considered to be the threefold designation of Brahman. The Brahmanas and Vedas and the sacrifices were ordained by that in the days of yore.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 24",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तस्माद् ॐ इत्युदाहृत्य यज्ञदानतप:क्रिया: |\n" +
                            "प्रवर्तन्ते विधानोक्ता: सततं ब्रह्मवादिनाम् ॥24॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Therefore, acts of sacrifice, charity and austerity as prescribed through injunctions, of those who study and expound the Vedas, always commence after uttering the syllable Om.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 25",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तदित्यनभिसन्धाय फलं यज्ञतप:क्रिया: |\n" +
                            "दानक्रियाश्च विविधा: क्रियन्ते मोक्षकाङ्क्षिभि: ॥25॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "After (uttering) the word tat, acts of sacrifice and austerity as also the various acts of charity are performed without regard for results by persons aspiring for Liberation.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 26",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "सद्भावे साधुभावे च सदित्येतत्प्रयुज्यते |\n" +
                            "प्रशस्ते कर्मणि तथा सच्छब्द: पार्थ युज्यते ॥26॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "This word sat is used with regard to (something) coming into being and with regard to (someone) becoming good. So also, O son of Prtha, the word sat is used with regard to an auspicious rite.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 27",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यज्ञे तपसि दाने च स्थिति: सदिति चोच्यते |\n" +
                            "कर्म चैव तदर्थीयं सदित्येवाभिधीयते ॥27॥",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "And the steadfastness in sacrifice, austerity and charity is spoken of as sat. And even the action meant for these is, verily, called as sat (good).\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 28",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अश्रद्धया हुतं दत्तं तपस्तप्तं कृतं च यत् |\n" +
                            "असदित्युच्यते पार्थ न च तत्प्रेत्य नो इह ॥28॥\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "Translation",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "O son of Prtha, whatever is offered in sacrifice and given in charity, as also whatever austerity is undertaken or whatever is done without, faith, is said to be of on avail. And it is of no conscience after death, nor here.\n" +
                            "\n",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun Chapter2preview(){
//    Chapter2()
//}
