package com.naomi.hostelmanagement.ui.theme.screens.SplashScreen

import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    val scale = animateFloatAsState(
        targetValue = 0.7f,
        animationSpec = tween(
            durationMillis = 800,
            easing = {
                OvershootInterpolator(4f).getInterpolation(it)
            }
        )
    )

    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate(ROUTE_HOME)
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hostel),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = scale.value // Apply scaling animation
        )
        Spacer(
            modifier = Modifier.padding(20.dp)
        )
    }
}

@Preview
@Composable
private fun SplashScreenPrev(){
    SplashScreen(rememberNavController())
}