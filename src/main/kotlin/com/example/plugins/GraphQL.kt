package com.example.plugins

import com.example.graphql.query.CommentQuery
import com.example.graphql.query.PostQuery
import com.example.graphql.query.UserQuery
import com.expediagroup.graphql.server.ktor.GraphQL
import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import com.expediagroup.graphql.server.ktor.graphiQLRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.get

fun Application.configureGraphQL() {
    install(GraphQL) {
        schema {
            packages = listOf("com.example")
            queries = listOf(
                UserQuery(
                    userApi = get()
                ),
                PostQuery(
                    postApi = get()
                ),
                CommentQuery(
                    commentApi = get(),
                )
            )
        }
    }
    routing {
        graphiQLRoute()
        graphQLPostRoute()
    }
}
