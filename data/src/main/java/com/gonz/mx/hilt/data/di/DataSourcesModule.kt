package com.gonz.mx.hilt.data.di

import com.gonz.mx.hilt.data.di.annotations.QuotesLocalDataSourceAnnotation
import com.gonz.mx.hilt.data.di.annotations.QuotesRemoteDataSourceAnnotation
import com.gonz.mx.hilt.data.sources.QuotesDataSource
import com.gonz.mx.hilt.data.sources.QuotesLocalDataSource
import com.gonz.mx.hilt.data.sources.QuotesRemoteDataSource
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

    @Binds
    @QuotesRemoteDataSourceAnnotation
    abstract  fun bindQuotesRemoteDataSource(quotesRemoteDataSource: QuotesRemoteDataSource): QuotesDataSource
}
