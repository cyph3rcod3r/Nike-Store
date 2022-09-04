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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.store.nike.R
import com.store.nike.ui.theme.*

@Composable
fun PDImageBox(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 400.dp)
            .clip(RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp))
            .background(color = ShoeBoxMain)
            .padding(top = 16.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "")
            }
            IconButton(onClick = {}) {
                Image(
                    modifier = Modifier.size(52.dp, 32.dp),
                    painter = painterResource(id = R.drawable.nike),
                    contentDescription = ""
                )
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.ic_like), contentDescription = "")
            }
        }

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Box(
                Modifier
                    .size(212.dp)
                    .clip(CircleShape)
                    .background(ShoeBoxCircle)
                    .align(Alignment.Center)
            )
            Image(
                painter = painterResource(id = R.drawable.shoe),
                contentDescription = null,
            )
        }

        Row(
            modifier = Modifier
                .align(alignment = CenterHorizontally)
                .padding(vertical = 16.dp)
        ) {
            Dot(color = dot1)
            Spacer(modifier = Modifier.size(8.dp))
            Dot(color = dot2)
            Spacer(modifier = Modifier.size(8.dp))
            Dot(color = dot3)
            Spacer(modifier = Modifier.size(8.dp))
            Dot(color = dot4)
        }
    }
}

@Composable
fun Dot(color: androidx.compose.ui.graphics.Color) {
    Spacer(
        modifier = Modifier
            .size(14.dp)
            .background(color = color, shape = CircleShape)
    )
}

@Composable
fun SizeBox() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Select Size",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                fontFamily = dmFamily,
            )
            IconButton(onClick = { }, modifier = Modifier.size(24.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.expanded_forward_outline),
                    contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            val modifier = Modifier.size(40.dp)
            Card(modifier = modifier, elevation = 12.dp) {
                Box(modifier = modifier, contentAlignment = Center) {
                    Text(
                        text = "39",
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = dmFamily
                    )
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            Card(modifier = modifier, elevation = 12.dp) {
                Box(modifier = modifier, contentAlignment = Center) {
                    Text(
                        text = "40",
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = dmFamily
                    )
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            Card(modifier = modifier, elevation = 12.dp) {
                Box(modifier = modifier, contentAlignment = Center) {
                    Text(
                        text = "41",
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = dmFamily
                    )
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            Card(modifier = modifier, backgroundColor = dot3, elevation = 12.dp) {
                Box(modifier = modifier, contentAlignment = Center) {
                    Text(
                        text = "42",
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = dmFamily,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            Card(modifier = modifier, elevation = 12.dp) {
                Box(modifier = modifier, contentAlignment = Center) {
                    Text(
                        text = "43",
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = dmFamily
                    )
                }
            }
        }
    }
}

@Composable
fun DescriptionBox() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Description",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                fontFamily = dmFamily,
            )
            IconButton(onClick = { }, modifier = Modifier.size(24.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.expanded_forward_outline),
                    contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = "The Nike Joyride Run Flyknit is designed to help make running feel easier and give your legs a day off. Tiny foam beads underfoot conform to your foot for cushioning that stands up to your mileage.",
            textAlign = TextAlign.Start,
            fontSize = 16.sp,
            fontFamily = dmFamily,
        )
    }
}

@Composable
fun BottomBox(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
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
                fontSize = 20.sp,
                fontFamily = dmFamily,
            )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = button),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth().defaultMinSize(minHeight = 55.dp)
        ) {
            Text(
                text = "Add to Bag",
                textAlign = TextAlign.Start,
                fontSize = 18.sp,
                fontFamily = dmFamily,
                color = Color.White
            )
        }
    }
}