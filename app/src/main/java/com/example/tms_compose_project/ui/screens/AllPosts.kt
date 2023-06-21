package com.example.tms_compose_project.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.tms_compose_project.PostCard
import com.example.tms_compose_project.data.Post

@Composable
fun AllPosts(
    posts: List<Post>,
    context: Context
) {
    LazyColumn(
        Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
    ) {

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 25.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "New posts",
                    style = MaterialTheme.typography.h2
                )
            }
        }

        items(posts) { post ->
            PostCard(
                name = post.name,
                description = post.description,
                image = post.imageRes
            ) {
                //TODO add implementation
                Toast.makeText(context, "${post.id}", Toast.LENGTH_LONG).show()
            }
        }
    }
}