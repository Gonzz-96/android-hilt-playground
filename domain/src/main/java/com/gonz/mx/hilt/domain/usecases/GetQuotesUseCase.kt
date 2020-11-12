package com.gonz.mx.hilt.domain.usecases

import com.gonz.mx.hilt.domain.entities.Quote
import com.gonz.mx.hilt.domain.gateways.QuotesGateway
import javax.inject.Inject

/**
 * In Hilt, there are several scopes that will correspond
 * to different default components provided by it. When
 * a class has no scope, meaning that has no scope annotations,
 * a new instance will be created in every request.
 *
 * In the case of this use case, there will be a new instance
 * of it every time a ViewModel request it.
 */
class GetQuotesUseCase @Inject constructor(
    private val quotesGateway: QuotesGateway
) {
    operator fun invoke(): List<Quote> {
        TODO("Not yet implemented")
    }

    fun getStrings() = "$this --> ${quotesGateway.getString()}"
}

class AnotherUseCaseXD @Inject constructor(
    private val quotesGateway: QuotesGateway
) {
    fun getStrings() = "$this --> ${quotesGateway.getString()}"
}
