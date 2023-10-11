package com.example.graphql.query

import com.example.data.api.CommentApi
import com.example.data.api.CommentApiImpl
import com.example.graphql.mapper.toCommentType
import com.example.graphql.type.CommentType
import com.expediagroup.graphql.server.operations.Query

class CommentQuery(
    private val commentApi: CommentApi = CommentApiImpl()
) : Query {
    suspend fun getComments(postId: Int): List<CommentType> {
        val comments = commentApi.getAllByPostId(postId)

        return comments.map { postModel -> postModel.toCommentType() }
    }
}
