package com.example.graphql.mapper

import com.example.data.model.CommentModel
import com.example.graphql.type.CommentType

fun CommentModel.toCommentType(): CommentType {
    return CommentType(
        id = id,
        name = name,
        email = email,
        body = body,
    )
}
