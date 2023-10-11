package com.example.data.api

import com.example.data.model.PostModel

interface PostApi {
    suspend fun getAllByUserId(userId: Int): List<PostModel>
}
