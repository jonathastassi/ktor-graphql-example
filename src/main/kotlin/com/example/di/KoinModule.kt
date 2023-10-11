package com.example.di

import com.example.data.api.*
import org.koin.dsl.module

val koinModule = module {
    single<UserApi> { UserApiImpl() }
    single<PostApi> { PostApiImpl() }
    single<CommentApi> { CommentApiImpl() }
}
