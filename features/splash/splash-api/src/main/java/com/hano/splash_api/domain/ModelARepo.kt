package com.hano.splash_api.domain

import com.hano.splash_api.model.ModelA
import kotlinx.coroutines.flow.Flow

interface ModelARepo {
    fun get(): Flow<Result<ModelA>>
    fun post():Flow<Result<ModelA>>
}