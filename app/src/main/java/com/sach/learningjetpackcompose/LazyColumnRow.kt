package com.sach.learningjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Nilesh Salunkhe on 15-08-2023.
 */
@Preview
@Composable
fun LazyList() {
    val listCity = mutableListOf("Pune", "Mumbai", "Thane")
    Column {
        LazyColumn {
            items(listCity){
                Text(text = it)
            }
        }
        LazyRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
            items(listCity) {
                Text(text = it)

            }
        }
    }
}