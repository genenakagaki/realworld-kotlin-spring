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
 * @param username 
 * @param bio 
 * @param image 
 * @param following 
 */
data class Profile(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("username", required = true) val username: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bio", required = true) val bio: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image", required = true) val image: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("following", required = true) val following: kotlin.Boolean
) {

}

