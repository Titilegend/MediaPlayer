package com.example.mediaplayer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.mediaplayer.ui.theme.MediaPlayerTheme
import com.example.mediaplayer.ui.theme.poppins

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediaPlayerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OnboardingScreen()
                    /*GetStartedButton()
                    IntroText()
                    IntroTextParagraph()*/
                }

            }
        }
    }
}


@Composable
fun OnboardingScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id =R.drawable.onboard_bg ), contentDescription = "onboard", contentScale = ContentScale.FillBounds)
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x=25.dp, y= -88.dp),
        verticalArrangement = Arrangement.Center) {
        Text( "Quality At Your\nFingertips",color = Color.White, fontSize = 35.sp, fontFamily = poppins, fontWeight = FontWeight.Medium)
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x = 30.dp, y = 2.dp),
        verticalArrangement = Arrangement.Center) {
        Text( "Enjoy your favourite movies, TV shows,\nmusic, and podcasts with the highest\nquality possible.",maxLines = 3, color = Color.White, fontSize = 15.sp, fontFamily = poppins, fontWeight = FontWeight.Normal)
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x = 35.dp, y = 320.dp)
        ,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = {
        },colors = ButtonDefaults.buttonColors(backgroundColor = Color.White), modifier = Modifier
            .height(52.dp)
            .width(320.dp), shape = RoundedCornerShape(15)
        ) {
            Text(text = "Get Started", color = Color(red = 5, green = 59 , blue = 105), fontSize = 15.sp,fontFamily = poppins, fontWeight = FontWeight.Medium, textAlign = TextAlign.Center)
        }
    }
}
@Composable
fun IntroText(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x = 30.dp, y = -100.dp),
        verticalArrangement = Arrangement.Center) {
        Text( "Quality At Your\nFingertips",color = Color.White, fontSize = 35.sp, fontFamily = poppins, fontWeight = FontWeight.Medium)
    }
}
@Composable
fun IntroTextParagraph(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x = 30.dp, y = 2.dp),
        verticalArrangement = Arrangement.Center) {
        Text( "Enjoy your favourite movies, TV shows,\nmusic, and podcasts with the highest\nquality possible.",maxLines = 3, color = Color.White, fontSize = 15.sp, fontFamily = poppins, fontWeight = FontWeight.Normal)
    }
}

@Composable
fun GetStartedButton()
{
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .offset(x = 35.dp, y = 320.dp)
        ,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = {
        },colors = ButtonDefaults.buttonColors(backgroundColor = Color.White), modifier = Modifier
            .height(52.dp)
            .width(320.dp), shape = RoundedCornerShape(15)
        ) {
            Text(text = "Get Started", color = Color(red = 5, green = 59 , blue = 105), fontSize = 15.sp,fontFamily = poppins, fontWeight = FontWeight.Medium, textAlign = TextAlign.Center)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MediaPlayerTheme {
        OnboardingScreen()
        /*GetStartedButton()
        IntroText()
        IntroTextParagraph()*/
    }
}
