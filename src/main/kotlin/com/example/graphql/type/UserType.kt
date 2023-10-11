package com.example.graphql.type

import com.example.graphql.query.PostQuery

class UserType(
    val id: Int = 0,
    val name: String = "",
    val username: String = "",
    val email: String = "",
    val address: AddressType = AddressType(),
    val phone: String = "",
    val website: String = "",
    val company: CompanyType = CompanyType(),
) {
     suspend fun posts(): List<PostType> = PostQuery().getPosts(id)
 }
