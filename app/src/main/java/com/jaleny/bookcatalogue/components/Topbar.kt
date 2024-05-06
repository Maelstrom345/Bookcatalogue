package com.jaleny.bookcatalogue.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jaleny.bookcatalogue.R
import com.jaleny.bookcatalogue.navigation.ROUTE_HOME
import com.jaleny.bookcatalogue.ui.theme.Typography

@Composable
fun TopBar(title:String,navController: NavHostController){
    Row(modifier = Modifier
       .clickable(onClick = { navController.navigate(ROUTE_HOME) })
        .fillMaxWidth()
        .padding(start = 16.dp, top = 16.dp, end = 16.dp),horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = stringResource(R.string.text_back_button))
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = title, style = Typography.headlineMedium, color = MaterialTheme.colorScheme.onPrimary)

    }
}