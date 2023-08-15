package com.sach.learningjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Nilesh Salunkhe on 15-08-2023.
 */
class ButtonView {

    @Preview(showBackground = true, showSystemUi = true, device = "id:Nexus S")
    @Composable
    fun ButtonWithBoarder() {
        Button(
            { },
            modifier = Modifier
                .fillMaxWidth(0.5f),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_200))
        ) {
            Text(
                "Value", modifier = Modifier
                    .padding(10.dp)
                    .background(Color.Red)
                    .clip(shape = RectangleShape)

            )
        }
    }
}