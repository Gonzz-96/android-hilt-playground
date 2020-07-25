package com.gonz.mx.hilt.playground

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.gonz.mx.hilt.domain.usecases.GetQuotesUseCase

class MainViewModel @ViewModelInject constructor(
    private val getQuotes: GetQuotesUseCase
) : ViewModel()
