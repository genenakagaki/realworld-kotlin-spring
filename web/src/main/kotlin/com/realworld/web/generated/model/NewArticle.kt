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
 * @param title 
 * @param description 
 * @param body 
 * @param tagList 
 */
data class NewArticle(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("description", required = true) val description: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("body", required = true) val body: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tagList") val tagList: kotlin.collections.List<kotlin.String>? = null
) {

}

