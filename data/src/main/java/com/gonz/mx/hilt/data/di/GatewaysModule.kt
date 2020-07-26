package com.gonz.mx.hilt.data.di

import com.gonz.mx.hilt.data.repo.QuotesRepository
import com.gonz.mx.hilt.domain.gateways.QuotesGateway
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * UPDATE 1: The note below is not true. The code didn't
 * compile because app module didn't have a dependency
 * on data module. So Hilt didn't have access to the
 * implementation of the gateways (which are used in
 * the domain module), hence Hilt wasn't able to provide
 * the real implementations, making impossible the
 * creation of the use cases.
 *
 * IMPORTANT NOTE [DEPRECATED NOTE]: Apparently, all the hilt modules
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
