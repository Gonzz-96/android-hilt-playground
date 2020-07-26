package com.gonz.mx.hilt.data.sources

import com.gonz.mx.hilt.data.service.QuotesService
import com.gonz.mx.hilt.domain.entities.Quote
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuotesRemoteDataSource @Inject constructor(
    private val myNumber: QuotesService
) : QuotesDataSource {
    override fun getQuotes(): List<Quote> = emptyList()
}
