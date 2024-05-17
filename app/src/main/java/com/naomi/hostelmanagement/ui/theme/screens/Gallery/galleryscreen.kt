package com.naomi.hostelmanagement.ui.theme.screens.Gallery

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.navigation.ROUTE_BOOK
import com.naomi.hostelmanagement.navigation.ROUTE_GALLERY

//import com.example.stephanie.R


@Composable
fun GalleryScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.one),
                contentDescription = "one seater",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
            )

//            Text(
//                text = "select a room of comfort",
//                style = TextStyle(fontSize = 20.sp),
//                modifier = Modifier.padding(vertical = 20.dp)
//            )


            @Composable
            fun MultipleImagesScreen(navController: NavController) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SeatImage(imageId = R.drawable.one, description = "one seater")
                    SeatImage(imageId = R.drawable.two, description = "two seater")
                    SeatImage(imageId = R.drawable.three, description = "three seater")
                    SeatImage(imageId = R.drawable.four, description = "four seater")
                    SeatImage(imageId = R.drawable.six, description = "six Seater")
                    SeatImage(imageId = R.drawable.eight, description = "eight Seater")
                    SeatImage(imageId = R.drawable.sixteen, description = "sixteen seater")

                    Button(
                        onClick = { navController.navigate(ROUTE_BOOK) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp)
                    ) {
//                        Text(text = "Book")
                    }
                }
            }

            @Composable
            fun SeatImage(@DrawableRes imageId: Int, description: String) {
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = description,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                )
            }
            Button(
                onClick = { navController.navigate(ROUTE_BOOK) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
            ) {
//                Text(text = "Book")
            }

        }
    }
}

@Composable
fun SeatImage(@DrawableRes imageId: Int, description: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = description,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize()
        )
    }
}

@Preview
@Composable
fun GalleryScreenPreview() {
    GalleryScreen(rememberNavController())
}