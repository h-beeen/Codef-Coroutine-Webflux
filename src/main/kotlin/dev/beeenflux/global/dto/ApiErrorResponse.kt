package dev.beeenflux.global.dto

import dev.beeenflux.global.error.ErrorEntity
import java.time.LocalDateTime

data class ApiErrorResponse(
    val timeStamp: String = LocalDateTime.now().toString(),
    val errorCode: String,
    val errorMessage: String?,
) {
    constructor(errorEntity: ErrorEntity) : this(
        errorCode = errorEntity.code,
        errorMessage = errorEntity.message
    )
}
