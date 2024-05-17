package com.naomi.hostelmanagement.ui.theme.screens.Rooms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.naomi.hostelmanagement.R

import com.naomi.hostelmanagement.data.HostelViewModel
import com.naomi.hostelmanagement.models.Upload

import com.naomi.hostelmanagement.navigation.ROUTE_UPDATE_ROOM


@Composable
fun ViewUploadsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var roomRepository = HostelViewModel(navController, context)


        val emptyUploadState = remember { mutableStateOf(Upload("","","","","")) }
        var emptyUploadsListState = remember { mutableStateListOf<Upload>() }

        var uploads = roomRepository.viewUploads(emptyUploadState, emptyUploadsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All uploads",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(uploads){
                    UploadItem(
                        name = it.name,
                        hostel = it.hostel,
                        fee= it.fee,
                        imageUrl = it.imageUrl,
                        id = it.id,
                        navController = navController,
                        roomRepository = roomRepository
                    )
                }
            }
        }
    }
}


@Composable
fun UploadItem(name:String, fee:String, hostel:String, imageUrl:String, id:String,
               navController:NavHostController, roomRepository: HostelViewModel
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = hostel)
        Text(text = fee )
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = null,
            modifier = Modifier.size(128.dp)
        )
        Button(onClick = {
            roomRepository.deleteHostel(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_ROOM+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}