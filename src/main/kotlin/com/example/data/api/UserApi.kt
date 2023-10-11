package com.example.data.api

import com.example.data.model.UserModel

interface UserApi {
    suspend fun getAll(): List<UserModel>
    suspend fun getById(id: Int): UserModel
}
