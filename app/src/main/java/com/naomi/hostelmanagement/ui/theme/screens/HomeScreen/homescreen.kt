package com.naomi.hostelmanagement.ui.theme.screens.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.navigation.ROUTE_ADD_ROOM
import com.naomi.hostelmanagement.navigation.ROUTE_GALLERY

import com.naomi.hostelmanagement.navigation.ROUTE_ROOMSIZE
import com.naomi.hostelmanagement.navigation.ROUTE_VIEW_ROOM


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Chandarana Hostels")
                },
//                backgroundColor = Color.White,
//                contentColor = Color.Black,
//                elevation = AppBarDefaults.TopAppBarElevation
              Modifier.background(Color.Blue)
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White) // Set background color if needed
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "background",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Welcome to Chandrana Hostels",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 100.dp)
                )

                Text(
                    text = "Find shared living spaces locally with near rental",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 100.dp)
                )

                Button(
                    onClick = { navController.navigate(ROUTE_ADD_ROOM) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Add Rooms")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { navController.navigate(ROUTE_GALLERY) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "View Rooms")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}