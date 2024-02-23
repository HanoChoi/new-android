package com.hano.splash_api.domain

import com.hano.splash_api.model.ModelA
import kotlinx.coroutines.flow.Flow

interface PostModelAUseCase {
    fun execute():Flow<Result<ModelA>>
}