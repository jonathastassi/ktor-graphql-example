package com.example.graphql.query

import com.example.data.api.UserApi
import com.example.data.api.UserApiImpl
import com.example.graphql.mapper.toUserType
import com.example.graphql.type.UserType
import com.expediagroup.graphql.server.operations.Query

class UserQuery(
    private val userApi: UserApi = UserApiImpl()
) : Query {
    suspend fun getUsers(): List<UserType> {
        val users = userApi.getAll()

        return users.map { userModel -> userModel.toUserType() }
    }

    suspend fun getUser(id: Int): UserType {
        val user = userApi.getById(id)

        return user.toUserType()
    }
}
