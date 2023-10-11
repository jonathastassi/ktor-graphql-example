package com.example.data.model

import com.fasterxml.jackson.annotation.JsonProperty

data class UserModel(
    val id: Int = 0,
    val name: String = "",
    val username: String = "",
    val email: String = "",
    val address: AddressModel = AddressModel(),
    val phone: String = "",
    val website: String = "",
    val company: CompanyModel = CompanyModel(),
)
