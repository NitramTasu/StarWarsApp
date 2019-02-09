package br.com.martin.starwarsapp.data.remote

import br.com.martin.starwarsapp.data.local.entity.People
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PeopleWebService{
    
    @GET("/people/{id}")
    fun  getUser(@Path("people") peopleId: Int): Call<People>
}