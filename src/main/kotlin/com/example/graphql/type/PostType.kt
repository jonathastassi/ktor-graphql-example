package com.example.graphql.type

import com.example.graphql.query.CommentQuery

class PostType(
    val id: Int = 0,
    val title: String = "",
    val body: String = "",
) {
    suspend fun comments(): List<CommentType> = CommentQuery().getComments(id)
}
