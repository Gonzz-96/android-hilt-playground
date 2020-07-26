package com.gonz.mx.hilt.data.sources

import com.gonz.mx.hilt.domain.entities.Quote

interface QuotesDataSource {
    fun getQuotes(): List<Quote>
}
