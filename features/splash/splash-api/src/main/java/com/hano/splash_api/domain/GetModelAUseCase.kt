package com.hano.splash_api.domain

import com.hano.splash_api.model.ModelA
import kotlinx.coroutines.flow.Flow

interface GetModelAUseCase {
    fun execute():Flow<Result<ModelA>>
}