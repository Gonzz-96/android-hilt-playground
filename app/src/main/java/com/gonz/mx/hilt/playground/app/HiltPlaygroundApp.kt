package com.gonz.mx.hilt.playground.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Hilt provides a single annotation that will mark
 * our application class: @HildAndroidApp.
 * This annotation will help us to reduce all the
 * Dagger's boilerplate, for example, the
 * HasAndroidInjector interface, and will start
 * the DI process.
 */
@HiltAndroidApp
class HiltPlaygroundApp : Application()
