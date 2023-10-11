package com.example.data.api

import com.example.data.model.UserModel
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class UserApiImpl(
    private val client: HttpClient = HttpClient(CIO)
) : UserApi {
    override suspend fun getAll(): List<UserModel> {
        val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/users")
        val userJson = response.bodyAsText()

        return jacksonObjectMapper().readValue<List<UserModel>>(userJson)
    }

    override suspend fun getById(id: Int): UserModel {
        val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/users/$id")
        val userJson = response.bodyAsText()

        return jacksonObjectMapper().readValue<UserModel>(userJson)
    }
}