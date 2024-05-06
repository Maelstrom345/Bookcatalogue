package com.jaleny.bookcatalogue.ui.theme.Screens.description

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.jaleny.bookcatalogue.components.BookDetailsCard
import com.jaleny.bookcatalogue.components.BookDetailsCard3
import com.jaleny.bookcatalogue.components.TopBar

@Composable
fun description3(navController: NavHostController){
    LazyColumn {
        item {
            TopBar(title = "return",navController)
        }
        item {
            BookDetailsCard3()
        }
    }
}