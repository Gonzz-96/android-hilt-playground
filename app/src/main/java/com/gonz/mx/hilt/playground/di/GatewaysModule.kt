package com.gonz.mx.hilt.playground.di

import com.gonz.mx.hilt.data.repo.QuotesRepository
import com.gonz.mx.hilt.domain.gateways.QuotesGateway
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * IMPORTANT NOTE: Apparently, all the hilt modules
 * should be in the app module. When I put this module
 * in the data module, app didn't even compile, although
 * everything was correctly written. Once I moved this class
 * into the app module, everything ran ok.
 */
@Module
@InstallIn(ApplicationComponent::class)
abstract class GatewaysModule {
    @Binds
    abstract fun bindQuotesRepository(quotesRepository: QuotesRepository): QuotesGateway
}
