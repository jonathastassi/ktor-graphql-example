package com.example.graphql.mapper

import com.example.data.model.UserModel
import com.example.graphql.type.AddressType
import com.example.graphql.type.CompanyType
import com.example.graphql.type.GeoType
import com.example.graphql.type.UserType

fun UserModel.toUserType(): UserType {
    return UserType(
        id = this.id,
        name = this.name,
        username = this.username,
        email = this.email,
        address = AddressType(
            street = this.address.street,
            suite = this.address.suite,
            city = this.address.city,
            zipcode = this.address.zipcode,
            geo = GeoType(
                lat = this.address.geo.lat,
                lng = this.address.geo.lng,
            )
        ),
        phone = this.phone,
        website = this.website,
        company = CompanyType(
            name = this.company.name,
            bs = this.company.bs,
            catchPhrase = this.company.catchPhrase,
        ),
    )
}
