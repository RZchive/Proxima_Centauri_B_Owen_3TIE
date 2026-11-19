package com.example.proxima_centauri_b_owen_3tie.data.api

import com.example.proxima_centauri_b_owen_3tie.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}