/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.store.nike.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.store.nike.R
import com.store.nike.ui.theme.*

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = null)
        },
        placeholder = {
            Text(text = "Search", color = Black)
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = White,
            leadingIconColor = Black,
            focusedIndicatorColor = Transparent,
            unfocusedIndicatorColor = Transparent
        ),
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .heightIn(min = 56.dp)
            .shadow(8.dp, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun SearchRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        SearchBar()
        Spacer(modifier = Modifier.size(16.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = null,
                modifier = Modifier
                    .size(56.dp)
                    .shadow(8.dp, shape = RoundedCornerShape(8.dp))
            )
        }
    }
}

@Composable
fun TopBar(title: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(id = R.drawable.gg_menu_left),
                contentDescription = null,
                modifier = Modifier.size(24.dp, 24.dp)
            )
        }
        Text(
            text = title,
            color = Black,
            modifier = Modifier.padding(start = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontFamily = dmFamily
        )

        IconButton(onClick = { }) {
            Image(
                painter = painterResource(id = R.drawable.teenyicons_bell),
                contentDescription = null,
                modifier = Modifier.size(16.dp, 16.dp)
            )
        }
    }
}

@Composable
fun RectangleShape() {
    EmptyBox(shape = androidx.compose.ui.graphics.RectangleShape)
}

@Composable
fun EmptyBox(shape: Shape) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .height(115.dp)
                .fillMaxWidth()
                .clip(shape)
                .background(Grey)
        )
    }
}

@Composable
fun ProductBox(modifier: Modifier = Modifier) {
    Box(
        modifier
            .width(243.dp)
            .heightIn(min = 378.dp)
    ) {
        Card(elevation = 4.dp, shape = RoundedCornerShape(8.dp)) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(ShoeBoxMain)
                    .heightIn(min = 378.dp)
                    .fillMaxWidth(0.8F)
            ) {
                Box(
                    Modifier
                        .size(156.dp)
                        .clip(CircleShape)
                        .background(ShoeBoxCircle)
                        .align(Alignment.Center)
                )
            }
        }
        Column {
            Text(
                text = "Nike\nJordan",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                fontFamily = dmFamily,
                modifier = Modifier.padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
            )
            Image(
                painter = painterResource(id = R.drawable.shoe),
                contentDescription = null,
                modifier = Modifier
                    .width(243.dp)
                    .heightIn(215.dp)
            )
            Spacer(modifier = Modifier.size(16.dp))
            PriceBox()
        }
    }
}

@Composable
fun PriceBox(){
    Box(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxWidth(0.8F)){
        Column {
            Text(
                text = "Price",
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                fontFamily = dmFamily
            )
            Text(
                text = "₹19,985",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                fontFamily = dmFamily,
            )
        }
        IconButton(onClick = { },
            Modifier
                .size(32.dp)
                .align(
                    Alignment.BottomEnd
                )) {
            Image(painterResource(id = R.drawable.ic_like), contentDescription = null)
        }
    }
}

@Composable
fun CategoryRow(title: String = "Popular"){
    Spacer(modifier = Modifier.size(16.dp))
    Row {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            fontFamily = dmFamily,
            modifier = Modifier
                .padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
                .clickable { }
        )

        Text(
            text = "New Arrivals",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = E5Grey,
            fontSize = 24.sp,
            fontFamily = dmFamily,
            modifier = Modifier.padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
        )

        Text(
            text = "Jordans",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = E5Grey,
            fontSize = 24.sp,
            fontFamily = dmFamily,
            modifier = Modifier.padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
        )
    }
    Spacer(modifier = Modifier.size(32.dp))
}

@Composable
fun OfferTitle(){
    Spacer(modifier = Modifier.size(16.dp))
    Box(Modifier.fillMaxWidth(0.95F)){
        Text(
            text = "On Offer",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 28.sp,
            fontFamily = dmFamily,
            modifier = Modifier
                .padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
                .align(Alignment.TopStart)
        )

        Text(
            text = "See All",
            textAlign = TextAlign.Start,
            fontSize = 16.sp,
            fontFamily = dmFamily,
            modifier = Modifier
                .padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
                .align(Alignment.CenterEnd)
        )
    }
}

@Composable
fun OfferProductCard(){
    Box{
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
            .heightIn(min = 100.dp)){
            Card(elevation = 4.dp,
                modifier = Modifier
                    .widthIn(315.dp)
                    .heightIn(min = 100.dp)) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .heightIn(min = 100.dp)
                        .fillMaxWidth(0.8F)
                        .padding(start = 8.dp, top = 8.dp)
                ) {
                    Row {
                        Box(
                            Modifier
                                .size(80.dp)
                                .clip(CircleShape)
                                .background(ShoeBoxCircle)
                        )
                        Column {
                            Text(
                                text = "Nike Vapor Fly",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Start,
                                fontSize = 16.sp,
                                fontFamily = dmFamily,
                                modifier = Modifier
                                    .padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
                            )
                            Text(
                                text = "Men's Sports Shoes",
                                textAlign = TextAlign.Start,
                                fontSize = 14.sp,
                                fontFamily = dmFamily,
                                modifier = Modifier
                                    .padding(paddingValues = PaddingValues(16.dp, 8.dp, 0.dp, 0.dp))
                            )
                        }
                    }
                    Image(painter = painterResource(id = R.drawable.ic_enter_bg), contentDescription = null, Modifier.align(
                        Alignment.BottomEnd))
                    Image(painter = painterResource(id = R.drawable.ic_enter), contentDescription = null,
                        Modifier
                            .align(
                                Alignment.BottomEnd
                            )
                            .padding(16.dp))
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.shoe),
            contentDescription = null,
            modifier = Modifier
                .offset((-15).dp, 0.dp)
                .width(130.dp)
                .heightIn(65.dp)
        )
    }
}

@Preview
@Composable
fun Preview() {
    JetpackComposeTheme {
        OfferProductCard()
    }
}