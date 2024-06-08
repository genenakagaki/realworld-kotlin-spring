package com.realworld.web.generated.api

import jakarta.validation.ConstraintViolationException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

// TODO Extend ApiException for custom exception handling, e.g. the below NotFound exception
sealed class ApiException(msg: String, val code: HttpStatus) : Exception(msg)

class NotFoundException(msg: String, code: HttpStatus = HttpStatus.NOT_FOUND) : ApiException(msg, code)


@ControllerAdvice
class DefaultExceptionHandler {

    @ExceptionHandler(value = [ApiException::class])
    fun onApiException(ex: ApiException): Mono<ServerResponse> =
        ServerResponse.status(ex.code)
            .bodyValue(ex.message!!)

    @ExceptionHandler(value = [NotImplementedError::class])
    fun onNotImplemented(ex: NotImplementedError): Mono<ServerResponse> =
        ServerResponse.status(HttpStatus.NOT_IMPLEMENTED)
            .bodyValue(ex.message!!)

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun onConstraintViolation(ex: ConstraintViolationException): Mono<ServerResponse> =
        ServerResponse.status(HttpStatus.BAD_REQUEST)
            .bodyValue(ex.constraintViolations.joinToString(", ") {it.message})
}
