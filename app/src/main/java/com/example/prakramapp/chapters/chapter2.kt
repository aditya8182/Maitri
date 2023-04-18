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
fun Chapter2(navController: NavHostController) {
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
                    text = "Chapter 2 - Sankhya Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Transcendental Knowledge",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The second chapter of the Bhagavad Gita is Sankhya Yoga. This is the most important chapter of the Bhagavad Gita as Lord Krishna condenses the teachings of the entire Gita in this chapter. This chapter is the essence of the entire Gita. Sankhya Yoga can be categorized into 4 main topics - 1. Arjuna completely surrenders himself to Lord Krishna and accepts his position as a disciple and Krishna as his Guru. He requests Krishna to guide him on how to dismiss his sorrow. 2. Explanation of the main cause of all grief, which is ignorance of the true nature of Self. 3. Karma Yoga - the discipline of selfless action without being attached to its fruits. 4. Description of a Perfect Man - One whose mind is steady and one-pointed.",
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
                    text = "सञ्जय उवाच |\n" +
                            "तं तथा कृपयाविष्टमश्रुपूर्णाकुलेक्षणम् |\n" +
                            "विषीदन्तमिदं वाक्यमुवाच मधुसूदन: ॥1॥",
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
                    text = "Sañjaya said: Seeing Arjuna full of compassion, his mind depressed, his eyes full of tears, Madhusūdana, Kṛṣṇa, spoke the following words.",
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
                            "कुतस्त्वा कश्मलमिदं विषमे समुपस्थितम् |\n" +
                            "अनार्यजुष्टमस्वर्ग्यमकीर्तिकरमर्जुन ॥2॥",
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
                    text = "The Blessed Lord said: O Arjuna, how has this infatuation overtaken you at this odd hour? It is shunned by noble souls; neither will it bring heaven, nor fame to you.\n" +
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
                    text = "क्लैब्यं मा स्म गम: पार्थ नैतत्तवय्युपपद्यते |\n" +
                            "क्षुद्रं हृदयदौर्बल्यं त्यक्त्वोत्तिष्ठ परन्तप ॥3॥",
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
                    text = "O Partha, yield not to unmanliness. This does not befit you. O scorcher of foes, arise, giving up the petty weakness of the heart.\n" +
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
                            "कथं भीष्ममहं सङ्ख्ये द्रोणं च मधुसूदन |\n" +
                            "इषुभि: प्रतियोत्स्यामि पूजार्हावरिसूदन ॥4॥",
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
                    text = "Arjuna said: O Madhusudana, O destroyer of enemies, how can I fight with arrows in battle against Bhisma and Drona who are worthy of adoration",
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
                    text = "गुरूनहत्वा हि महानुभावान्\n" +
                            "श्रेयो भोक्तुं भैक्ष्यमपीह लोके |\n" +
                            "हत्वार्थकामांस्तु गुरूनिहैव\n" +
                            "भुञ्जीय भोगान् रुधिरप्रदिग्धान् ॥5॥",
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
                    text = "Rather than killing the noble-minded elders, it is better in this world to live even on alms. But, by killing the elders we shall only be enjoying here the pleasures of wealth and desirable things drenched in blood.",
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
                    text = "न चैतद्विद्म: कतरन्नो गरीयो\n" +
                            "यद्वा जयेम यदि वा नो जयेयु: |\n" +
                            "यानेव हत्वा न जिजीविषाम\n" +
                            "स्तेऽवस्थिता: प्रमुखे धार्तराष्ट्रा: ॥6॥",
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
                    text = "We do not know this as well as to which is the better for us, (and) whether we shall win, or whether they shall conquer us. Those very sons of Dhrtarastra, by killing whom we do not wish to live, stand in confrontation.\n" +
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
                    text = "कार्पण्यदोषोपहतस्वभाव:\n" +
                            "पृच्छामि त्वां धर्मसम्मूढचेता: |\n" +
                            "यच्छ्रेय: स्यान्निश्चितं ब्रूहि तन्मे\n" +
                            "शिष्यस्तेऽहं शाधि मां त्वां प्रपन्नम् ॥7॥",
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
                    text = "With my nature overpowered by weak compassion, with a mind bewildered about duty, I pray to You. Tell me for certain that which is better; I am Your disciple. Instruct me who have taken refuge in You.\n" +
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
                    text = "न हि प्रपश्यामि ममापनुद्याद्\n" +
                            "यच्छोकमुच्छोषणमिन्द्रियाणाम् |\n" +
                            "अवाप्य भूमावसपत्नमृद्धं\n" +
                            "राज्यं सुराणामपि चाधिपत्यम् ॥8॥",
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
                    text = "Because, I do not see that which can, even after acquiring on this earth a prosperous kingdom free from enemies and even sovereignty over the gods, remove my sorrow (which is) blasting the senses.\n" +
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
                    text = "सञ्जय उवाच |\n" +
                            "एवमुक्त्वा हृषीकेशं गुडाकेश: परन्तप |\n" +
                            "न योत्स्य इति गोविन्दमुक्त्वा तूष्णीं बभूव ह ॥9॥\n" +
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
                    text = "Sanjaya said: Having spoken thus to Hrsikesa (Krsna), Gudakesa (Arjuna), the afflicter of foes, verily became silent, telling Govinda, 'I shall not fight.'",
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
                    text = "तमुवाच हृषीकेश: प्रहसन्निव भारत |\n" +
                            "सेनयोरुभयोर्मध्ये विषीदन्तमिदं वच: ॥10॥",
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
                    text = "O descendant of Bharata, to him who was sorrowing between the two armies, Hrsikesa, mocking as it were, said these words:",
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
                    text = "श्रीभगवानुवाच |\n" +
                            "अशोच्यानन्वशोचस्त्वं प्रज्ञावादांश्च भाषसे |\n" +
                            "गतासूनगतासूंश्च नानुशोचन्ति पण्डिता: ॥11॥",
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
                    text = "The Blessed Lord said: You grieve for those who are not to be grieved for; and you speak words of wisdom! The learned do not grieve for the departed and those who have not departed.",
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
                    text = "न त्वेवाहं जातु नासं न त्वं नेमे जनाधिपा |\n" +
                            "न चैव न भविष्याम: सर्वे वयमत: परम् ॥12॥",
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
                    text = "But certainly (it is) not (a fact) that I did not exist at any time; nor you, nor these rulers of men. And surely it is not that we all shall cease to exist after this.",
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
                    text = "देहिनोऽस्मिन्यथा देहे कौमारं यौवनं जरा |\n" +
                            "तथा देहान्तरप्राप्तिर्धीरस्तत्र न मुह्यति ॥13॥",
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
                    text = "देहिनोऽस्मिन्यथा देहे कौमारं यौवनं जरा |\n" +
                            "तथा देहान्तरप्राप्तिर्धीरस्तत्र न मुह्यति ॥13॥",
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
                    text = "मात्रास्पर्शास्तु कौन्तेय शीतोष्णसुखदु: खदा: |\n" +
                            "आगमापायिनोऽनित्यास्तांस्तितिक्षस्व भारत ॥14॥",
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
                    text = "But the contacts of the organs with the objects are the producers of cold and heat, happiness and sorrow. They have a beginning and an end, (and) are transient. Bear them, O descendant of Bharata.\n" +
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
                    text = "यं हि न व्यथयन्त्येते पुरुषं पुरुषर्षभ |\n" +
                            "समदु:खसुखं धीरं सोऽमृतत्वाय कल्पते ॥15॥",
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
                    text = "O (Arjuna, who are) foremost among men, verily, the person whom these do not torment, the wise man to whom sorrow and happiness are the same he is fit for Immortality.",
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
                    text = "नासतो विद्यते भावो नाभावो विद्यते सत: |\n" +
                            "उभयोरपि दृष्टोऽन्तस्त्वनयोस्तत्वदर्शिभि: ॥16॥",
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
                    text = "Of the unreal there is no being; the real has no nonexistence. But the nature of both these, indeed, has been realized by the seers of Truth.",
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
                    text = "अविनाशि तु तद्विद्धि येन सर्वमिदं ततम् |\n" +
                            "विनाशमव्ययस्यास्य न कश्चित्कर्तुमर्हति ॥17॥",
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
                    text = "But know That to be indestructible by which all this is pervaded. None can bring about the destruction of this Immutable.\n" +
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
                    text = "अन्तवन्त इमे देहा नित्यस्योक्ता: शरीरिण: |\n" +
                            "अनाशिनोऽप्रमेयस्य तस्माद्युध्यस्व भारत ॥18॥",
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
                    text = "These destructible bodies are said to belong to the everlasting, indestructible, indeterminable, embodied One. Therefore, O descendant of Bharata, join the battle.",
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
                    text = "य एनं वेत्ति हन्तारं यश्चैनं मन्यते हतम् |\n" +
                            "उभौ तौ न विजानीतो नायं हन्ति न हन्यते ॥19॥",
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
                    text = "He who thinks of this One as the killer, and he who thinks of this One as the killed both of them do not know. This One does not kill, nor is It killed.\n" +
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
                    text = "न जायते म्रियते वा कदाचि\n" +
                            "नायं भूत्वा भविता वा न भूय: |\n" +
                            "अजो नित्य: शाश्वतोऽयं पुराणो\n" +
                            "न हन्यते हन्यमाने शरीरे ॥20॥",
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
                    text = "Never is this One born, and never does It die; nor is it that having come to exist, It will again cease to be. This One is birthless, eternal, undecaying, ancient; It is not killed when the body is killed.\n" +
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
                    text = "वेदाविनाशिनं नित्यं य एनमजमव्ययम् |\n" +
                            "कथं स पुरुष: पार्थ कं घातयति हन्ति कम् ॥21॥",
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
                    text = "O Partha, he who knows this One as indestructible, eternal, birthless and undecaying, how and whom does that person kill, or whom does he cause to be killed!\n" +
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
                    text = "वासांसि जीर्णानि यथा विहाय\n" +
                            "नवानि गृह्णाति नरोऽपराणि |\n" +
                            "तथा शरीराणि विहाय जीर्णा\n" +
                            "न्यन्यानि संयाति नवानि देही ॥22॥",
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
                    text = "As after rejecting worn-out clothes a man takes up other new ones, likewise after rejecting worn-out bodies the embodied one unites with other new ones.\n" +
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
                    text = "नैनं छिन्दन्ति शस्त्राणि नैनं दहति पावक: |\n" +
                            "न चैनं क्लेदयन्त्यापो न शोषयति मारुत: ॥23॥",
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
                    text = "Weapons do not cut It, fire does not burn It, water does not moisten It, and air does not dry It.\n" +
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
                    text = "अच्छेद्योऽयमदाह्योऽयमक्लेद्योऽशोष्य एव च |\n" +
                            "नित्य: सर्वगत: स्थाणुरचलोऽयं सनातन: ॥24॥",
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
                    text = "It cannot be cut, It cannot be burnt, cannot be moistened, and surely cannot be dried up. It is eternal, omnipresent, stationary, unmoving and changeless.",
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
                    text = "अव्यक्तोऽयमचिन्त्योऽयमविकार्योऽयमुच्यते |\n" +
                            "तस्मादेवं विदित्वैनं नानुशोचितुमर्हसि ॥25॥",
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
                    text = "It is said that This is unmanifest; This is inconceivable; This is unchangeable. Therefore, having known This thus, you ought not to grieve.\n" +
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
                    text = "अथ चैनं नित्यजातं नित्यं वा मन्यसे मृतम् |\n" +
                            "तथापि त्वं महाबाहो नैवं शोचितुमर्हसि ॥26॥",
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
                    text = "On the other hand, if you think this One is born continually or dies constantly, even then, O mighty-armed one, you ought not to grieve thus.",
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
                    text = "जातस्य हि ध्रुवो मृत्युर्ध्रुवं जन्म मृतस्य च |\n" +
                            "तस्मादपरिहार्येऽर्थे न त्वं शोचितुमर्हसि ॥27॥",
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
                    text = "For death of anyone born is certain, and of the dead (re-) birth is a certainly. Therefore, you ought not to grieve over an inevitable fact.",
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
                    text = "अव्यक्तादीनि भूतानि व्यक्तमध्यानि भारत |\n" +
                            "अव्यक्तनिधनान्येव तत्र का परिदेवना ॥28॥",
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
                    text = "O descendant of Bharata, all beings remain unmanifest in the beginning; they become manifest in the middle. After death, they certainly become unmanifest. What lamentation can there be with regard to them?\n" +
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
                        text = "Verse 29",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                fontSize = 33.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W800,

                )
                Text(
                    text = "आश्चर्यवत्पश्यति कश्चिदेन\n" +
                            "माश्चर्यवद्वदति तथैव चान्य: |\n" +
                            "आश्चर्यवच्चैनमन्य: शृ्णोति\n" +
                            "श्रुत्वाप्येनं वेद न चैव कश्चित् ॥29॥",
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
                    text = "Someone visualizes It as a wonder; and similarly indeed, someone else talks of It as a wonder; and someone else hears of It as a wonder. And someone else, indeed, does not realize It even after hearing about It.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 30",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "देही नित्यमवध्योऽयं देहे सर्वस्य भारत |\n" +
                            "तस्मात्सर्वाणि भूतानि न त्वं शोचितुमर्हसि ॥30॥",
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
                    text = "O descendant of Bharata, this embodied Self existing in everyone's body can never be killed. Therefore, you ought not to grieve for all (these) beings.",
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
                    text = "स्वधर्ममपि चावेक्ष्य न विकम्पितुमर्हसि |\n" +
                            "धर्म्याद्धि युद्धाच्छ्रेयोऽन्यत्क्षत्रियस्य न विद्यते ॥31॥",
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
                    text = "Even considering your own duty you should not waver, since there is nothing else better for a Ksatriya than a righteous battle.\n" +
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
                    text = "यदृच्छया चोपपन्नं स्वर्गद्वारमपावृतम् |\n" +
                            "सुखिन: क्षत्रिया: पार्थ लभन्ते युद्धमीदृशम् ॥32॥",
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
                    text = "O son of Partha, happy are the Ksatriyas who come across this kind of a battle, which presents itself unsought for and which is an open gate to heaven.",
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
                    text = "अथ चेतत्वमिमं धर्म्यं संग्रामं न करिष्यसि |\n" +
                            "तत: स्वधर्मं कीर्तिं च हित्वा पापमवाप्स्यसि ॥33॥",
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
                    text = "On the other hand, if you will not fight this righteous battle, then, forsaking your own duty and fame, you will incur sin.\n" +
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
                    text = "अकीर्तिं चापि भूतानि\n" +
                            "कथयिष्यन्ति तेऽव्ययाम् |\n" +
                            "सम्भावितस्य चाकीर्ति\n" +
                            "र्मरणादतिरिच्यते ॥34॥",
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
                    text = "People also will speak of your unending infamy. And to an honoured person infamy is worse than death.",
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
                    text = "भयाद्रणादुपरतं मंस्यन्ते त्वां महारथा: |\n" +
                            "येषां च त्वं बहुमतो भूत्वा यास्यसि लाघवम् ॥35॥",
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
                    text = "The great chariot-riders will think of you as having desisted from the fight out of fear; and you will into disgrace before them to whom you had been estimable.\n" +
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
                    text = "अवाच्यवादांश्च बहून्वदिष्यन्ति तवाहिता: |\n" +
                            "निन्दन्तस्तव सामर्थ्यं ततो दु:खतरं नु किम् ॥36॥",
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
                    text = "And your enemies will speak many indecent words while denigrating your might. What can be more painful than that?",
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
                    text = "हतो वा प्राप्स्यसि स्वर्गं जित्वा वा भोक्ष्यसे महीम् |\n" +
                            "तस्मादुत्तिष्ठ कौन्तेय युद्धाय कृतनिश्चय: ॥37॥",
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
                    text = "Either by being killed you will attain heaven, or by winning you will enjoy the earth. Therefore, O Arjuna, rise up with determination for fighting.",
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
                    text = "सुखदु:खे समे कृत्वा लाभालाभौ जयाजयौ |\n" +
                            "ततो युद्धाय युज्यस्व नैवं पापमवाप्स्यसि ॥38॥",
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
                    text = "Treating happiness and sorrow, gain and loss, and victory and defeat with equality, engage in battle. Thus, you will not incur sin.\n" +
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
                    text = "एषा तेऽभिहिता साङ्ख्ये\n" +
                            "बुद्धिर्योगे त्विमां शृणु |\n" +
                            "बुद्ध्या युक्तो यया पार्थ\n" +
                            "कर्मबन्धं प्रहास्यसि ॥39॥",
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
                    text = "O Partha, this wisdom has been imparted to you from the standpoint of Self-realization. But listen to this (wisdom) from the standpoint of Yoga, endowed with which wisdom you will get rid of the bondage of action.\n" +
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
                    text = "नेहाभिक्रमनाशोऽस्ति प्रत्यवायो न विद्यते |\n" +
                            "स्वल्पमप्यस्य धर्मस्य त्रायते महतो भयात् ॥40॥",
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
                    text = "Here there is no waste of an attempt; nor is there (any) harm. Even a little of this righteousness saves (one) from great fear.\n" +
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
                    text = "व्यवसायात्मिका बुद्धिरेकेह कुरुनन्दन |\n" +
                            "बहुशाखा ह्यनन्ताश्च बुद्धयोऽव्यवसायिनाम् ॥41॥",
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
                    text = "O scion of the Kuru dynasty, in this there is a single, one-pointed conviction. The thoughts of the irresolute ones have many branches indeed, and are innumerable.\n" +
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
                    text = "Verse 42-43",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यामिमां पुष्पितां वाचं प्रवदन्त्यविपश्चित: |\n" +
                            "वेदवादरता: पार्थ नान्यदस्तीति वादिन: ॥42॥\n" +
                            " कामात्मान: स्वर्गपरा जन्मकर्मफलप्रदाम् |\n" +
                            "क्रियाविशेषबहुलां भोगैश्वर्यगतिं प्रति ॥43॥",
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
                    text = "O son of Prtha, those undiscerning people who utter this flowery talk which promises birth as a result of rites and duties, and is full of various special rites meant for the attainment of enjoyment and affluence, remain engrossed in the utterances of the Vedas and declare that nothing else exists; their minds are full of desires and they have heaven as the goal.\n" +
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
                    text = "Verse 44",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "भोगैश्वर्यप्रसक्तानां तयापहृतचेतसाम् |\n" +
                            "व्यवसायात्मिका बुद्धि: समाधौ न विधीयते ॥44॥",
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
                    text = "One-pointed conviction does not become established in the minds of those who delight in enjoyment and affluence, and whose intellects are carried away by that (speech).\n" +
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
                    text = "Verse 45",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "त्रैगुण्यविषया वेदा निस्त्रैगुण्यो भवार्जुन |\n" +
                            "निर्द्वन्द्वो नित्यसत्वस्थो निर्योगक्षेम आत्मवान् ॥45॥",
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
                    text = "O Arjuna, the Vedas [Meaning only the portion dealing with rites and duties (karma-kanda)] have the three Gunas(modes of Prakriti) as their object. You become free from worldliness, free from the pairs of duality, established in the Eternal Existence(God), without (desire for) acquisition and protection, and self-collected.\n" +
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
                    text = "Verse 46",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यावानर्थ उदपाने सर्वत: सम्प्लुतोदके |\n" +
                            "तावान्सर्वेषु वेदेषु ब्राह्मणस्य विजानत: ॥46॥",
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
                    text = "A Brahmana with realization has that much utility in all the Vedas as a man has in a well when there is a flood all around.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 47",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "कर्मण्येवाधिकारस्ते मा फलेषु कदाचन |\n" +
                            "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि || 47 ||",
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
                    text = "Your right is for action alone, never for the results. Do not become the agent of the results of action. May you not have any inclination for inaction.\n" +
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
                    text = "Verse 48",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "योगस्थ: कुरु कर्माणि सङ्गं त्यक्त्वा धनञ्जय |\n" +
                            "सिद्ध्यसिद्ध्यो: समो भूत्वा समत्वं योग उच्यते ॥48॥",
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
                    text = "By being established in Yoga, O Dhananjaya (Arjuna), undertake actions, casting off attachment and remaining equipoised in success and failure. Evenness of mind is called Yoga.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 49",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "दूरेण ह्यवरं कर्म बुद्धियोगाद्धनञ्जय |\n" +
                            "बुद्धौ शरणमन्विच्छ कृपणा: फलहेतव: ॥49॥",
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
                    text = "O Dhananjaya, indeed, action with a self-motive is far inferior to the yoga of wisdom. Take resort to wisdom. Those who thirst for rewards are pitiable.\n" +
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
                    text = "Verse 50",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "बुद्धियुक्तो जहातीह उभे सुकृतदुष्कृते |\n" +
                            "तस्माद्योगाय युज्यस्व योग: कर्मसु कौशलम् ॥50॥",
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
                    text = "Possessed of wisdom, one rejects here both virtue and vice. Therefore, devote yourself to (Karma-) yoga. Yoga is skilfulness in action.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 51",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "कर्मजं बुद्धियुक्ता हि फलं त्यक्त्वा मनीषिण: |\n" +
                            "जन्मबन्धविनिर्मुक्ता: पदं गच्छन्त्यनामयम् ॥51॥",
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
                    text = "Because, those who are devoted to wisdom, (they) becoming men of Enlightenment by giving up the fruits produced by actions, reach the state beyond evils by having become freed from the bondage of birth.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 52",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यदा ते मोहकलिलं बुद्धिर्व्यतितरिष्यति |\n" +
                            "तदा गन्तासि निर्वेदं श्रोतव्यस्य श्रुतस्य च ॥52॥\n" +
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
                    text = "When your mind will go beyond the turbidity of delusion, then you will acquire dispassion for what has to be heard and what has been heard.\n" +
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
                    text = "Verse 53",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "श्रुतिविप्रतिपन्ना ते यदा स्थास्यति निश्चला |\n" +
                            "समाधावचला बुद्धिस्तदा योगमवाप्स्यसि ॥53॥",
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
                    text = "When your mind that has become bewildered by hearing will become unshakable and steadfast in the Self, then you will attain Yoga that arises from discrimination.\n" +
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
                    text = "Verse 54",
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
                            "स्थितप्रज्ञस्य का भाषा समाधिस्थस्य केशव |\n" +
                            "स्थितधी: किं प्रभाषेत किमासीत व्रजेत किम् ॥54॥",
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
                    text = "Arjuna said: O Kesava, what is the description of a man of steady wisdom who is Self-absorbed? How does the man of steady wisdom speak? How does he sit? How does he move about?\n" +
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
                    text = "Verse 55",
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
                            "प्रजहाति यदा कामान्सर्वान्पार्थ मनोगतान् |\n" +
                            "आत्मन्येवात्मना तुष्ट: स्थितप्रज्ञस्तदोच्यते ॥55॥",
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
                    text = "The Blessed said: O Partha, when one fully renounces all the desires that have entered the mind, and remains satisfied in the Self alone by the Self, then he is called a man of steady wisdom.\n" +
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
                    text = "Verse 56",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "दु:खेष्वनुद्विग्नमना: सुखेषु विगतस्पृह: |\n" +
                            "वीतरागभयक्रोध: स्थितधीर्मुनिरुच्यते ॥56॥",
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
                    text = "That monk is called a man of steady wisdom when his mind is unperturbed in sorrow, he is free from longing for delights, and has gone beyond attachment, fear and anger.\n" +
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
                    text = "Verse 57",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "य: सर्वत्रानभिस्नेहस्तत्तत्प्राप्य शुभाशुभम् |\n" +
                            "नाभिनन्दति न द्वेष्टि तस्य प्रज्ञा प्रतिष्ठिता ॥57॥",
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
                    text = "The wisdom of that person remains established who has not attachment for anything anywhere, who neither welcomes nor rejects anything whatever good or bad when he comes across it.\n" +
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
                    text = "Verse 58",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यदा संहरते चायं कूर्मोऽङ्गानीव सर्वश: |\n" +
                            "इन्द्रियाणीन्द्रियार्थेभ्यस्तस्य प्रज्ञा प्रतिष्ठिता ॥58॥",
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
                    text = "And when this one fully withdraws the senses from the objects of the senses, as a tortoise wholly (withdraws) the limbs, then his wisdom remains established.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 59",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "विषया विनिवर्तन्ते निराहारस्य देहिन: |\n" +
                            "रसवर्जं रसोऽप्यस्य परं दृष्ट्वा निवर्तते ॥59॥",
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
                    text = "The objects recede from an abstinent man, with the exception of the taste (for them). Even the taste of this person falls away after realization of the Absolute.\n" +
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
                    text = "Verse 60",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "यततो ह्यपि कौन्तेय पुरुषस्य विपश्चित: |\n" +
                            "इन्द्रियाणि प्रमाथीनि हरन्ति प्रसभं मन: ॥60॥",
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
                    text = "For, O son of Kunti, the turbulent organs violently snatch away the mind of an intelligent person, even while he is striving diligently.\n" +
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
                    text = "Verse 61",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तानि सर्वाणि संयम्य युक्त आसीत मत्पर: |\n" +
                            "वशे हि यस्येन्द्रियाणि तस्य प्रज्ञा प्रतिष्ठिता ॥61॥",
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
                    text = "Controlling all of them, one should remain concentrated on Me as the supreme. For, the wisdom of one whose organs are under control becomes steadfast.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 62",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "ध्यायतो विषयान्पुंस: सङ्गस्तेषूपजायते |\n" +
                            "सङ्गात्सञ्जायते काम: कामात्क्रोधोऽभिजायते ॥62॥",
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
                    text = "In the case of a person who dwells on objects, there arises attachment for them. From attachment grows hankering, from hankering springs anger.\n" +
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
                    text = "Verse 63",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "क्रोधाद्भवति सम्मोह: सम्मोहात्स्मृतिविभ्रम: |\n" +
                            "स्मृतिभ्रंशाद् बुद्धिनाशो बुद्धिनाशात्प्रणश्यति ॥63॥",
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
                    text = "From anger follows delusion; from delusion, failure of memory; from failure of memory, the loss of understanding; from the loss of understanding, he perishes.\n" +
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
                    text = "Verse 64",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "रागद्वेषवियुक्तैस्तु विषयानिन्द्रियैश्चरन् |\n" +
                            "आत्मवश्यैर्विधेयात्मा प्रसादमधिगच्छति ॥64॥",
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
                    text = "But by perceiving objects with the organs that are free from attraction and repulsion, and are under his own control, the self-controlled man attains serenity.\n" +
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
                    text = "Verse 65",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "प्रसादे सर्वदु:खानां हानिरस्योपजायते |\n" +
                            "प्रसन्नचेतसो ह्याशु बुद्धि: पर्यवतिष्ठते ॥65॥",
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
                    text = "When there is serenity, there follows eradication of all his sorrows, because the wisdom of one who has a serene mind soon becomes firmly established.\n" +
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
                    text = "Verse 66",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "नास्ति बुद्धिरयुक्तस्य न चायुक्तस्य भावना |\n" +
                            "न चाभावयत: शान्तिरशान्तस्य कुत: सुखम् ॥66॥",
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
                    text = "For the unsteady there is no wisdom, and there is no meditation for the unsteady man. And for an unmeditative man there is no peace. How can there be happiness for one without peace?",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 67",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "इन्द्रियाणां हि चरतां यन्मनोऽनुविधीयते |\n" +
                            "तदस्य हरति प्रज्ञां वायुर्नावमिवाम्भसि ॥67॥",
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
                    text = "For, the mind which follows in the wake of the wandering senses, that (mind) carries away his wisdom like the mind (diverting) a boat on the waters.\n" +
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
                    text = "Verse 68",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तस्माद्यस्य महाबाहो निगृहीतानि सर्वश: |\n" +
                            "इन्द्रियाणीन्द्रियार्थेभ्यस्तस्य प्रज्ञा प्रतिष्ठिता ॥68॥",
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
                    text = "Therefore, O mighty-armed one, his wisdom becomes established whose organs in all their varieties are withdrawn from their objects.\n" +
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
                    text = "Verse 69",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "या निशा सर्वभूतानां तस्यां जागर्ति संयमी |\n" +
                            "यस्यां जाग्रति भूतानि सा निशा पश्यतो मुने: ॥69॥",
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
                    text = "The self-restrained man keeps awake during that which is night for all creatures. That during which creatures keep awake, it is night to the seeing sage.\n" +
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
                    text = "Verse 70",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "आपूर्यमाणमचलप्रतिष्ठं\n" +
                            "समुद्रमाप: प्रविशन्ति यद्वत् |\n" +
                            "तद्वत्कामा यं प्रविशन्ति सर्वे\n" +
                            "स शान्तिमाप्नोति न कामकामी ॥70॥",
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
                    text = "That man attains peace into whom all desires enter in the same way as the waters flow into a sea that remains unchanged (even) when being filled up from all sides. Not so one who is desirous of objects.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Black

                )
                Text(
                    text = "Verse 71",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "विहाय कामान्य: सर्वान्पुमांश्चरति नि:स्पृह: |\n" +
                            "निर्ममो निरहङ्कार: स शान्तिमधिगच्छति ॥71॥",
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
                    text = "That man attains peace who, after rejecting all desires, moves about free from hankering, without the idea of ('me' and) 'mine', and devoid of pride.\n" +
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
                    text = "Verse 72",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "वएषा ब्राह्मी स्थिति: पार्थ नैनां प्राप्य विमुह्यति |\n" +
                            "स्थित्वास्यामन्तकालेऽपि ब्रह्मनिर्वाणमृच्छति ॥72॥",
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
                    text ="O Partha, this is the state of being established in Brahman. One does not become deluded after attaining this. One attains identification with Brahman by being established in this state even in the closing years of one's life.\n" +
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
