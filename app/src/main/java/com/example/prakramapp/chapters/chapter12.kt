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
fun Chapter12(navController: NavHostController) {
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
                    text = "Chapter 12 - Bhakti Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "The Yoga of Devotion",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The twelfth chapter of the Bhagavad Gita is Bhakti Yoga. In this chapter, Krishna emphasizes the superiority of Bhakti Yoga (the path of devotion) over all other types of spiritual disciplines and reveals various aspects of devotion. He further explains that the devotees who perform pure devotional service to Him, with their consciousness, merged in Him and all their actions dedicated to Him, are quickly liberated from the cycle of life and death. He also describes the various qualities of the devotees who are very dear to Him.",
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
                            "एवं सततयुक्ता ये भक्तास्त्वां पर्युपासते |\n" +
                            "ये चाप्यक्षरमव्यक्तं तेषां के योगवित्तमा: ॥1॥\n" +
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
                    text = "Arjuna said: Those devotees who, being thus ever dedicated, meditate on You, and those again (who meditate) on the Immutable, the Unmanifested-of them, who are the best experiencers of yoga [(Here) yoga means samadhi, spiritual absorption.] ?\n" +
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
                    text = "                \n" +
                            "श्रीभगवानुवाच |\n" +
                            "मय्यावेश्य मनो ये मां नित्ययुक्ता उपासते |\n" +
                            "श्रद्धया परयोपेतास्ते मे युक्ततमा मता: ॥2॥",
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
                    text = "The Blessed Lord said: Those who meditate on Me by fixing their minds on Me with steadfast devotion (and) being endowed with supreme faith-they are considered to be the most perfect yogis according to Me.\n" +
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
                    text = "Verse 3-4",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "ये त्वक्षरमनिर्देश्यमव्यक्तं पर्युपासते |\n" +
                            "सर्वत्रगमचिन्त्यञ्च कूटस्थमचलन्ध्रुवम् ॥3॥\n" +
                            " सन्नियम्येन्द्रियग्रामं सर्वत्र समबुद्धय: |\n" +
                            "ते प्राप्नुवन्ति मामेव सर्वभूतहिते रता: ॥4॥",
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
                    text = "Those, however, who meditate in every way on the Immutable, the Indefinable, the Unmanifest, which is all-pervading, incomprehensible, change-less, immovable and constant. By fully controlling all the organs and always being even-minded, they, engaged in the welfare of all beings, attain Me alone.\n" +
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
                    text = "क्लेशोऽधिकतरस्तेषामव्यक्तासक्तचेतसाम् ||\n" +
                            "अव्यक्ता हि गतिर्दु:खं देहवद्भिरवाप्यते ॥5॥",
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
                    text = "For them who have their minds attached to the Unmanifested the struggle is greater; for, the Goal which is the Unmanifest is attained with difficulty by the embodied ones.",
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
                    text = "ये तु सर्वाणि कर्माणि मयि संन्न्यस्य मत्पर: |\n" +
                            "अनन्येनैव योगेन मां ध्यायन्त उपासते ॥6॥",
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
                    text = "As for those who, having dedicated all actions to Me and accepted Me as the supreme, meditate by thinking of Me with single-minded concentration only-.\n" +
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
                    text = "तेषामहं समुद्धर्ता मृत्युसंसारसागरात् |\n" +
                            "भवामि नचिरात्पार्थ मय्यावेशितचेतसाम् ॥7॥",
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
                    text = "O son of Prtha, for them who have their minds absorbed in Me, I become, without delay, the Deliverer from the sea of the world which is fraught with death.\n" +
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
                    text = "मय्येव मन आधत्स्व मयि बुद्धिं निवेशय |\n" +
                            "निवसिष्यसि मय्येव अत ऊर्ध्वं न संशय: ॥8॥",
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
                    text = "Fix the mind on Me alone; in Me alone rest the intellect. There is no doubt that hereafter you will dwell in Me alone.\n" +
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
                    text = "अथ चित्तं समाधातुं न शक्नोषि मयि स्थिरम् |\n" +
                            "अभ्यासयोगेन ततो मामिच्छाप्तुं धनञ्जय ॥9॥",
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
                    text = "If, however, you are unable to establish the mind steadily on Me, then, O Dhananjaya, seek to attain Me through the Yoga of Practice.\n" +
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
                    text = "अभ्यासेऽप्यसमर्थोऽसि मत्कर्मपरमो भव |\n" +
                            "मदर्थमपि कर्माणि कुर्वन्सिद्धिमवाप्स्यसि ॥10॥\n" +
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
                    text = "If you are unable even to practise, be intent on works for Me. By undertaking works for Me as well, you will attain perfection. [Identity with Brahman.]\n" +
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
                    text = "अथैतदप्यशक्तोऽसि कर्तुं मद्योगमाश्रित: |\n" +
                            "सर्वकर्मफलत्यागं तत: कुरु यतात्मवान् ॥11॥",
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
                    text = "If you are unable to do even this, in that case, having resorted to the Yoga for Me, thereafter renounce the results of all works by becoming controlled in mind.\n" +
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
                    text = "श्रेयो हि ज्ञानमभ्यासाज्ज्ञानाद्ध्यानं विशिष्यते |\n" +
                            "ध्यानात्कर्मफलत्यागस्त्यागाच्छान्तिरनन्तरम् ॥12॥",
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
                    text = "Knowledge is surely superior to practice; meditation surpasses knowledge. The renunciation of the results of works (excels) meditation. From renunciation, Peace follows immediately.\n" +
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
                    text = "अद्वेष्टा सर्वभूतानां मैत्र: करुण एव च |\n" +
                            "निर्ममो निरहङ्कार: समदु:खसुख: क्षमी ॥13॥",
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
                    text = "He who is not hateful towards any creature, who is friendly and compassionate, who has no idea of 'mine' and the idea of egoism, who is the same under sorrow and happiness, who is forgiving;\n" +
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
                    text = "सन्तुष्ट: सततं योगी यतात्मा दृढनिश्चय: |\n" +
                            "मय्यर्पितमनोबुद्धिर्यो मद्भक्त: स मे प्रिय: ॥14॥",
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
                    text = "                \n" +
                            "He who is ever content, who is a yogi, who has self-control, who has firm conviction, who has dedicated his mind and intellect to Me-he who is such a devotee of Mine is dear to Me.\n" +
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
                    text = "यस्मान्नोद्विजते लोको लोकान्नोद्विजते च य: |\n" +
                            "हर्षामर्षभयोद्वेगैर्मुक्तो य: स च मे प्रिय: ॥15॥",
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
                    text = "He, too, owing to whom the world is not disturbed, and who is not disturbed by the world, who is free from joy, impatience, fear and anxiety, is dear to Me.",
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
                    text = "अनपेक्ष: शुचिर्दक्ष उदासीनो गतव्यथ: |\n" +
                            "सर्वारम्भपरित्यागी यो मद्भक्त: स मे प्रिय: ॥16॥",
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
                    text = "He who has no desires, who is pure, who is dextrous, who is impartial, who is free from fear, who has renounced every undertaking-he who is (such) a devotee of Mine is dear to Me.\n" +
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
                    text = "यो न हृष्यति न द्वेष्टि न शोचति न काङ् क्षति |\n" +
                            "शुभाशुभपरित्यागी भक्तिमान्य: स मे प्रिय: ॥17॥",
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
                    text = "He who does not rejoice, does not fret, does not lament, does not hanker; who gives up good and bad, who is filled with devotion-he is dear to Me.",
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
                    text = "सम: शत्रौ च मित्रे च तथा मानापमानयो: |\n" +
                            "शीतोष्णसुखदु:खेषु सम: सङ्गविवर्जित: ॥18॥",
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

                text ="He who is the same towards friend and foe, and so also in honour and dishonour; who is the same under cold, heat, happiness and sorrow, who is free from attachment to everything.\n" +
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
                    text = "तुल्यनिन्दास्तुतिर्मौनी सन्तुष्टो येन केनचित् |\n" +
                            "अनिकेत: स्थिरमतिर्भक्तिमान्मे प्रियो नर: ॥19",
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
                    text = "The person to whom denunciation and praise are the same, who is silent, content with anything, homeless, steady-minded, and full of devotion is dear to Me.\n" +
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
                    text = "ये तु धर्म्यामृतमिदं यथोक्तं पर्युपासते |\n" +
                            "श्रद्दधाना मत्परमा भक्तास्तेऽतीव मे प्रिया: ॥20॥",
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
                    text = "But [Tu (but) is used to distinguish those who have attained the highest Goal from the aspirants.] those devotees who accept Me as the supreme Goal, and with faith seek for this ambrosia which is indistinguishable from the virtues as stated above, they are very dear to Me.\n" +
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
