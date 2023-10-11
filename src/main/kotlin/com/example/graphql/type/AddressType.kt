package com.example.graphql.type

data class AddressType(
    val street: String = "",
    val suite: String = "",
    val city: String = "",
    val zipcode: String = "",
    val geo: GeoType = GeoType(),
)
