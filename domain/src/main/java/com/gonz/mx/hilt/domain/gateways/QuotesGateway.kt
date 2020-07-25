package com.gonz.mx.hilt.domain.gateways

import com.gonz.mx.hilt.domain.entities.Quote

interface QuotesGateway {
    fun getQuotes(): List<Quote>
}
