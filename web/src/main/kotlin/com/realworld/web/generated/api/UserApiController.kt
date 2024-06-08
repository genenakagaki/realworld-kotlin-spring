package com.realworld.web.generated.api

import com.realworld.web.generated.model.GenericErrorModel
import com.realworld.web.generated.model.Login200Response
import com.realworld.web.generated.model.UpdateCurrentUserRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api}")
class UserApiController() {

    @Operation(
        summary = "Get current user",
        operationId = "getCurrentUser",
        description = """Gets the currently logged-in user""",
        responses = [
            ApiResponse(responseCode = "200", description = "User", content = [Content(schema = Schema(implementation = Login200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user"],
        produces = ["application/json"]
    )
    fun getCurrentUser(): ResponseEntity<Login200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update current user",
        operationId = "updateCurrentUser",
        description = """Updated user information for current user""",
        responses = [
            ApiResponse(responseCode = "200", description = "User", content = [Content(schema = Schema(implementation = Login200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/user"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateCurrentUser(@Parameter(description = "User details to update. At least **one** field is required.", required = true) @Valid @RequestBody body: UpdateCurrentUserRequest): ResponseEntity<Login200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
