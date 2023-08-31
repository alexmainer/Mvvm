package com.example.mvvm.ui.theme.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.navigation.ROUTE_LOGIN
import com.example.mvvm.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavHostController){
    var email by remember { mutableStateOf(TextFieldValue(""))    }
    var pass by remember { mutableStateOf(TextFieldValue(""))    }
    
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
      Text(text = "LogIn !!")
      Text(text = "Here!!")  
      
      OutlinedTextField(
          value = email,
          onValueChange ={
              email=it
          }
      )
      OutlinedTextField(
          value = pass, 
          onValueChange ={
              pass=it
          
      }
      )

      Button(onClick = {
          navController.navigate(ROUTE_LOGIN)
      }
      )
      {
          Text(text = "LOGIN")
          
      }

      Button(onClick = {
          navController.navigate(ROUTE_REGISTER)
      }
      )
      {
          Text(text = "No account ? Register Here")
          
      }


        

    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    val navController = rememberNavController()
    Login(navController = navController)
}

