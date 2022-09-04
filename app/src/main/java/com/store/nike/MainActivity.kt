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

package com.store.nike

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.store.nike.ui.composables.*
import com.store.nike.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Home(this@MainActivity)
//                ProductDetail()
            }
        }
    }
}

@Composable
fun Home(context: Context?) {
    Surface(modifier = Modifier.fillMaxSize(), color = White) {
        Scaffold(backgroundColor = White) {
            RectangleShape()
            Column {
                TopBar("Nike")
                SearchRow()
                CategoryRow()
                LazyRow {
                    items(5) { index ->
                        if (index == 0) {
                            Spacer(modifier = Modifier.size(16.dp))
                        }
                        ProductBox()
                    }
                }
                OfferTitle()
                Spacer(modifier = Modifier.size(16.dp))
                LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    items(3) { index ->
                        if (index == 0) {
                            Spacer(modifier = Modifier.size(16.dp))
                        }
                        OfferProductCard()
                    }
                }
            }
        }
    }
}

@Composable
fun ProductDetail() {
    Surface(modifier = Modifier.fillMaxSize(), color = White) {
        Scaffold(backgroundColor = White) {
            Column(modifier = Modifier.fillMaxSize()) {
                PDImageBox()
                Spacer(modifier = Modifier.size(24.dp))
                SizeBox()
                Spacer(modifier = Modifier.size(24.dp))
                DescriptionBox()
                Spacer(modifier = Modifier.weight(1F))
                BottomBox(modifier = Modifier)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Home(null)
    }
}