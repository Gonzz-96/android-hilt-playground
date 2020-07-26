package com.gonz.mx.hilt.playground.di

import com.gonz.mx.hilt.data.di.QuotesLocalDataSourceAnnotation
import com.gonz.mx.hilt.data.sources.QuotesDataSource
import com.gonz.mx.hilt.data.sources.QuotesLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class DataSourcesModule {
    @Binds
    @QuotesLocalDataSourceAnnotation
    abstract fun bindQuotesLocalDataSource(quotesLocalDataSource: QuotesLocalDataSource): QuotesDataSource
}
