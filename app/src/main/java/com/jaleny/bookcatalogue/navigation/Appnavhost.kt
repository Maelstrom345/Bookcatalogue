package com.jaleny.bookcatalogue.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description2
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description3
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description4
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description5
import com.jaleny.bookcatalogue.ui.theme.Screens.description.description6
import com.jaleny.bookcatalogue.ui.theme.Screens.home.homescreen
import com.jaleny.bookcatalogue.ui.theme.Screens.login.LoginScreen
import com.jaleny.bookcatalogue.ui.theme.Screens.registration.Registerscreen
import com.jaleny.bookcatalogue.ui.theme.Screens.splash.SplashScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(),  startDestination:String= ROUTE_SPLASH) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            homescreen(navController)
        }
        composable(ROUTE_DESCRIPTION) {
            description(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            Registerscreen(navController)
        }
        composable(ROUTE_DESCRIPTION2){
            description2(navController )
}
        composable(ROUTE_DESCRIPTION3){
            description3(navController )
        }
        composable(ROUTE_DESCRIPTION4){
            description4(navController )
        }
        composable(ROUTE_DESCRIPTION5){
            description5(navController )
        }
        composable(ROUTE_DESCRIPTION6){
            description6(navController )
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }

    }
}


