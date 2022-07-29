package com.beatrice.myposts

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

    object ApiClient {
    var retrofit= Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")//THIS IS THE BASE
    //UPON WHICH WE ACCESS ALL IMPORTS
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
    }
}