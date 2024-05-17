package com.naomi.hostelmanagement.ui.theme.screens.HomeScreen

import android.annotation.SuppressLint
import android.app.Instrumentation
import android.content.Intent
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.models.Rooms
import com.naomi.hostelmanagement.navigation.ROUTE_HOME
import com.naomi.hostelmanagement.navigation.ROUTE_LOGIN
import com.naomi.hostelmanagement.navigation.ROUTE_MAIN
import com.naomi.hostelmanagement.navigation.ROUTE_VIEW_ROOM

//@Composable
//fun homeScreen(navController: NavController) {
//    Box(modifier = Modifier.fillMaxWidth()) {
//        Image(
//            painter = painterResource(id = R.drawable.home),
//            contentDescription = "background",
//            contentScale = ContentScale.FillHeight,
//            modifier = Modifier.matchParentSize()
//        )
//    }
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Welcome to chandarana hostels",
//        color = Color.Cyan,
//        fontFamily = FontFamily.Cursive,
//        fontSize = 30.sp)
//        Spacer(modifier = Modifier.height(100.dp))
//
//    }
//}
//data class Screen(val title: String, val icon: Int)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor", "SuspiciousIndentation")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavHostController) {
//
//    var isLoading by remember { mutableStateOf(true) }
//    var productList by remember { mutableStateOf(emptyList<Rooms>()) }
//    var displayedProductCount by remember { mutableStateOf(8) }
//    var progress by remember { mutableStateOf(0) }
//
////    LaunchedEffect(Unit) {
////        fetchProducts { fetchedProducts ->
////            productList = fetchedProducts
////            isLoading = false
////        }
////    }
//
//
//
//    var isDrawerOpen by remember { mutableStateOf(false) }
//
//    val callLauncher: ManagedActivityResultLauncher<Intent, Instrumentation.ActivityResult> =
//        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->
//
//        }
//
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//
//                    Text(text = " EverythingThrift",
//                        fontSize = 25.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Left,
//                        modifier = Modifier
//                    )
//
//
//
//                    // Text(text = stringResource(id = R.string.apen))
//                },
//                navigationIcon = @Composable {
//                    if (!isDrawerOpen) {
//                        IconButton(onClick = { isDrawerOpen = true }) {
//                            Icon(
//                                Icons.Default.Menu,
//                                contentDescription = "Menu",
//                                tint = Color.White
//                            )
//                        }
//                    }
//                },
//
//                actions = {
//                    IconButton(onClick = {
//                        navController.navigate(ROUTE_LOGIN) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//                        Icon(
//                            imageVector = Icons.Filled.AccountCircle,
//                            contentDescription = null,
//                            tint = Color.White
//                        )
//                    }
//                },
//
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Black,
//                    titleContentColor = Color.White,
//
//                    )
//
//            )
//        },
//
//        content = @Composable {
//
//            Box(
//
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clickable {
//                        if (isDrawerOpen) {
//                            isDrawerOpen = false
//                        }
//                    }
//            ) {
//
//
//                Spacer(modifier = Modifier.height(20.dp))
//
//
//
//
//                Spacer(modifier = Modifier.width(285.dp))
//
//
//
//
//                LazyColumn {
//
//                    item {
//
//                        Spacer(modifier = Modifier.height(100.dp))
//                        Column(Modifier.fillMaxSize()) {
//                            val images = listOf(
//
//                                R.drawable.sw,
//                                R.drawable.sw1,
//                                R.drawable.s1,
//                                R.drawable.s2,
//                                R.drawable.s3,
//
//                                R.drawable.s4,
//                                R.drawable.p1,
//                                R.drawable.p2,
//                                R.drawable.p3,
//                                R.drawable.p4,
//
//
//                                R.drawable.p5,
//                                R.drawable.w1,
//                                R.drawable.w2,
//                                R.drawable.w3,
//                                R.drawable.w4,
//
//
//                                R.drawable.w5,
//                                R.drawable.cad1,
//                                R.drawable.cad2,
//                                R.drawable.hoodie1,
//                                R.drawable.hod2,
//
//
//                                R.drawable.hod3,
//                                R.drawable.khaki1,
//                                R.drawable.khaki,
//                                R.drawable.f1,
//                                R.drawable.f2,
//
//                                )
//
////
////                            ImageSlideshow(imageList = images, modifier = Modifier
////                              //  .size(300.dp)
////                                .fillMaxSize(),)
//
//
//                            //Image(
//                            //painter = painterResource(id = R.drawable.bolin),
//                            // contentDescription = "",
//                            // Modifier.fillMaxSize(),
//                            // contentScale = ContentScale.Crop
//
//                            // )
//                        }
//                        Spacer(modifier = Modifier.height(15.dp))
//
//
//                        Row {
//                            Row {
//
//
//                                androidx.compose.material.IconButton(onClick = {
//                                    navController.navigate(ROUTE_VIEW_ROOM) {
//                                        popUpTo(ROUTE_HOME) { inclusive = true }
//                                    }
//                                }) {
//                                    Text(
//                                        text = "All Rooms",
//                                        fontWeight = FontWeight.Bold,
//                                        fontFamily = FontFamily.Cursive,
//                                        fontSize = (20.sp)
//                                    )
//                                }
//
//
//
//
//                                Spacer(modifier = Modifier.width(170.dp))
//
//
//
//
//                                androidx.compose.material.IconButton(onClick = {
//                                    navController.navigate(ROUTE_MAIN) {
//                                        popUpTo(ROUTE_HOME) { inclusive = true }
//                                    }
//                                }) {
//                                    Text(
//                                        text = "About Us",
//                                        fontWeight = FontWeight.Bold,
//                                        fontFamily = FontFamily.Cursive,
//                                        fontSize = (20.sp)
//                                    )
//                                }
//
//
//
//
//                                Spacer(modifier = Modifier.width(50.dp))
//
//
//                            }
//
//
//                        }
//
//                        Spacer(modifier = Modifier.width(50.dp))
//
//
//                    }
//
//                    item {
//
//
//
//
//                        LazyRow {
//                            item {
//
//
//
//
//
//
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_ROOM) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//
//
//                                        val images = listOf(
//
//                                            R.drawable.hod2,
//                                            R.drawable.hoodie1 ,
//                                            R.drawable.v3,
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
//
//
//
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(5.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
////                                    Image(
////                                        painter = painterResource(id = R.drawable.logo),
////                                        contentDescription = "",
////                                        modifier = Modifier
////                                            .fillMaxSize(),
////                                        contentScale= ContentScale.Crop
////                                    )
////
//
//                                        val images = listOf(
//                                            R.drawable.sw,
//                                            R.drawable.sw1,
//                                            R.drawable.w1,
//                                            R.drawable.w2 ,
//                                            R.drawable.w3,
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
////
//
//
//                                        val images = listOf(
//                                            R.drawable.sw,
//                                            R.drawable.sw1,
//                                            R.drawable.w1,
//                                            R.drawable.w2 ,
//
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
////
//
//                                        val images = listOf(
//
//                                            R.drawable.cad2,
//                                            R.drawable.hod3,
//                                            R.drawable.hod2,
//                                            R.drawable.hoodie1 ,
//
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
////                                    Image(
////                                        painter = painterResource(id = R.drawable.logo),
////                                        contentDescription = "",
////                                        modifier = Modifier
////                                            .fillMaxSize(),
////                                        contentScale= ContentScale.Crop
////                                    )
////
////                            Text(
////                                color = Color.Black,
////                                textAlign=TextAlign.Center,
////                                text = "Trousers",
////
////                                style = MaterialTheme.typography.headlineLarge,
////
////                                modifier = Modifier.padding(bottom = 26.dp)
////
////                            )
////
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//
//
//                                        val images = listOf(
//
//                                            R.drawable.w2 ,
//                                            R.drawable.s1 ,
//                                            R.drawable.s2,
//
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)

