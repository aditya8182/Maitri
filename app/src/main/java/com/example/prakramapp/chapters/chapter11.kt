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
fun Chapter11(navController: NavHostController) {
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
                    text = "Chapter 11 - Vishwaroopa Darshana Yoga",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "Yoga through Beholding the Cosmic Form of God",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray

                )
                Text(
                    text = "The eleventh chapter of the Bhagavad Gita is Vishwaroopa Darshana Yoga. In this chapter, Arjuna requests Krishna to reveal His Universal Cosmic Form that encompasses all the universes, the entire existence. Arjuna is granted divine vision to be able to see the entirety of creation in the body of the Supreme Lord Krishna",
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
                            "मदनुग्रहाय परमं गुह्यमध्यात्मसञ्ज्ञितम् |\n" +
                            "यत्वयोक्तं वचस्तेन मोहोऽयं विगतो मम ॥1॥",
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
                    text = "Arjuna said: This delusion of mine has departed as a result of that speech which is most secret and known as pertaining to the Self, and which was uttered by You for my benefit.\n" +
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
                    text = "भवाप्ययौ हि भूतानां श्रुतौ विस्तरशो मया |\n" +
                            "त्वत्त: कमलपत्राक्ष माहात्म्यमपि चाव्ययम् ॥2॥",
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
                    text = "O you with eyes like lotus leaves, the origin and dissolution of beings have been heard by me in detail from You. ['From You have been heard the origin and dissolution of beings in You.'] And (Your) undecaying glory, too, (has been heard).\n" +
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
                    text = "एवमेतद्यथात्थ त्वमात्मानं परमेश्वर |\n" +
                            "द्रष्टुमिच्छामि ते रूपमैश्वरं पुरुषोत्तम ॥3॥\n" +
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
                    text = "O supreme Lord, so it is, as You speak about Yourself. O supreme Person, I wish to see the divine form of Yours.\n" +
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
                    text = "मन्यसे यदि तच्छक्यं मया द्रष्टुमिति प्रभो |\n" +
                            "योगेश्वर ततो मे त्वं दर्शयात्मानमव्ययम् ॥4॥",
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
                    text = "O Lord, if You think that it is possible to be seen by me, then, O Lord of Yoga, You show me Your eternal Self.\n" +
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
                            "पश्य मे पार्थ रूपाणि शतशोऽथ सहस्रश: |\n" +
                            "नानाविधानि दिव्यानि नानावर्णाकृतीनि च ॥5॥",
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
                    text = "The Blessed Lord said:  O son of Prtha, behold My forms in (their) hundreds and in thousands, of different kinds, celestial, and of various colours and shapes.",
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
                    text = "पश्यादित्यान्वसून् रुद्रानश्विनौ मरुतस्तथा |\n" +
                            "बहून्यदृष्टपूर्वाणि पश्याश्चर्याणि भारत ॥6॥",
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
                    text = "See the Adiyas, the Vasus, the Rudras, the two Asvins and the Maruts. O scion of the Bharata dynasty, behold also the many wonders not seen before.\n" +
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
                    text = "इहैकस्थं जगत्कृत्स्नं पश्याद्य सचराचरम् |\n" +
                            "मम देहे गुडाकेश यच्चान्यद्द्रष्टुमिच्छसि ॥7॥",
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
                    text = "See now, O Gudakesa (Arjuna), the entire Universe together with the moving and the non-moving, concentrated at the same place here in My body, as also whatever else you would like to see.",
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
                    text = "न तु मां शक्यसे द्रष्टुमनेनैव स्वचक्षुषा |\n" +
                            "दिव्यं ददामि ते चक्षु: पश्य मे योगमैश्वरम् ॥8॥",
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
                    text = "But you are not able to see Me merely with this eye of yours. I grant you the supernatural eye; behold My Divine Yoga.",
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
                            "एवमुक्त्वा ततो राजन्महायोगेश्वरो हरि: |\n" +
                            "दर्शयामास पार्थाय परमं रूपमैश्वरम् ॥9॥",
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
                    text = "Sanjaya said: O King, having spoken thus, thereafter, Hari [Hari: destroyer of ignorance along with its consciences.] (Krsna) the great Master of Yoga, showed to the son of Prtha the supreme divine form:",
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
                    text = "                \n" +
                            "अनेकवक्त्रनयनमनेकाद्भुतदर्शनम् |\n" +
                            "अनेकदिव्याभरणं दिव्यानेकोद्यतायुधम् ॥10॥",
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
                    text = "Having many faces and eyes, possessing many wonderful sights, adorned with numerous celestial ornaments, holding many uplifted heavenly weapons;\n" +
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
                    text = "दिव्यमाल्याम्बरधरं दिव्यगन्धानुलेपनम् |\n" +
                            "सर्वाश्चर्यमयं देवमनन्तं विश्वतोमुखम् ॥11॥",
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
                    text = "Wearing heavenly garlands and apparel, anointed with heavenly scents, abounding in all kinds of wonder, resplendent, infinite, and with faces everywhere.\n" +
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
                    text = "दिवि सूर्यसहस्रस्य भवेद्युगपदुत्थिता |\n" +
                            "यदि भा: सदृशी सा स्याद्भासस्तस्य महात्मन: ॥12॥\n" +
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
                    text = "Should the effulgence of a thousand suns blaze forth simultaneously in the sky, that might be similar to the radiance of that exalted One.",
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
                    text = "तत्रैकस्थं जगत्कृत्स्नं प्रविभक्तमनेकधा |\n" +
                            "अपश्यद्देवदेवस्य शरीरे पाण्डवस्तदा ॥13॥",
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
                    text = "At that time, Pandava saw there, in the body of the God of gods, the whole diversely differentiated Universe united in the one (Cosmic form).\n" +
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
                    text = "तत: स विस्मयाविष्टो हृष्टरोमा धनञ्जय: |\n" +
                            "प्रणम्य शिरसा देवं कृताञ्जलिरभाषत ॥14॥",
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
                    text = "Then, filled with wonder, with hairs standing on end, he, Dhananjaya, (Arjuna), bowing down with his head to the Lord, said with folded hands:\n" +
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
                    text = "अर्जुन उवाच |\n" +
                            "पश्यामि देवांस्तव देव देहे\n" +
                            "सर्वांस्तथा भूतविशेषसङ्घान् |\n" +
                            "ब्रह्माणमीशं कमलासनस्थ-\n" +
                            "मृषींश्च सर्वानुरगांश्च दिव्यान् ॥15॥",
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
                    text = "Arjuna said: O God, I see in Your body all the gods as also hosts of (various) classes of beings; Brahma the ruler, sitting on a lotus seat, and all the heavenly sages and serpents.\n" +
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
                    text = "अनेकबाहूदरवक्त्रनेत्रं\n" +
                            "पश्यामि त्वां सर्वतोऽनन्तरूपम् |\n" +
                            "नान्तं न मध्यं न पुनस्तवादिं\n" +
                            "पश्यामि विश्वेश्वर विश्वरूप ॥16॥",
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
                    text = "I see You as possessed of numerous arms, bellies, mouths and eyes; as having infinite forms all around. O Lord of the Universe, O Cosmic Person, I see not Your limit nor the middle, nor again the beginning!",
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
                    text = "किरीटिनं गदिनं चक्रिणं च\n" +
                            "तेजोराशिं सर्वतो दीप्तिमन्तम् |\n" +
                            "पश्यामि त्वां दुर्निरीक्ष्यं समन्ताद्\n" +
                            "दीप्तानलार्कद्युतिमप्रमेयम् ॥17॥",
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
                    text = "I see You as wearing a crown, wielding a mace, and holding a disc; a mass of brilliance glowing all around, difficult to look at from all sides, possessed of the radiance of the blazing fire and sun, and immeasurable.",
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
                    text = "त्वमक्षरं परमं वेदितव्यं\n" +
                            "त्वमस्य विश्वस्य परं निधानम् |\n" +
                            "त्वमव्यय: शाश्वतधर्मगोप्ता\n" +
                            "सनातनस्त्वं पुरुषो मतो मे ॥18॥",
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
                    text = "You are the Immutable, the supreme One to be known; You are the most perfect repository of this Universe. You are the Imperishable, the Protector of the ever-existing religion; You are the eternal Person. This is my belief.\n" +
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
                    text = "अनादिमध्यान्तमनन्तवीर्य-\n" +
                            "मनन्तबाहुं शशिसूर्यनेत्रम् |\n" +
                            "पश्यामि त्वां दीप्तहुताशवक्त्रं-",
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
                    text = "I see You as without beginning, middle and end, possessed of infinite valour, having innumerable arms, having the sun and the moon as eyes, having a mouth like a blazing fire, and heating up this Universe by Your own brilliance.\n" +
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
                    text = "द्यावापृथिव्योरिदमन्तरं हि\n" +
                            "व्याप्तं त्वयैकेन दिशश्च सर्वा: |\n" +
                            "दृष्ट्वाद्भुतं रूपमुग्रं तवेदं\n" +
                            "लोकत्रयं प्रव्यथितं महात्मन् ॥20॥",
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
                    text = "Indeed, this intermediate space between heaven and earth as also all the directions are pervaded by You alone. O exalted One, the three worlds are struck with fear by seeing this strange, fearful form of Yours.\n" +
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
                    text = "अमी हि त्वां सुरसङ्घा विशन्ति\n" +
                            "केचिद्भीता: प्राञ्जलयो गृणन्ति |\n" +
                            "स्वस्तीत्युक्त्वा महर्षिसिद्धसङ्घा:\n" +
                            "स्तुवन्ति त्वां स्तुतिभि: पुष्कलाभि: ॥21॥",
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
                    text = "Those very groups of gods enter into You; struck with fear, some extol (You) with joined palms. Groups of great sages and perfected beings praise You with elaborate hymns, saying 'May it be well!'\n" +
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
                    text = "रुद्रादित्या वसवो ये च साध्या\n" +
                            "विश्वेऽश्विनौ मरुतश्चोष्मपाश्च |\n" +
                            "गन्धर्वयक्षासुरसिद्धसङ्घा\n" +
                            "वीक्षन्ते त्वां विस्मिताश्चैव सर्वे ॥22॥",
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
                    text = "Those who are the Rudras, the Adityas, the Vasus and the Sadhyas [sadhyas: A particular class of celestial beings.], the Visve (-devas), the two Asvins, the Maruts and the Usmapas, and hosts of Gandharvas, Yaksas, demons and Siddhas-all of those very one’s gaze at You, being indeed struck with wonder.\n" +
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
                    text = "रूपं महत्ते बहुवक्त्रनेत्रं\n" +
                            "महाबाहो बहुबाहूरुपादम् |\n" +
                            "बहूदरं बहुदंष्ट्राकरालं\n" +
                            "दृष्ट्वा लोका: प्रव्यथितास्तथाहम् ॥23॥",
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
                    text = "O mighty-armed One, seeing Your immense form with many mouths and eyes, having numerous arms, thighs and feet, with many bellies, and fearful with many teeth, the creatures are struck with terror, and so am I.",
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
                    text = "नभ:स्पृशं दीप्तमनेकवर्णं\n" +
                            "व्यात्ताननं दीप्तविशालनेत्रम् |\n" +
                            "दृष्ट्वा हि त्वां प्रव्यथितान्तरात्मा\n" +
                            "धृतिं न विन्दामि शमं च विष्णो ॥24॥",
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
                    text = "O Visnu, verily, seeing Your form touching heaven, blazing, with many colours, open-mouthed, with fiery large eyes, I, becoming terrified in my mind, do not find steadiness and peace.\n" +
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
                    text = "दंष्ट्राकरालानि च ते मुखानि\n" +
                            "दृष्ट्वैव कालानलसन्निभानि |\n" +
                            "दिशो न जाने न लभे च शर्म\n" +
                            "प्रसीद देवेश जगन्निवास ॥25॥\n" +
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
                    text = "Having merely seen Your mouths made terrible with (their) teeth and resembling the fire of Dissolution, I have lost the sense of direction and find no comfort. Be gracious, O Lord of gods, O Abode of the Universe.\n" +
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
                    text = "Verse 26-27",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "अमी च त्वां धृतराष्ट्रस्य पुत्रा:\n" +
                            "सर्वे सहैवावनिपालसङ्घै: |\n" +
                            "भीष्मो द्रोण: सूतपुत्रस्तथासौ\n" +
                            "सहास्मदीयैरपि योधमुख्यै: ॥26॥\n" +
                            " वक्त्राणि ते त्वरमाणा विशन्ति\n" +
                            "दंष्ट्राकरालानि भयानकानि |\n" +
                            "केचिद्विलग्ना दशनान्तरेषु\n" +
                            "सन्दृश्यन्ते चूर्णितैरुत्तमाङ्गै: ॥27॥",
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
                    text = "And into You (enter) all those sons of Dhrtarastra along with multitudes of the rulers of the earth; (also) Bhisma, Drona and that son of a Suta (Karna), together with even our prominent warriors. They rapidly enter into Your terrible mouths with cruel teeth! Some are seen sticking in the gaps between the teeth, with their heads crushed!",
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
                    text = "यथा नदीनां बहवोऽम्बुवेगा:\n" +
                            "समुद्रमेवाभिमुखा द्रवन्ति |\n" +
                            "तथा तवामी नरलोकवीरा\n" +
                            "विशन्ति वक्त्राण्यभिविज्वलन्ति ॥28॥",
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
                    text = "As the numerous currents of the waters of rivers rush towards the sea alone so also do those heroes of the human world enter into Your blazing mouths.",
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
                    text = "यथा प्रदीप्तं ज्वलनं पतङ्गा\n" +
                            "विशन्ति नाशाय समृद्धवेगा: |\n" +
                            "तथैव नाशाय विशन्ति लोका-\n" +
                            "स्तवापि वक्त्राणि समृद्धवेगा: ॥29॥\n" +
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
                    text = "As moths enter with increased haste into a glowing fire for destruction, in that very way do the creatures enter into Your mouths too, with increased hurry for destruction.\n" +
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
                    text = "लेलिह्यसे ग्रसमान: समन्ता-\n" +
                            "ल्लोकान्समग्रान्वदनैर्ज्वलद्भि: |\n" +
                            "तेजोभिरापूर्य जगत्समग्रं\n" +
                            "भासस्तवोग्रा: प्रतपन्ति विष्णो ॥30॥",
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
                    text = "You lick Your lips while devouring all the creatures from every side with flaming mouths which are completely filling the entire world with heat.\n" +
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
                    text = "आख्याहि मे को भवानुग्ररूपो\n" +
                            "नमोऽस्तु ते देववर प्रसीद |\n" +
                            "विज्ञातुमिच्छामि भवन्तमाद्यं\n" +
                            "न हि प्रजानामि तव प्रवृत्तिम् ॥31॥",
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
                    text = "Tell me who You are, fierce in form. Salutation be to you, O supreme God; be gracious. I desire to fully know You who are the Prima One. For I do not understand Your actions!",
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
                    text = "श्रीभगवानुवाच |\n" +
                            "कालोऽस्मि लोकक्षयकृत्प्रवृद्धो\n" +
                            "लोकान्समाहर्तुमिह प्रवृत्त: |\n" +
                            "ऋतेऽपि त्वां न भविष्यन्ति सर्वे\n" +
                            "येऽवस्थिता: प्रत्यनीकेषु योधा: ॥32॥",
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
                    text = "The Blessed Lord said: I am the world-destroying Time, [Time: The supreme God with His limiting adjunct of the power of action.] grown in stature [Pravrddhah, mighty] and now engaged in annihilating the creatures. Even without you, all the warriors who are arrayed in the confronting armies will cease to exist!",
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
                    text = "तस्मात्वमुत्तिष्ठ यशो लभस्व\n" +
                            "जित्वा शत्रून्भुङ् क्ष्व राज्यं समृद्धम् |\n" +
                            "मयैवैते निहता: पूर्वमेव\n" +
                            "निमित्तमात्रं भव सव्यसाचिन् ॥33॥",
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
                    text = "Therefore you rise up, (and) gain fame; and defeating the enemies, enjoy a prosperous kingdom. These have been killed verily by Me even earlier; be you merely an instrument, O Savyasacin (Arjuna).\n" +
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
                    text = "द्रोणं च भीष्मं च जयद्रथं च\n" +
                            "कर्णं तथान्यानपि योधवीरान् |\n" +
                            "मया हतांस्त्वं जहि मा व्यथिष्ठा\n" +
                            "युध्यस्व जेतासि रणे सपत्नान् ॥34॥",
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
                    text = "You destroy Drona and Bhisma, and Jayadratha and Karna as also the other heroic warriors who have been killed by Me. Do not be afraid. Fight! You shall conquer the enemies in battle.\n" +
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
                    text = "सञ्जय उवाच |\n" +
                            "एतच्छ्रुत्वा वचनं केशवस्य\n" +
                            "कृताञ्जलिर्वेपमान: किरीटी |\n" +
                            "नमस्कृत्वा भूय एवाह कृष्णं\n" +
                            "सगद्गदं भीतभीत: प्रणम्य ॥35॥",
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
                    text = "Sanjaya said: Hearing this utterance of Kesava, Kiriti (Arjuna), with joined palms and trembling, prostrating himself, said again to Krsna with a faltering voice, bowing down overcome by fits of fear:\n" +
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
                    text = "अर्जुन उवाच |\n" +
                            "स्थाने हृषीकेश तव प्रकीर्त्या\n" +
                            "जगत्प्रहृष्यत्यनुरज्यते च |\n" +
                            "रक्षांसि भीतानि दिशो द्रवन्ति\n" +
                            "सर्वे नमस्यन्ति च सिद्धसङ्घा: ॥36॥",
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
                    text = "Arjuna said: It is proper, O Hrsikesa, that the world becomes delighted and attracted by Your praise; that the Raksasas, stricken with fear, run in all directions; and that all the groups of the Siddhas bow down (to You).",
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
                    text = "कस्माच्च ते न नमेरन्महात्मन्\n" +
                            "गरीयसे ब्रह्मणोऽप्यादिकर्त्रे |\n" +
                            "अनन्त देवेश जगन्निवास\n" +
                            "त्वमक्षरं सदसतत्परं यत् ॥37॥",
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
                    text = "And why should they not bow down to You, O exalted [i.e. not narrow-minded.] One, who are greater (than all) and who are the first Creator even of Brahma! O infinite One, supreme God, Abode of the Universe, You are the Immutable, being and non-being, (and) that which is Transcendental.\n" +
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
                    text = "त्वमादिदेव: पुरुष: पुराण-\n" +
                            "स्त्वमस्य विश्वस्य परं निधानम् |\n" +
                            "वेत्तासि वेद्यं च परं च धाम\n" +
                            "त्वया ततं विश्वमनन्तरूप ॥38॥",
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
                    text = "You are the primal Deity, the ancient Person; You are the supreme Resort of this world. You are the knower as also the object of knowledge, and the supreme Abode. O You of infinite forms, the Universe is pervaded by You!\n" +
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
                    text = "वायुर्यमोऽग्निर्वरुण: शशाङ्क:\n" +
                            "प्रजापतिस्त्वं प्रपितामहश्च |\n" +
                            "नमो नमस्तेऽस्तु सहस्रकृत्व:\n" +
                            "पुनश्च भूयोऽपि नमो नमस्ते ॥39॥",
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
                    text = "You are Air, Death, Fire, the god of the waters, the moon, the Lord of the creatures, and the Greater-grandfather. Salutations! Salutation be to You a thousand times; salutation to You again and again! Salutation!",
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
                    text = "नम: पुरस्तादथ पृष्ठतस्ते\n" +
                            "नमोऽस्तु ते सर्वत एव सर्व |\n" +
                            "अनन्तवीर्यामितविक्रमस्त्वं\n" +
                            "सर्वं समाप्नोषि ततोऽसि सर्व: ॥40॥",
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
                    text = "Salutation to You in the East and behind. Salutation be to You on all sides indeed, O All! You are possessed of infinite strength and infinite heroism. You pervade everything; hence You are all!",
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
                    text = "सखेति मत्वा प्रसभं यदुक्तं\n" +
                            "हे कृष्ण हे यादव हे सखेति |\n" +
                            "अजानता महिमानं तवेदं\n" +
                            "मया प्रमादात्प्रणयेन वापि ॥41॥",
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
                    text = "Without knowing this greatness of Yours, whatever was said by me (to You) rashly, through inadvertence or even out of intimacy, thinking (You to be) a friend, addressing (You) as 'O Krsna,' 'O Yadava,' 'O friend,' etc.-.",
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
                    text = "यच्चावहासार्थमसत्कृतोऽसि\n" +
                            "विहारशय्यासनभोजनेषु |\n" +
                            "एकोऽथवाप्यच्युत तत्समक्षं\n" +
                            "तत्क्षामये त्वामहमप्रमेयम् ॥42॥",
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
                    text = "And that You have been discourteously treated out of fun-while walking, while on a bed, while on a seat, while eating, in privacy, or, O Acyuta, even in public, for that I beg pardon of You, the incomprehensible One.\n" +
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
                    text = "Verse 43",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    fontSize = 33.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.W800,

                    )
                Text(
                    text = "तस्मात्प्रणम्य प्रणिधाय कायं\\n\" +\n" +
                            "                            \"प्रसादये त्वामहमीशमीड्यम् |\\n\" +\n" +
                            "                            \"पितेव पुत्रस्य सखेव सख्यु:\\n\" +\n" +
                            "                            \"प्रिय: प्रियायार्हसि देव सोढुम् ॥44॥",
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
                    text = "Therefore, by bowing down and prostrating the body, I seek to propitiate You who are God and are adorable. O Lord, You should forgive (my faults) as would a father (the faults) of a son, as a friend, of a friend, and as a lover of a beloved.\n" +
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
                    text ="तस्मात्प्रणम्य प्रणिधाय कायं\n" +
                            "प्रसादये त्वामहमीशमीड्यम् |\n" +
                            "पितेव पुत्रस्य सखेव सख्यु:\n" +
                            "प्रिय: प्रियायार्हसि देव सोढुम् ॥44॥" ,
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
                    text = "Therefore, by bowing down and prostrating the body, I seek to propitiate You who are God and are adorable. O Lord, You should forgive (my faults) as would a father (the faults) of a son, as a friend, of a friend, and as a lover of a beloved.\n" +
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
                    text = "अदृष्टपूर्वं हृषितोऽस्मि दृष्ट्वा\n" +
                            "भयेन च प्रव्यथितं मनो मे |\n" +
                            "तदेव मे दर्शय देवरूपं\n" +
                            "प्रसीद देवेश जगन्निवास ॥45॥",
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
                    text = "I am delighted by seeing something not seen heretofore, and my mind is stricken with fear. O Lord, show me that very form; O supreme God, O Abode of the Universe, be gracious!\n" +
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
                    text = "किरीटिनं गदिनं चक्रहस्त-\n" +
                            "मिच्छामि त्वां द्रष्टुमहं तथैव |\n" +
                            "तेनैव रूपेण चतुर्भुजेन\n" +
                            "सहस्रबाहो भव विश्वमूर्ते ॥46॥",
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
                    text = "I want to see You just as before, wearing a crown, wielding a mace, and holding a disc in hand. O You with thousand arms, O You of Cosmic form, appear with that very form with four hands.",
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
                    text = "श्रीभगवानुवाच |\n" +
                            "मया प्रसन्नेन तवार्जुनेदं\n" +
                            "रूपं परं दर्शितमात्मयोगात् |\n" +
                            "तेजोमयं विश्वमनन्तमाद्यं\n" +
                            "यन्मे त्वदन्येन न दृष्टपूर्वम् ॥47॥\n" +
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
                    text = "The Blessed Lord said: Out of grace, O Arjuna, this supreme, radiant, Cosmic, infinite, primeval form-which (form) of Mine has not been seen before by anyone other than you, has been shown to you by Me through the power of My Own Yoga.",
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
                    text = "न वेदयज्ञाध्ययनैर्न दानै-\n" +
                            "र्न च क्रियाभिर्न तपोभिरुग्रै: |\n" +
                            "एवंरूप: शक्य अहं नृलोके\n" +
                            "द्रष्टुं त्वदन्येन कुरुप्रवीर ॥48॥",
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
                    text = "Not by the study of the Vedas and sacrifices, not by gifts, not even by rituals, not by severe austerities can I, in this form, be perceived in the human world by anyone ['By anyone who has not received My grace'. other than you, O most valiant among the Kurus.",
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
                    text = "मा ते व्यथा मा च विमूढभावो\n" +
                            "दृष्ट्वा रूपं घोरमीदृङ्ममेदम् |\n" +
                            "व्यपेतभी: प्रीतमना: पुनस्त्वं\n" +
                            "तदेव मे रूपमिदं प्रपश्य ॥49॥",
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
                    text = "May you have no fear, and may not there be bewilderment by seeing this form of Mine so terrible Becoming free from fear and gladdened in mind again, see this very earlier form of Mine.",
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
                    text = "सञ्जय उवाच |\n" +
                            "इत्यर्जुनं वासुदेवस्तथोक्त्वा\n" +
                            "स्वकं रूपं दर्शयामास भूय: |\n" +
                            "आश्वासयामास च भीतमेनं\n" +
                            "भूत्वा पुन: सौम्यवपुर्महात्मा ॥50॥",
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
                    text = "Sanjaya said: Thus, having spoken to Arjuna in that manner, Vasudeva showed His own form again. And He, the exalted One, reassured this terrified one by again becoming serene in form.",
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
                    text = "अर्जुन उवाच |\n" +
                            "दृष्ट्वेदं मानुषं रूपं तव सौम्यं जनार्दन |\n" +
                            "इदानीमस्मि संवृत्त: सचेता: प्रकृतिं गत: ॥51॥",
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
                    text = "Arjuna said: O Janardana, having seen this serene human form of Yours, I have now become calm in mind and restored to my own nature.",
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
                    text = "श्रीभगवानुवाच |\n" +
                            "सुदुर्दर्शमिदं रूपं दृष्टवानसि यन्मम |\n" +
                            "देवा अप्यस्य रूपस्य नित्यं दर्शनकाङ्क्षिण: ॥52॥\n" +
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
                    text = "The Blessed Lord said: This form of Mine which you have seen is very difficult to see; even the gods are ever desirous of a vision of this form.",
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
                    text = "नाहं वेदैर्न तपसा न दानेन न चेज्यया |\n" +
                            "शक्य एवंविधो द्रष्टुं दृष्टवानसि मां यथा ॥53॥\n" +
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
                    text = "Not through the Vedas, not by austerity, not by gifts, nor even by sacrifice can I be seen in this form as you have seen Me.\n" +
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
                    text = "भक्त्या त्वनन्यया शक्य अहमेवंविधोऽर्जुन |\n" +
                            "ज्ञातुं द्रष्टुं च तत्वेन प्रवेष्टुं च परन्तप ॥54॥",
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
                    text = "But, O Arjuna, by single-minded devotion am I-in this form-able to be known and seen in reality, and also be entered into, O destroyer of foes.\n" +
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
                    text = "मत्कर्मकृन्मत्परमो मद्भक्त: सङ्गवर्जित: |\n" +
                            "निर्वैर: सर्वभूतेषु य: स मामेति पाण्डव ॥55॥",
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
                    text = "O son of Pandu, he who works for Me, accepts Me as the supreme Goal, is devoted to Me, is devoid of attachment and free from enmity towards all beings-he attains Me.\n" +
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
