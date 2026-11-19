package com.example.proxima_centauri_b_owen_3tie.data.api

import com.example.proxima_centauri_b_owen_3tie.data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}