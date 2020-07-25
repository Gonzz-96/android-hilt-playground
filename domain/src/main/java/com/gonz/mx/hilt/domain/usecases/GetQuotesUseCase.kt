package com.gonz.mx.hilt.domain.usecases

import com.gonz.mx.hilt.domain.entities.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor() {
    operator fun invoke(): List<Quote> {
        TODO("Not yet implemented")
    }
}
