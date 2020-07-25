package com.gonz.mx.hilt.data.sources

import com.gonz.mx.hilt.domain.entities.Quote
import javax.inject.Inject

class QuotesLocalDataSource @Inject constructor() {
    fun getStubbedQuotes() = listOf<Quote>()
}
