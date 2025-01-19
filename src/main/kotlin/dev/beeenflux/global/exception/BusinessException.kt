package dev.beeenflux.global.exception

import dev.beeenflux.global.error.ErrorEntity

class BusinessException(
    val errorEntity: ErrorEntity
) : RuntimeException(errorEntity.message)
