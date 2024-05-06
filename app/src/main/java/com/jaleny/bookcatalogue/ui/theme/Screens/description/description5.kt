package com.jaleny.bookcatalogue.ui.theme.Screens.description

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jaleny.bookcatalogue.components.BookDetailsCard
import com.jaleny.bookcatalogue.components.BookDetailsCard5
import com.jaleny.bookcatalogue.components.TopBar

@Composable
fun description5(navController: NavHostController){
    LazyColumn {
        item {
            TopBar(title = "return",navController)
        }
        item {
            BookDetailsCard5()
        }
    }
}
@Preview
@Composable
private fun despre(){
    description5(navController = rememberNavController())
}