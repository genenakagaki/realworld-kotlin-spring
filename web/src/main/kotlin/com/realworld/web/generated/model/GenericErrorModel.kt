package com.realworld.web.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.realworld.web.generated.model.GenericErrorModelErrors
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
 * @param errors 
 */
data class GenericErrorModel(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("errors", required = true) val errors: GenericErrorModelErrors
) {

}

