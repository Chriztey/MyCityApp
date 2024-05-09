package com.chris.mycityapp.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chris.mycityapp.Greeting
import com.chris.mycityapp.R
import com.chris.mycityapp.data.DataSource
import com.chris.mycityapp.ui.theme.MyCityAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDisplay(
    onClick: () -> Unit,
    name: String,
    @DrawableRes image: Int,
    shortText: String = ""
) {
   // Column(verticalArrangement = Arrangement.SpaceEvenly) {
        Card(
            onClick = onClick,
            elevation = CardDefaults.cardElevation(16.dp)

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "",
                    modifier = Modifier
                        .size(height = 120.dp, width = 120.dp)
                        .padding(5.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(5.dp))
                Column(modifier = Modifier.padding(end = 5.dp)) {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = shortText,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
   // }
}

@Preview(showBackground = true)
@Composable
fun ItemPreview() {
    MyCityAppTheme {
        ItemDisplay({}, "a", R.drawable.ic_launcher_background, shortText = "nug cafe serving traditional Japanese confections, cakes and matcha in a charming setting")

    }
}