package com.gonz.mx.hilt.data.di

import javax.inject.Qualifier

/**
 * IMPORTANT NOTE: when using Hilt, it is possible
 * to create different annotations while providing
 * more than one implementation of an interface or
 * an abstract class. In this case, the annotations
 * can be in the respective module (in this case, the
 * data module) unlike the modules: they MUST be in
 * the app module.
 */
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class QuotesLocalDataSourceAnnotation

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class QuotesRemoteDataSourceAnnotation
