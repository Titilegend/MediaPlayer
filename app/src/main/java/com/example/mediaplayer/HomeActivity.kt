package com.example.mediaplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.mediaplayer.ui.theme.MediaPlayerTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //MediaPlayerTheme {
                // A surface container using the 'background' color from the theme
                //Surface(
                    //modifier = Modifier.fillMaxSize(),
                   // color = MaterialTheme.colors.background
                //) {
                    HomeScreen()
                }
            }
        }
    //}
//}


    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun HomeScreen(){
        Scaffold(
            topBar = { TopBar()},
            bottomBar = { BottomNavigationBar() },
            content = { padding->// We have to pass the scaffold inner padding to our content. That's why we use Box.
                Box(modifier = Modifier.padding(padding)){


                }
            },
        backgroundColor = colorResource(R.color.white) )
        LazyVerticalGrid(cells = GridCells.Fixed(count= 2),
                            contentPadding = PaddingValues(8.dp)
        ){
            items(count = 10){num->
                CardView()
            }
        }
    }
    @Composable
    fun CardView(){
        Card(modifier = Modifier.size(80.dp)
            .width(100.dp)
            .height(200.dp)
            .padding(6.dp)
            .offset(y = 80.dp),
            elevation = 2.dp,) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ){

            }
        }
    }


    @Composable
    fun TopBar() {
        TopAppBar(
            title = { Text(text = stringResource(id = R.string.app_name), fontSize = 18.sp) },
            backgroundColor = Color.Transparent,
            contentColor = Color.Black,
            elevation = 0.dp
        )
    }


    @Composable
    fun BottomNavigationBar() {
        val items = listOf(
            NavigationItem.Video,
            NavigationItem.Audio,
           // NavigationItem.Playlists,
            NavigationItem.Settings
        )
        BottomNavigation(modifier = Modifier.graphicsLayer {
            shape = RoundedCornerShape(
                topStart = 10.dp,
                topEnd = 10.dp
            )
            clip = true
        },
            backgroundColor = Color(red = 13, green = 1, blue = 120, alpha = 255),
            contentColor = Color.White
        ) {
            items.forEach { item ->
                BottomNavigationItem(icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                    label = { Text(text = item.title) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    alwaysShowLabel = true,
                    selected = false,
                    onClick = { })
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview2() {
        MediaPlayerTheme {
            HomeScreen()
            TopBar()

        }
    }
