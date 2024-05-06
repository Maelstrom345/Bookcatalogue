package com.jaleny.bookcatalogue.ui.theme.Screens.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.jaleny.bookcatalogue.components.Itembooklist
import com.jaleny.bookcatalogue.components.TextInputField

@Composable
fun homescreen(navController: NavHostController){

    LazyColumn {
        item { 
       Itembooklist(navController)
        }
    }
}