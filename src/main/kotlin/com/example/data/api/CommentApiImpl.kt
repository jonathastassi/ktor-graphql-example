package com.example.data.api

import com.example.data.model.CommentModel
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class CommentApiImpl(
    private val client: HttpClient = HttpClient(CIO)
) : CommentApi {
    override suspend fun getAllByPostId(postId: Int): List<CommentModel> {
        val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts/1/comments")
        val postJson = response.bodyAsText()

        return jacksonObjectMapper().readValue<List<CommentModel>>(postJson)
    }
}
