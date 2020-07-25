package com.gonz.mx.hilt.data.repo

import com.gonz.mx.hilt.domain.entities.Quote
import com.gonz.mx.hilt.domain.gateways.QuotesGateway
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuotesRepository @Inject constructor(): QuotesGateway {
    override fun getQuotes(): List<Quote> {
        TODO("Not yet implemented")
    }
}
