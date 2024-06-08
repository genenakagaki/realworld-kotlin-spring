package com.realworld.web.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.realworld.web.generated.model.Article
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
 * @param article 
 */
data class CreateArticle201Response(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("article", required = true) val article: Article
) {

}

