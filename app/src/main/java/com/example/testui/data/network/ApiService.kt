package com.example.testui.data.network

import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): String
}