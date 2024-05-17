package com.naomi.hostelmanagement.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naomi.hostelmanagement.ui.theme.screens.Gallery.GalleryScreen
//import com.naomi.hostelmanagement.ui.theme.screens.Gallery.galleryScreen
import com.naomi.hostelmanagement.ui.theme.screens.HomeScreen.HomeScreen
import com.naomi.hostelmanagement.ui.theme.screens.LoginScreen.LoginScreen
import com.naomi.hostelmanagement.ui.theme.screens.RegisterScreen.RegisterScreen
import com.naomi.hostelmanagement.ui.theme.screens.RoomScreen.BookingScreen
import com.naomi.hostelmanagement.ui.theme.screens.Rooms.AddRoomsScreen
import com.naomi.hostelmanagement.ui.theme.screens.Rooms.UpdateRoomScreen
import com.naomi.hostelmanagement.ui.theme.screens.Rooms.ViewRoomsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String = ROUTE_HOME){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination ){
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
        composable(ROUTE_GALLERY){ GalleryScreen(navController)}
        composable(ROUTE_ADD_ROOM){ AddRoomsScreen(navController)}
        composable(ROUTE_VIEW_ROOM){ ViewRoomsScreen(navController)}
        composable(ROUTE_BOOK){ BookingScreen(navController)}

        composable(ROUTE_UPDATE_ROOM+"/{id}") { passedData ->
            UpdateRoomScreen(
                navController, passedData.arguments?.getString("id")!!
            )
        }
        composable(ROUTE_VIEW_UPLOAD){
            //           viewUploadsScreen(navController)
        }

    }

}