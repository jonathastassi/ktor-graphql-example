package com.example.data.api

import com.example.data.model.CommentModel

interface CommentApi {
    suspend fun getAllByPostId(postId: Int): List<CommentModel>
}
