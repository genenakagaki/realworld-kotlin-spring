package com.realworld.web.generated.api

import com.realworld.web.generated.model.GenericErrorModel
import com.realworld.web.generated.model.GetProfileByUsername200Response
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
class ProfilesApiController() {

    @Operation(
        summary = "Follow a user",
        operationId = "followUserByUsername",
        description = """Follow a user by username""",
        responses = [
            ApiResponse(responseCode = "200", description = "Profile", content = [Content(schema = Schema(implementation = GetProfileByUsername200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/profiles/{username}/follow"],
        produces = ["application/json"]
    )
    fun followUserByUsername(@Parameter(description = "Username of the profile you want to follow", required = true) @PathVariable("username") username: kotlin.String): ResponseEntity<GetProfileByUsername200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a profile",
        operationId = "getProfileByUsername",
        description = """Get a profile of a user of the system. Auth is optional""",
        responses = [
            ApiResponse(responseCode = "200", description = "Profile", content = [Content(schema = Schema(implementation = GetProfileByUsername200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/profiles/{username}"],
        produces = ["application/json"]
    )
    fun getProfileByUsername(@Parameter(description = "Username of the profile to get", required = true) @PathVariable("username") username: kotlin.String): ResponseEntity<GetProfileByUsername200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Unfollow a user",
        operationId = "unfollowUserByUsername",
        description = """Unfollow a user by username""",
        responses = [
            ApiResponse(responseCode = "200", description = "Profile", content = [Content(schema = Schema(implementation = GetProfileByUsername200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/profiles/{username}/follow"],
        produces = ["application/json"]
    )
    fun unfollowUserByUsername(@Parameter(description = "Username of the profile you want to unfollow", required = true) @PathVariable("username") username: kotlin.String): ResponseEntity<GetProfileByUsername200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
