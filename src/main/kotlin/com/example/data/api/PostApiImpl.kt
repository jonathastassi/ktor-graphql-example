package com.example.data.api

import com.example.data.model.PostModel
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class PostApiImpl(
    private val client: HttpClient = HttpClient(CIO)
) : PostApi {
    override suspend fun getAllByUserId(userId: Int): List<PostModel> {
        val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts?userId=$userId")
        val postJson = response.bodyAsText()

        return jacksonObjectMapper().readValue<List<PostModel>>(postJson)
    }
}