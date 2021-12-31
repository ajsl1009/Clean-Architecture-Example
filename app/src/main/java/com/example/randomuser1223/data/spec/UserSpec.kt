package com.example.randomuser1223.data.spec


import com.google.gson.annotations.SerializedName

data class UserSpec(
    @SerializedName("info")
    val info: Info = Info(),
    @SerializedName("results")
    val results: List<Result> = listOf(),
) {
    data class Info(
        @SerializedName("page")
        val page: Int = 0, // 1
        @SerializedName("results")
        val results: Int = 0, // 1
        @SerializedName("seed")
        val seed: String = "", // fea8be3e64777240
        @SerializedName("version")
        val version: String = "", // 1.3
    )

    data class Result(
        @SerializedName("cell")
        val cell: String = "", // 081-454-0666
        @SerializedName("dob")
        val dob: Dob = Dob(),
        @SerializedName("email")
        val email: String = "", // brad.gibson@example.com
        @SerializedName("gender")
        val gender: String = "", // male
        @SerializedName("id")
        val id: Id = Id(),
        @SerializedName("location")
        val location: Location = Location(),
        @SerializedName("login")
        val login: Login = Login(),
        @SerializedName("name")
        val name: Name = Name(),
        @SerializedName("nat")
        val nat: String = "", // IE
        @SerializedName("phone")
        val phone: String = "", // 011-962-7516
        @SerializedName("picture")
        val picture: Picture = Picture(),
        @SerializedName("registered")
        val registered: Registered = Registered(),
    ) {
        data class Dob(
            @SerializedName("age")
            val age: Int = 0, // 26
            @SerializedName("date")
            val date: String = "", // 1993-07-20T09:44:18.674Z
        )

        data class Id(
            @SerializedName("name")
            val name: String = "", // PPS
            @SerializedName("value")
            val value: String = "", // 0390511T
        )

        data class Location(
            @SerializedName("city")
            val city: String = "", // kilcoole
            @SerializedName("coordinates")
            val coordinates: Coordinates = Coordinates(),
            @SerializedName("postcode")
            val postcode: String = "", // 93027
            @SerializedName("state")
            val state: String = "", // waterford
            @SerializedName("street")
            val street: Street = Street(), // 9278 new road
            @SerializedName("timezone")
            val timezone: Timezone = Timezone(),
        ) {
            data class Coordinates(
                @SerializedName("latitude")
                val latitude: String = "", // 20.9267
                @SerializedName("longitude")
                val longitude: String = "", // -7.9310
            )

            data class Street(
                @SerializedName("number")
                val number: String = "", //7585
                @SerializedName("name")
                val name: String = "",
            )

            data class Timezone(
                @SerializedName("description")
                val description: String = "", // Newfoundland
                @SerializedName("offset")
                val offset: String = "", // -3:30
            )
        }

        data class Login(
            @SerializedName("md5")
            val md5: String = "", // dc523cb313b63dfe5be2140b0c05b3bc
            @SerializedName("password")
            val password: String = "", // firewall
            @SerializedName("salt")
            val salt: String = "", // TQA1Gz7x
            @SerializedName("sha1")
            val sha1: String = "", // 7a4aa07d1bedcc6bcf4b7f8856643492c191540d
            @SerializedName("sha256")
            val sha256: String = "", // 74364e96174afa7d17ee52dd2c9c7a4651fe1254f471a78bda0190135dcd3480
            @SerializedName("username")
            val username: String = "", // silverswan131
            @SerializedName("uuid")
            val uuid: String = "", // 155e77ee-ba6d-486f-95ce-0e0c0fb4b919
        )

        data class Name(
            @SerializedName("first")
            val first: String = "", // brad
            @SerializedName("last")
            val last: String = "", // gibson
            @SerializedName("title")
            val title: String = "", // mr
        )

        data class Picture(
            @SerializedName("large")
            val large: String = "", // https://randomuser.me/api/portraits/men/75.jpg
            @SerializedName("medium")
            val medium: String = "", // https://randomuser.me/api/portraits/med/men/75.jpg
            @SerializedName("thumbnail")
            val thumbnail: String = "", // https://randomuser.me/api/portraits/thumb/men/75.jpg
        )

        data class Registered(
            @SerializedName("age")
            val age: Int = 0, // 17
            @SerializedName("date")
            val date: String = "", // 2002-05-21T10:59:49.966Z
        )
    }
}