package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.home.Home
import com.example.mvvm.ui.theme.screens.login.Login


@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_REGISTER
){
    NavHost(navController=navController,startDestination=startDestination){

        composable(ROUTE_LOGIN){
            Login(navController)
        }
        composable(ROUTE_HOME){
            Home(navController)
        }




    }



}


