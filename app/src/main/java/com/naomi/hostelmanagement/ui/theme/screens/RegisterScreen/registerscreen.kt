package com.naomi.hostelmanagement.ui.theme.screens.RegisterScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.naomi.hostelmanagement.R
import com.naomi.hostelmanagement.data.AuthViewModel
import com.naomi.hostelmanagement.navigation.ROUTE_HOME
import com.naomi.hostelmanagement.navigation.ROUTE_LOGIN




@Composable
fun RegisterScreen(navController: NavController) {
    var contact by remember { mutableStateOf(TextFieldValue("")) }
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "background image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }

        Text(
            text = "Register here",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        // TextFields for user inputs
        val textFieldModifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        OutlinedTextField(
            value = name, onValueChange = { name = it },
            label = { Text(text = "Enter name") },
            modifier = textFieldModifier,
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            modifier = textFieldModifier,
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = contact, onValueChange = { contact = it },
            label = { text(text = "Enter contact") },
            modifier = textFieldModifier,
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = pass, onValueChange = { pass = it },
            label = { Text(text = "Enter password") },
            modifier = textFieldModifier,
            visualTransformation = PasswordVisualTransformation(),
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = confirmpass, onValueChange = { confirmpass = it },
            label = { Text(text = "Confirm Password") },
            modifier = textFieldModifier,
            visualTransformation = PasswordVisualTransformation(),
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Registration Button
        Button(
            onClick = {
                val authViewModel = AuthViewModel(navController, context)
                authViewModel.signup(email.text.trim(), pass.text.trim(), confirmpass.text.trim())
                navController.navigate(ROUTE_HOME)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Register ")
        }
        Spacer(modifier = Modifier.height(20.dp))

        // Navigation to Login Screen Button
        Button(
            onClick = {
                navController.navigate(ROUTE_LOGIN)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Have an Account? Click to Login")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(rememberNavController())

}