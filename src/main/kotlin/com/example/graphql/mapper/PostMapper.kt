package com.example.graphql.mapper

import com.example.data.model.PostModel
import com.example.graphql.type.PostType

fun PostModel.toPostType(): PostType {
    return PostType(
        id = id,
        title = title,
        body = body,
    )
}
