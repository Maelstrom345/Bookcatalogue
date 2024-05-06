package com.jaleny.bookcatalogue.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION2
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION3
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION4
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION5
import com.jaleny.bookcatalogue.navigation.ROUTE_DESCRIPTION6
import com.jaleny.bookcatalogue.ui.theme.Typography
import com.jaleny.bookcatalogue.ui.theme.primary
import com.jaleny.bookcatalogue.ui.theme.text


@Composable
fun Itembooklist(navController: NavHostController)
                  {



    Card(modifier = Modifier
        .clickable(onClick = { navController.navigate(ROUTE_DESCRIPTION) })
        .background(MaterialTheme.colorScheme.onSurface)) {
Row(modifier= Modifier
    .fillMaxWidth()
    .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
    Image(
        painter = rememberAsyncImagePainter(
            model ="https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg"
        ),
        contentDescription = null,
        modifier = Modifier
            .size(98.dp, 145.dp)
            .padding(16.dp),
        contentScale = ContentScale.Inside
    )
    Spacer(modifier = Modifier.width(12.dp))
    Column() {
        Text(text = "Unlocking Android" ,style = Typography.labelMedium, color = text.copy(0.7F))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text ="W. Frank Ableson, Charlie Collins, Robi Sen", style = Typography.titleLarge, color = text)
        Spacer(modifier = Modifier.height(12.dp))
        Box(modifier = Modifier
            .clip(shape = RoundedCornerShape(24.dp))
            .background(primary.copy(.10F))
            .padding(start = 12.dp, end = 12.dp, top = 5.dp, bottom = 5.dp)
            ,
            contentAlignment = Alignment.Center
        ){ Text(text = "Open Source, Mobile" , style = Typography.labelMedium, color = primary)}


    }
    }
}
                      Card(modifier = Modifier
                          .clickable(onClick = {navController.navigate(ROUTE_DESCRIPTION2) })
                          .background(MaterialTheme.colorScheme.onSurface)) {
                          Row(modifier= Modifier
                              .fillMaxWidth()
                              .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                              Image(
                                  painter = rememberAsyncImagePainter(
                                      model ="https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson2.jpg"
                                  ),
                                  contentDescription = null,
                                  modifier = Modifier
                                      .size(98.dp, 145.dp)
                                      .padding(16.dp),
                                  contentScale = ContentScale.Inside
                              )
                              Spacer(modifier = Modifier.width(12.dp))
                              Column() {
                                  Text(text = "Android in Action, Second Edition" ,style = Typography.labelMedium, color = text.copy(0.7F))
                                  Spacer(modifier = Modifier.height(8.dp))
                                  Text(text ="W. Frank Ableson, Charlie Collins, Robi Sen", style = Typography.titleLarge, color = text)
                                  Spacer(modifier = Modifier.height(12.dp))
                                  Box(modifier = Modifier
                                      .clip(shape = RoundedCornerShape(24.dp))
                                      .background(primary.copy(.10F))
                                      .padding(
                                          start = 12.dp,
                                          end = 12.dp,
                                          top = 5.dp,
                                          bottom = 5.dp
                                      )
                                      ,
                                      contentAlignment = Alignment.Center
                                  ){ Text(text = "Java" , style = Typography.labelMedium, color = primary)}


                              }
                          }
                      }
                      Card(modifier = Modifier
                          .clickable(onClick = {navController.navigate(ROUTE_DESCRIPTION3) } )
                          .background(MaterialTheme.colorScheme.onSurface)) {
                          Row(modifier= Modifier
                              .fillMaxWidth()
                              .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                              Image(
                                  painter = rememberAsyncImagePainter(
                                      model =  "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/allen.jpg"
                                  ),
                                  contentDescription = null,
                                  modifier = Modifier
                                      .size(98.dp, 145.dp)
                                      .padding(16.dp),
                                  contentScale = ContentScale.Inside
                              )
                              Spacer(modifier = Modifier.width(12.dp))
                              Column() {
                                  Text(text = "Zend Framework in Action" ,style = Typography.labelMedium, color = text.copy(0.7F))
                                  Spacer(modifier = Modifier.height(8.dp))
                                  Text(text ="Tariq Ahmed with Jon Hirschi, Faisal Abid", style = Typography.titleLarge, color = text)
                                  Spacer(modifier = Modifier.height(12.dp))
                                  Box(modifier = Modifier
                                      .clip(shape = RoundedCornerShape(24.dp))
                                      .background(primary.copy(.10F))
                                      .padding(
                                          start = 12.dp,
                                          end = 12.dp,
                                          top = 5.dp,
                                          bottom = 5.dp
                                      )
                                      ,
                                      contentAlignment = Alignment.Center
                                  ){ Text(text = "Open Source, Mobile" , style = Typography.labelMedium, color = primary)}


                              }
                          }
                      }
                      Card(modifier = Modifier
                          .clickable(onClick = {navController.navigate(ROUTE_DESCRIPTION4) } )
                          .background(MaterialTheme.colorScheme.onSurface)) {
                          Row(modifier= Modifier
                              .fillMaxWidth()
                              .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                              Image(
                                  painter = rememberAsyncImagePainter(
                                      model = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/allmon.jpg"
                                  ),
                                  contentDescription = null,
                                  modifier = Modifier
                                      .size(98.dp, 145.dp)
                                      .padding(16.dp),
                                  contentScale = ContentScale.Inside
                              )
                              Spacer(modifier = Modifier.width(12.dp))
                              Column() {
                                  Text(text = "Flex on Java" ,style = Typography.labelMedium, color = text.copy(0.7F))
                                  Spacer(modifier = Modifier.height(8.dp))
                                  Text(text ="Satnam Alag", style = Typography.titleLarge, color = text)
                                  Spacer(modifier = Modifier.height(12.dp))
                                  Box(modifier = Modifier
                                      .clip(shape = RoundedCornerShape(24.dp))
                                      .background(primary.copy(.10F))
                                      .padding(
                                          start = 12.dp,
                                          end = 12.dp,
                                          top = 5.dp,
                                          bottom = 5.dp
                                      )
                                      ,
                                      contentAlignment = Alignment.Center
                                  ){ Text(text = "Internet" , style = Typography.labelMedium, color = primary)}


                              }
                          }
                      }

                      Card(modifier = Modifier
                          .clickable(onClick = {navController.navigate(ROUTE_DESCRIPTION5) } )
                          .background(MaterialTheme.colorScheme.onSurface)) {
                          Row(modifier= Modifier
                              .fillMaxWidth()
                              .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                              Image(
                                  painter = rememberAsyncImagePainter(
                                      model ="https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/almiray.jpg"
                                  ),
                                  contentDescription = null,
                                  modifier = Modifier
                                      .size(98.dp, 145.dp)
                                      .padding(16.dp),
                                  contentScale = ContentScale.Inside
                              )
                              Spacer(modifier = Modifier.width(12.dp))
                              Column() {
                                  Text(text = "Griffon in Action" ,style = Typography.labelMedium, color = text.copy(0.7F))
                                  Spacer(modifier = Modifier.height(8.dp))
                                  Text(text ="Andres Almiray, Danno Ferrin, James Shingler", style = Typography.titleLarge, color = text)
                                  Spacer(modifier = Modifier.height(12.dp))
                                  Box(modifier = Modifier
                                      .clip(shape = RoundedCornerShape(24.dp))
                                      .background(primary.copy(.10F))
                                      .padding(
                                          start = 12.dp,
                                          end = 12.dp,
                                          top = 5.dp,
                                          bottom = 5.dp
                                      )
                                      ,
                                      contentAlignment = Alignment.Center
                                  ){ Text(text = "Java" , style = Typography.labelMedium, color = primary)}


                              }
                          }
                      }
                      Card(modifier = Modifier
                          .clickable(onClick = {navController.navigate(ROUTE_DESCRIPTION6) } )
                          .background(MaterialTheme.colorScheme.onSurface)) {
                          Row(modifier= Modifier
                              .fillMaxWidth()
                              .padding(16.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                              Image(
                                  painter = rememberAsyncImagePainter(
                                      model ="https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/rappin.jpg"
                                  ),
                                  contentDescription = null,
                                  modifier = Modifier
                                      .size(98.dp, 145.dp)
                                      .padding(16.dp),
                                  contentScale = ContentScale.Inside
                              )
                              Spacer(modifier = Modifier.width(12.dp))
                              Column() {
                                  Text(
                                      text = "wxPython in Action",
                                      style = Typography.labelMedium,
                                      color = text.copy(0.7F)
                                  )
                                  Spacer(modifier = Modifier.height(8.dp))
                                  Text(text = "Noel Rappin, Robin Dunn", style = Typography.titleLarge, color = text)
                                  Spacer(modifier = Modifier.height(12.dp))
                                  Box(
                                      modifier = Modifier
                                          .clip(shape = RoundedCornerShape(24.dp))
                                          .background(primary.copy(.10F))
                                          .padding(
                                              start = 12.dp,
                                              end = 12.dp,
                                              top = 5.dp,
                                              bottom = 5.dp
                                          ),
                                      contentAlignment = Alignment.Center
                                  ) {
                                      Text(
                                          text = "Python",
                                          style = Typography.labelMedium,
                                          color = primary
                                      )
                                  }

                                  }
                              }
                              }
                          }





@Composable
fun Chipview(){
Box(modifier = Modifier
    .clip(shape = RoundedCornerShape(24.dp))
    .background(primary.copy(.10F))
    .padding(start = 12.dp, end = 12.dp, top = 5.dp, bottom = 5.dp)
    ,
    contentAlignment = Alignment.Center
    ){ Text(text = "category" , style = Typography.labelMedium, color = primary)}
    
}

@Preview
@Composable
private fun itemboxpre(){
    Itembooklist(navController = rememberNavController())
}