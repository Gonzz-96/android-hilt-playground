package com.gonz.mx.hilt.data.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class QuotesLocalDataSourceAnnotation

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class QuotesRemoteDataSourceAnnotation