//
//                                    Image(
//                                        painter = painterResource(id = R.drawable.logo),
//                                        contentDescription = "",
//                                        modifier = Modifier
//                                            .fillMaxSize(),
//                                        contentScale= ContentScale.Crop
//                                    )
//
//                            Text(
//                                color = Color.Black,
//                                textAlign=TextAlign.Center,
//                                text = "T-Shirts",
//
//                                style = MaterialTheme.typography.headlineLarge,
//
//                                modifier = Modifier.padding(bottom = 26.dp)
//
//                            )
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        .size(190.dp)
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//
//                                        val images = listOf(
//
//                                            R.drawable.f1,
//                                            R.drawable.cad1 ,
//                                            R.drawable.cad2,
//
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
////                                    Image(
////                                        painter = painterResource(id = R.drawable.logo),
////                                        contentDescription = "",
////                                        modifier = Modifier
////                                            .fillMaxSize(),
////                                        contentScale= ContentScale.Crop
////                                    )
////
////                            Text(
////                                color = Color.Black,
////                                textAlign=TextAlign.Center,
////                                text = "Belts",
////
////                                style = MaterialTheme.typography.headlineLarge,
////
////                                modifier = Modifier.padding(bottom = 26.dp)
////
////                            )
////
////
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //  shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//
//                                        val images = listOf(
//
//                                            R.drawable.w2 ,
//                                            R.drawable.w3,
//                                            R.drawable.w4,
//
//                                            )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
////
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.w1,
//                                            R.drawable.s1,
//                                            R.drawable.p1,
//                                        )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),
//                                            // contentScale = ContentScale.Fit
//
//                                        )
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.f1,
//                                            R.drawable.hoodie1,
//                                            R.drawable.hoodie1,
//                                        )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//
////
////                                    Image(
////                                        painter = painterResource(id = R.drawable.logo),
////                                        contentDescription = "",
////                                        modifier = Modifier
////                                            .fillMaxSize(),
////                                        contentScale= ContentScale.Crop
////                                    )
//
////                            Text(
////                                color = Color.Black,
////                                textAlign=TextAlign.Center,
////                                text = "Jackets",
////
////                                style = MaterialTheme.typography.headlineLarge,
////
////                                modifier = Modifier.padding(bottom = 26.dp)
////
////                            )
//
//
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.f1,
//                                            R.drawable.hoodie1,
//                                            R.drawable.cad1,
//                                        )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        //.fillMaxWidth()
//                                        .size(190.dp)
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.jacjet2,
//                                            R.drawable.khaki1,
//                                            R.drawable.sw1,
//                                        )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        .size(190.dp)
//                                        //.fillMaxWidth()
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_HOME) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    // shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.cad2,
//                                            R.drawable.hod2,
//                                            R.drawable.p4,
//                                        )
//
//
//                                        ImageSlideshow(imageList = images, modifier = Modifier
//                                            //  .size(300.dp)
//                                            .fillMaxSize(),)
////
//                                    }
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Card(
//                                    modifier = Modifier
//                                        //.fillMaxSize()
//                                        .size(190.dp)
//                                        //.fillMaxWidth()
//                                        .clip(shape = RectangleShape)
//                                        .clickable {
//                                            navController.navigate(ROUTE_VIEW_PRODUCTS) {
//                                                popUpTo(ROUTE_HOME) { inclusive = true }
//                                            }
//                                        }
//                                        .padding(4.dp),
//
//                                    //  shape = RoundedCornerShape(100.dp),
//                                    colors = CardDefaults.cardColors(
//                                        containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                    ),
//
//                                    content = {
//
//                                        val images = listOf(
//                                            R.drawable.f2,
//                                            R.drawable.s1,
//                                            R.drawable.w1,
//                                        )
//
//
//                                        ImageSlideshow(
//                                            imageList = images,
//                                            modifier = Modifier
//                                                //  .size(300.dp)
//                                                .fillMaxSize(),
//                                        )
////
//
//                                    }
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//}
//
//
//@Preview
//@Composable
//fun homeScreenPreview(){
//    homeScreen(rememberNavController())
//}