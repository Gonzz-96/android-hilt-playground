package com.gonz.mx.hilt.data.service

import com.gonz.mx.hilt.domain.entities.Quote
import retrofit2.http.GET
import retrofit2.http.Path

interface QuotesService {
    @GET("/")
    fun getQuotes(): List<Quote>
}
