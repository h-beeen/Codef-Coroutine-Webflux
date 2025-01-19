package dev.beeenflux.global.handler

import dev.beeenflux.global.dto.ApiErrorResponse
import dev.beeenflux.global.error.GlobalError
import dev.beeenflux.global.exception.BusinessException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.reactive.resource.NoResourceFoundException

@RestControllerAdvice
class BusinessExceptionHandler {

    @ExceptionHandler(BusinessException::class)
    fun handleBusinessException(
        exception: BusinessException
    ): ResponseEntity<ApiErrorResponse> {
        val errorEntity = exception.errorEntity

        return ResponseEntity
            .status(errorEntity.httpStatus)
            .body(ApiErrorResponse(errorEntity))
    }

    @ExceptionHandler(NoResourceFoundException::class)
    fun handleUnexpectedException(
        exception: NoResourceFoundException
    ): ResponseEntity<ApiErrorResponse> {
        val errorEntity = GlobalError.GLOBAL_NOT_FOUND

        return ResponseEntity
            .status(errorEntity.httpStatus)
            .body(ApiErrorResponse(errorEntity))
    }

    @ExceptionHandler(Exception::class)
    fun handleUnexpectedException(
        exception: Exception
    ): ResponseEntity<ApiErrorResponse> {
        val errorEntity = GlobalError.INTERNAL_SERVER_ERROR

        return ResponseEntity
            .status(errorEntity.httpStatus)
            .body(ApiErrorResponse(errorEntity))
    }
}