package com.gonz.mx.hilt.data.di

import com.gonz.mx.hilt.data.service.QuotesService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RetrofitModule {
    @Provides
    @Singleton
    fun provideQuotesService(): QuotesService =
        Retrofit.Builder()
            .baseUrl("https://google.com")
            .build()
            .create(QuotesService::class.java)
}
