package com.naomi.hostelmanagement.ui.theme.screens.Gallery

import android.content.ClipData.Item
import android.widget.ImageSwitcher
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.navigation.ROUTE_HOME
import com.naomi.hostelmanagement.navigation.ROUTE_MAIN
import com.naomi.hostelmanagement.navigation.ROUTE_VIEW_ROOM


@Composable
fun galleryScreen(navController: NavController) {


        Column(horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(text = "select a room of comfort")
            Spacer(modifier = Modifier.height(20.dp))



            Row {
                Row {


                    androidx.compose.material3.IconButton(onClick = {
                        navController.navigate(ROUTE_VIEW_ROOM) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }) {
                        Text(
                            text = "All Rooms",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = (20.sp)
                        )
                    }




                    Spacer(modifier = Modifier.width(170.dp))




                    androidx.compose.material3.IconButton(onClick = {
                        navController.navigate(ROUTE_MAIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }) {
                        Text(
                            text = "About Us",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = (20.sp)
                        )
                    }




                    Spacer(modifier = Modifier.width(50.dp))


                }


            }

            Spacer(modifier = Modifier.width(50.dp))


        }

        item {


            LazyRow {
                item {


                    Card(
                        modifier = Modifier
                            //.fillMaxSize()
                            //.fillMaxWidth()
                            .size(190.dp)
                            .clip(shape = RectangleShape)
                            .clickable {
                                navController.navigate(ROUTE_VIEW_ROOM) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            }
                            .padding(4.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                        ),

                        content = {


                            val images = listOf(

                                R.drawable.reception,
                                R.drawable.home,
                                R.drawable.hostel,

                                )


//                            ImageSlideShow(
//                                imageList = images,
//                                modifier = Modifier
//                                    //  .size(300.dp)
//                                    .fillMaxSize(),
//                            )


                        }
                    )
                }
            }
        }
    }


fun item(function: @Composable () -> Unit) {

}


@Preview
@Composable
fun galleryScreenPreview() {
    galleryScreen(rememberNavController())
}