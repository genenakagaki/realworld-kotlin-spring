package com.realworld.web.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param email 
 * @param token 
 * @param username 
 * @param bio 
 * @param image 
 */
data class User(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("token", required = true) val token: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("username", required = true) val username: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bio", required = true) val bio: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image", required = true) val image: kotlin.String
) {

}

