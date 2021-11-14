package com.example.myapplication.api

import com.example.myapplication.models.ResponseListUsers
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/users?page=2")
    suspend fun getAllUsers(): Response<ResponseListUsers>
}