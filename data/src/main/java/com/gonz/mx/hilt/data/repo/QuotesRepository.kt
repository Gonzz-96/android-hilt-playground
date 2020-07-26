package com.gonz.mx.hilt.data.repo

import com.gonz.mx.hilt.data.di.annotations.QuotesLocalDataSourceAnnotation
import com.gonz.mx.hilt.data.di.annotations.QuotesRemoteDataSourceAnnotation
import com.gonz.mx.hilt.data.sources.QuotesDataSource
import com.gonz.mx.hilt.domain.entities.Quote
import com.gonz.mx.hilt.domain.gateways.QuotesGateway
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuotesRepository @Inject constructor(
    @QuotesLocalDataSourceAnnotation private val quotesLocalDataSource: QuotesDataSource,
    @QuotesRemoteDataSourceAnnotation private val quotesRemoteDataSource: QuotesDataSource
): QuotesGateway {
    override fun getQuotes(): List<Quote> {
        TODO("Not yet implemented")
    }
}
