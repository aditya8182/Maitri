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
fun Chapter4(navController: NavHostController) {
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
                    text = "Chapter 4 - Jnana Karma Sanyasa Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Path of Knowledge and the Disciplines of Action",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The fourth chapter of the Bhagavad Gita is Jnana Karma Sanyasa Yoga. In this chapter, Krishna glorifies the Karma Yoga and imparts the Transcendental Knowledge (the knowledge of the soul and the Ultimate Truth) to Arjuna. He reveals the reason behind his appearance in this material world. He reveals that even though he is eternal, he reincarnates time after time to re-establish dharma and peace on this Earth. His births and activities are eternal and are never contaminated by material flaws. Those persons who know and understand this Truth engage in his devotion with full faith and eventually attain Him. They do not have to take birth in this world again.\n" +
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
                    text = "श्रीभगवानुवाच |\n" +
                            "इमं विवस्वते योगं प्रोक्तवानहमव्ययम् |\n" +
                            "विवस्वान्मनवे प्राह मनुरिक्ष्वाकवेऽब्रवीत् ॥1॥",
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
                    text = "The Blessed Lord said: I imparted this imperishable Yoga to Vivasvan(Sun-God), Vivasvan taught this to Manu, and Manu transmitted this to Iksavaku.\n" +
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
                    text = "एवं परम्पराप्राप्तमिमं राजर्षयो विदु: |\n" +
                            "स कालेनेह महता योगो नष्ट: परन्तप ॥2॥",
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
                    text = "The king-sages knew this (yoga) which was received thus in regular succession. That Yoga, O destroyer of foes, in now lost owing to a long lapse of time.\n" +
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
                    text = "स एवायं मया तेऽद्य योग: प्रोक्त: पुरातन: |\n" +
                            "भक्तोऽसि मे सखा चेति रहस्यं ह्येतदुत्तमम् ॥3॥",
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
                    text = "That ancient Yoga itself, which is this, has been taught to you by Me today, considering that you are My devotee and friend, For, this (Yoga) is a profound secret.\n" +
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
                    text = "अर्जुन उवाच |\n" +
                            "अपरं भवतो जन्म परं जन्म विवस्वत: |\n" +
                            "कथमेतद्विजानीयां त्वमादौ प्रोक्तवानिति ॥4॥",
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
                    text = "Arjuna said: Your birth was later, (whereas) the birth of Vivasvan(Sun-God) was earlier. How am I to understand this that You instructed (him) in the beginning?\n" +
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
                    text = "श्रीभगवानुवाच |\n" +
                            "बहूनि मे व्यतीतानि जन्मानि तव चार्जुन |\n" +
                            "तान्यहं वेद सर्वाणि न त्वं वेत्थ परन्तप ॥5॥",
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
                    text = "The Blessed Lord said: O Arjuna, many lives of Mine have passed, and so have yours. I know them all, (but) you know not, O scorcher of enemies!\n" +
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
                    text = "अजोऽपि सन्नव्ययात्मा भूतानामीश्वरोऽपि सन् |\n" +
                            "प्रकृतिं स्वामधिष्ठाय सम्भवाम्यात्ममायया ॥6॥",
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
                    text = "Though I am birthless, undecaying by nature, and the Lord of beings, (still) by subjugating My Prakriti, I take birth by means of My own Maya.",
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
                    text = "यदा यदा हि धर्मस्य ग्लानिर्भवति भारत |\n" +
                            "अभ्युत्थानमधर्मस्य तदात्मानं सृजाम्यहम् ॥7॥",
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
                    text = "O scion of the Bharata dynasty, whenever righteousness is on the decline, unrighteousness is in the ascendant, then I body Myself forth.\n" +
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
                    text = "परित्राणाय साधूनां विनाशाय च दुष्कृताम् |\n" +
                            "धर्मसंस्थापनार्थाय सम्भवामि युगे युगे ॥8॥",
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
                    text = "For the protection of the pious, the destruction of the evil-doers, and establishing virtue, I manifest Myself in every age.",
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
                    text = "जन्म कर्म च मे दिव्यमेवं यो वेत्ति तत्त्वत: |\n" +
                            "त्यक्त्वा देहं पुनर्जन्म नैति मामेति सोऽर्जुन ॥9॥",
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
                    text = "He who thus knows truly the divine birth and actions of Mine does not get re-birth after casting off the body. He attains Me, O Arjuna.\n" +
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
                    text = "वीतरागभयक्रोधा मन्मया मामुपाश्रिता: |\n" +
                            "बहवो ज्ञानतपसा पूता मद्भावमागता: ॥10॥",
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
                    text = "Many who were devoid of attachment, fear and anger, who were absorbed in Me, who had taken refuge in Me, and were purified by the austerity of Knowledge, have attained My state.",
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
                    text = "ये यथा मां प्रपद्यन्ते तांस्तथैव भजाम्यहम् |\n" +
                            "मम वर्त्मानुवर्तन्ते मनुष्या: पार्थ सर्वश: ॥11॥",
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
                    text = "According to the manner in which they approach Me, I favour them in that very manner. O son of Partha, human beings follow My path in every way.",
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
                    text = "काङ् क्षन्त: कर्मणां सिद्धिं यजन्त इह देवता: |\n" +
                            "क्षिप्रं हि मानुषे लोके सिद्धिर्भवति कर्मजा ॥12॥",
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
                    text = "Longing for the fruition of actions (of their rites and duties), they worship the gods here. For, in the human world, success from action comes quickly.\n" +
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
                    text = "चातुर्वर्ण्यं मया सृष्टं गुणकर्मविभागश: |\n" +
                            "तस्य कर्तारमपि मां विद्ध्यकर्तारमव्ययम् ॥13॥",
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
                    text = "The four castes have been created by Me through a classification of the gunas and duties. Even though I am the agent of that (act of classification), still know Me to be a non-agent and changeless.\n" +
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
                    text = "न मां कर्माणि लिम्पन्ति न मे कर्मफले स्पृहा |\n" +
                            "इति मां योऽभिजानाति कर्मभिर्न स बध्यते ॥14॥",
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
                    text = "न मां कर्माणि लिम्पन्ति न मे कर्मफले स्पृहा |\n" +
                            "इति मां योऽभिजानाति कर्मभिर्न स बध्यते ॥14॥",
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
                    text = "न मां कर्माणि लिम्पन्ति न मे कर्मफले स्पृहा |\n" +
                            "इति मां योऽभिजानाति कर्मभिर्न स बध्यते ॥14॥",
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
                    text = "Having known thus, duties were performed even by the ancient seekers of Liberation. Therefore, you undertake action itself as was performed earlier by the ancient ones.\n" +
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
                    text = "किं कर्म किमकर्मेति कवयोऽप्यत्र मोहिता: |\n" +
                            "तत्ते कर्म प्रवक्ष्यामि यज्ज्ञात्वा मोक्ष्यसेऽशुभात् ॥16॥",
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
                    text = "Even the intelligent are confounded as to what is action and what is inaction. I shall tell you of that action by knowing which you will become free from evil.\n" +
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
                    text = "कर्मणो ह्यपि बोद्धव्यं बोद्धव्यं च विकर्मण: |\n" +
                            "अकर्मणश्च बोद्धव्यं गहना कर्मणो गति: ॥17॥",
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
                    text = "For there is something to be known even about action, and something to be known about prohibited action; and something has to be known about inaction. The true nature of action is inscrutable.\n" +
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
                    text = "कर्मण्यकर्म य: पश्येदकर्मणि च कर्म य: |\n" +
                            "स बुद्धिमान्मनुष्येषु स युक्त: कृत्स्नकर्मकृत् ॥18॥",
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
                    text = "He who finds inaction in action, and action in inaction, he is the wise one [Possessed of the knowledge of Brahman] among men; he is engaged in yoga and is a performer of all actions!\n" +
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
                    text = "यस्य सर्वे समारम्भा: कामसङ्कल्पवर्जिता: |\n" +
                            "ज्ञानाग्निदग्धकर्माणं तमाहु: पण्डितं बुधा: ॥19॥",
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
                    text = "The wise call him learned whose actions are all devoid of desires and their thoughts, and whose actions have been burnt away by the fire of wisdom.\n" +
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
                    text = "त्यक्त्वा कर्मफलासङ्गं नित्यतृप्तो निराश्रय: |\n" +
                            "कर्मण्यभिप्रवृत्तोऽपि नैव किञ्चित्करोति स: ॥20॥",
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
                    text = "Having given up attachment to the results of action, he who is ever-contented, dependent on nothing, he really does not do anything even though engaged in action.",
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
                    text = "निराशीर्यतचित्तात्मा त्यक्तसर्वपरिग्रह: |\n" +
                            "शारीरं केवलं कर्म कुर्वन्नाप्नोति किल्बिषम् ॥21॥\n",
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
                    text = "One who is without solicitation, who has the mind and organs under control, (and) is totally without possessions, he incurs no sin by performing actions merely for the (maintenance of the) body.",
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
                    text = "यदृच्छालाभसन्तुष्टो द्वन्द्वातीतो विमत्सर: |\n" +
                            "सम: सिद्धावसिद्धौ च कृत्वापि न निबध्यते ॥22॥",
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
                    text = "Remaining satisfied with what comes unasked for, having transcended the dualities, being free from spite, and equipoised under success and failure, he is not bound even by performing actions.\n" +
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
                    text = "गतसङ्गस्य मुक्तस्य ज्ञानावस्थितचेतस: |\n" +
                            "यज्ञायाचरत: कर्म समग्रं प्रविलीयते ॥23॥",
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
                    text = "Of the liberated person who has got rid of attachment, whose mind is fixed in Knowledge, actions undertaken for a sacrifice get totally destroyed.\n" +
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
                    text = "ब्रह्मार्पणं ब्रह्म हविर्ब्रह्माग्नौ ब्रह्मणा हुतम् |\n" +
                            "ब्रह्मैव तेन गन्तव्यं ब्रह्मकर्मसमाधिना ॥24॥",
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
                    text = "The ladle is Brahman, the oblations is Brahman, the offering is poured by Brahman in the fire of Brahman. Brahman alone is to be reached by him who has concentration on Brahman as the objective [As an object to be known and attained. (Some translate brahma-karma-samadhina as, 'by him who sees Brahman in action'.)\n" +
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
                    text = "दैवमेवापरे यज्ञं योगिन: पर्युपासते |\n" +
                            "ब्रह्माग्नावपरे यज्ञं यज्ञेनैवोपजुह्वति ॥25॥",
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
                    text = "Other yogis undertake sacrifice to gods alone, Others offer the Self, as a sacrifice by the Self itself, in the fire of Brahman.",
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
                    text = "Other yogis undertake sacrifice to gods alone, Others offer the Self, as a sacrifice by the Self itself, in the fire of Brahman.",
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
                    text = "Others offer the organs, viz ear etc., in the fires of self-control. Others offer the objects, viz sound etc., in the fires of the organs.",
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
                    text = "Others offer the organs, viz ear etc., in the fires of self-control. Others offer the objects, viz sound etc., in the fires of the organs.",
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
                    text = "Others offer all the activities of the organs and the activities of the vital force into the fire of the yoga of self-control which has been lighted by Knowledge.\n" +
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
                    text = "द्रव्ययज्ञास्तपोयज्ञा योगयज्ञास्तथापरे |\n" +
                            "स्वाध्यायज्ञानयज्ञाश्च यतय: संशितव्रता: ॥28॥",
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
                    text = "Similarly, others are performers of sacrifices through wealth, through austerity, through yoga, and through study and knowledge; others are ascetics with severe vows.\n" +
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
                    text = "Verse 29-30",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अपाने जुह्वति प्राणं प्राणेऽपानं तथापरे |\n" +
                            "प्राणापानगती रुद्ध्वा प्राणायामपरायणा: ॥29॥\n" +
                            " अपरे नियताहारा: प्राणान्प्राणेषु जुह्वति |\n" +
                            "सर्वेऽप्येते यज्ञविदो यज्ञक्षपितकल्मषा: ॥30॥\n" +
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
                    text = "Constantly practising control of the vital forces by stopping the movements of the outgoing and the incoming breaths, some offer as a sacrifice the outgoing breath in the incoming breath; while still others, the incoming breath in the outgoing breath. Others, having their food regulated, offer the vital forces in the vital forces. All of them are knowers of the sacrifice and have their sins destroyed by sacrifice.\n" +
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
                    text = "Verse 31",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यज्ञशिष्टामृतभुजो यान्ति ब्रह्म सनातनम् |\n" +
                            "नायं लोकोऽस्त्ययज्ञस्य कुतोऽन्य: कुरुसत्तम ॥31॥\n",
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
                    text = "Those who partake of the nectar left over after a sacrifice, reach the eternal Brahman. This world ceases to exist for one who does not perform sacrifices. What to speak of the other (world), O best among the Kurus (Arjuna)!\n" +
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
                    text = "Verse 32",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "एवं बहुविधा यज्ञा वितता ब्रह्मणो मुखे |\n" +
                            "कर्मजान्विद्धि तान्सर्वानेवं ज्ञात्वा विमोक्ष्यसे ॥32॥\n",
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
                    text = "Thus, various kinds of sacrifices lie spread at the mouth of the Vedas. Know them all to be born of action. Knowing thus, you will become liberated.\n" +
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
                    text = "Verse 33",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "श्रेयान्द्रव्यमयाद्यज्ञाज्ज्ञानयज्ञ: परन्तप |\n" +
                            "सर्वं कर्माखिलं पार्थ ज्ञाने परिसमाप्यते ॥33॥",
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
                    text = "O destroyer of enemies, Knowledge considered as a sacrifice is greater than sacrifices requiring materials. O son of Prtha, all actions in their totality culminate in Knowledge.\n" +
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
                    text = "Verse 34",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तद्विद्धि प्रणिपातेन परिप्रश्नेन सेवया |\n" +
                            "उपदेक्ष्यन्ति ते ज्ञानं ज्ञानिनस्तत्त्वदर्शिन: ॥34॥",
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
                    text = "Know that through prostration, inquiry and service. The wise ones who have realized the Truth will impart the Knowledge to you.\n" +
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
                    text = "Verse 35",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यज्ज्ञात्वा न पुनर्मोहमेवं यास्यसि पाण्डव |\n" +
                            "येन भूतान्यशेषेण द्रक्ष्यस्यात्मन्यथो मयि ॥35॥",
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
                    text = "Knowing which, O Pandava (Arjuna), you will not come under delusion again in this way, and through which you will see all beings without exception in the Self and also in Me.\n" +
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
                    text = "Verse 36",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अपि चेदसि पापेभ्य: सर्वेभ्य: पापकृत्तम: |\n" +
                            "सर्वं ज्ञानप्लवेनैव वृजिनं सन्तरिष्यसि ॥36॥\n",
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
                    text = "Even if you be the worst sinner among all sinners, still you will cross over all the wickedness with the raft of Knowledge alone.\n" +
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
                    text = "Verse 37",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यथैधांसि समिद्धोऽग्निर्भस्मसात्कुरुतेऽर्जुन |\n" +
                            "ज्ञानाग्नि: सर्वकर्माणि भस्मसात्कुरुते तथा ॥37॥",
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
                    text = "O Arjuna, as a blazing fire reduces pieces of wood to ashes, similarly the fire of Knowledge reduces all actions to ashes.\n" +
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
                    text = "Verse 38",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "न हि ज्ञानेन सदृशं पवित्रमिह विद्यते |\n" +
                            "तत्स्वयं योगसंसिद्ध: कालेनात्मनि विन्दति ॥38॥",
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
                    text = "Indeed, there is nothing purifying here comparable to Knowledge. One who has become perfected after a (long) time through yoga, realizes That by himself in his own heart.\n" +
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
                    text = "Verse 39",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "श्रद्धावान् लभते ज्ञानं तत्पर: संयतेन्द्रिय: |\n" +
                            "ज्ञानं लब्ध्वा परां शान्तिमचिरेणाधिगच्छति ॥39॥",
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
                    text = "The man who has faith, is diligent and has control over the organs, attains Knowledge. Achieving Knowledge, one soon attains supreme Peace.\n" +
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
                    text = "Verse 40",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अज्ञश्चाश्रद्दधानश्च संशयात्मा विनश्यति |\n" +
                            "नायं लोकोऽस्ति न परो न सुखं संशयात्मन: ॥40॥",
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
                    text = "One who is ignorant and faithless, and has a doubting mind perishes. Neither this world nor the next nor happiness exists for one who has a doubting mind.\n" +
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
                    text = "Verse 41",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "योगसंन्यस्तकर्माणं ज्ञानसञ्छिन्नसंशयम् |\n" +
                            "आत्मवन्तं न कर्माणि निबध्नन्ति धनञ्जय ॥41॥",
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
                    text = "O Dhananjaya (Arjuna), actions do not bind one who has renounced actions through yoga, whose doubt has been fully dispelled by Knowledge, and who is not inadvertent.\n" +
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
                    text = "Verse 42",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तस्मादज्ञानसम्भूतं हृत्स्थं ज्ञानासिनात्मन: |\n" +
                            "छित्त्वैनं संशयं योगमातिष्ठोत्तिष्ठ भारत ॥42॥",
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
                    text = "Therefore, O scion of the Bharata dyasty, take recourse to yoga and rise up, cutting asunder with the sword of Knowledge this doubt of your own in the heart, arising from ignorance.\n" +
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
