package com.naomi.hostelmanagement.ui.theme.screens.Mpesa

import android.widget.Toast
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
//import com.example.myproject.navigation.ROUTE_HOME
import com.naomi.hostelmanagement.navigation.ROUTE_HOME

@Composable
fun MpesaScreen(navController: NavHostController) {
    val context = LocalContext.current

    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = {
            // Navigate to the home screen
            navController.navigate(ROUTE_HOME)

            // Check if the M-Pesa app is installed on the device
            val mpesaPackage = "com.android.stk"
            val mpesaLaunchIntent = context.packageManager.getLaunchIntentForPackage(mpesaPackage)

            // If M-Pesa app is installed, launch it
            mpesaLaunchIntent?.let { intent ->
                context.startActivity(intent)
            } ?: run {
                // If M-Pesa app is not installed, show a message or handle the scenario accordingly
                Toast.makeText(context, "M-Pesa app not installed", Toast.LENGTH_SHORT).show()
            }
        },
        colors = ButtonDefaults.buttonColors(Color.Blue),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        androidx.compose.material3.Text(
            text = "Xpress Mpesa",

        )
    }
}
@Preview
@Composable
fun MpesaScreenPreview(){
    MpesaScreen(rememberNavController())
}