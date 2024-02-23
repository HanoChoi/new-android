package com.hano.splash_impl

import com.hano.splash_api.domain.GetModelAUseCase
import com.hano.splash_api.domain.ModelARepo
import com.hano.splash_api.model.ModelA
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DefaultGetModelAUseCase @Inject constructor(
    val repo:ModelARepo
) : GetModelAUseCase{
    override fun execute(): Flow<Result<ModelA>> {
        return repo.get()
    }
}