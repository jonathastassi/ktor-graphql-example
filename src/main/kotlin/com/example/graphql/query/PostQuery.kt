package com.example.graphql.query

import com.example.data.api.PostApi
import com.example.data.api.PostApiImpl
import com.example.graphql.mapper.toPostType
import com.example.graphql.type.PostType
import com.expediagroup.graphql.server.operations.Query

class PostQuery(
    private val postApi: PostApi = PostApiImpl()
) : Query {
    suspend fun getPosts(userId: Int): List<PostType> {
        val posts = postApi.getAllByUserId(userId)

        return posts.map { postModel -> postModel.toPostType() }
    }
}
