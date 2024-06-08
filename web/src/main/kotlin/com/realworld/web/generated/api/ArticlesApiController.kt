package com.realworld.web.generated.api

import com.realworld.web.generated.model.CreateArticle201Response
import com.realworld.web.generated.model.CreateArticleComment200Response
import com.realworld.web.generated.model.CreateArticleCommentRequest
import com.realworld.web.generated.model.CreateArticleRequest
import com.realworld.web.generated.model.GenericErrorModel
import com.realworld.web.generated.model.GetArticleComments200Response
import com.realworld.web.generated.model.GetArticlesFeed200Response
import com.realworld.web.generated.model.UpdateArticleRequest
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
class ArticlesApiController() {

    @Operation(
        summary = "Create an article",
        operationId = "createArticle",
        description = """Create an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "201", description = "Single article", content = [Content(schema = Schema(implementation = CreateArticle201Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/articles"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createArticle(@Parameter(description = "Article to create", required = true) @Valid @RequestBody article: CreateArticleRequest): ResponseEntity<CreateArticle201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a comment for an article",
        operationId = "createArticleComment",
        description = """Create a comment for an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Single comment", content = [Content(schema = Schema(implementation = CreateArticleComment200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/articles/{slug}/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createArticleComment(@Parameter(description = "Slug of the article that you want to create a comment for", required = true) @PathVariable("slug") slug: kotlin.String,@Parameter(description = "Comment you want to create", required = true) @Valid @RequestBody comment: CreateArticleCommentRequest): ResponseEntity<CreateArticleComment200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Favorite an article",
        operationId = "createArticleFavorite",
        description = """Favorite an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Single article", content = [Content(schema = Schema(implementation = CreateArticle201Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/articles/{slug}/favorite"],
        produces = ["application/json"]
    )
    fun createArticleFavorite(@Parameter(description = "Slug of the article that you want to favorite", required = true) @PathVariable("slug") slug: kotlin.String): ResponseEntity<CreateArticle201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete an article",
        operationId = "deleteArticle",
        description = """Delete an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "No content"),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/articles/{slug}"],
        produces = ["application/json"]
    )
    fun deleteArticle(@Parameter(description = "Slug of the article to delete", required = true) @PathVariable("slug") slug: kotlin.String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a comment for an article",
        operationId = "deleteArticleComment",
        description = """Delete a comment for an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "No content"),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/articles/{slug}/comments/{id}"],
        produces = ["application/json"]
    )
    fun deleteArticleComment(@Parameter(description = "Slug of the article that you want to delete a comment for", required = true) @PathVariable("slug") slug: kotlin.String,@Parameter(description = "ID of the comment you want to delete", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Unfavorite an article",
        operationId = "deleteArticleFavorite",
        description = """Unfavorite an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Single article", content = [Content(schema = Schema(implementation = CreateArticle201Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/articles/{slug}/favorite"],
        produces = ["application/json"]
    )
    fun deleteArticleFavorite(@Parameter(description = "Slug of the article that you want to unfavorite", required = true) @PathVariable("slug") slug: kotlin.String): ResponseEntity<CreateArticle201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get an article",
        operationId = "getArticle",
        description = """Get an article. Auth not required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Single article", content = [Content(schema = Schema(implementation = CreateArticle201Response::class))]),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/articles/{slug}"],
        produces = ["application/json"]
    )
    fun getArticle(@Parameter(description = "Slug of the article to get", required = true) @PathVariable("slug") slug: kotlin.String): ResponseEntity<CreateArticle201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get comments for an article",
        operationId = "getArticleComments",
        description = """Get the comments for an article. Auth is optional""",
        responses = [
            ApiResponse(responseCode = "200", description = "Multiple comments", content = [Content(schema = Schema(implementation = GetArticleComments200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/articles/{slug}/comments"],
        produces = ["application/json"]
    )
    fun getArticleComments(@Parameter(description = "Slug of the article that you want to get comments for", required = true) @PathVariable("slug") slug: kotlin.String): ResponseEntity<GetArticleComments200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get recent articles globally",
        operationId = "getArticles",
        description = """Get most recent articles globally. Use query parameters to filter results. Auth is optional""",
        responses = [
            ApiResponse(responseCode = "200", description = "Multiple articles", content = [Content(schema = Schema(implementation = GetArticlesFeed200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/articles"],
        produces = ["application/json"]
    )
    fun getArticles(@Parameter(description = "Filter by tag") @Valid @RequestParam(value = "tag", required = false) tag: kotlin.String?,@Parameter(description = "Filter by author (username)") @Valid @RequestParam(value = "author", required = false) author: kotlin.String?,@Parameter(description = "Filter by favorites of a user (username)") @Valid @RequestParam(value = "favorited", required = false) favorited: kotlin.String?,@Min(0)@Parameter(description = "The number of items to skip before starting to collect the result set.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,@Min(1)@Parameter(description = "The numbers of items to return.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int): ResponseEntity<GetArticlesFeed200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get recent articles from users you follow",
        operationId = "getArticlesFeed",
        description = """Get most recent articles from users you follow. Use query parameters to limit. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Multiple articles", content = [Content(schema = Schema(implementation = GetArticlesFeed200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/articles/feed"],
        produces = ["application/json"]
    )
    fun getArticlesFeed(@Min(0)@Parameter(description = "The number of items to skip before starting to collect the result set.") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,@Min(1)@Parameter(description = "The numbers of items to return.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int): ResponseEntity<GetArticlesFeed200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update an article",
        operationId = "updateArticle",
        description = """Update an article. Auth is required""",
        responses = [
            ApiResponse(responseCode = "200", description = "Single article", content = [Content(schema = Schema(implementation = CreateArticle201Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "422", description = "Unexpected error", content = [Content(schema = Schema(implementation = GenericErrorModel::class))]) ],
        security = [ SecurityRequirement(name = "Token") ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/articles/{slug}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateArticle(@Parameter(description = "Slug of the article to update", required = true) @PathVariable("slug") slug: kotlin.String,@Parameter(description = "Article to update", required = true) @Valid @RequestBody article: UpdateArticleRequest): ResponseEntity<CreateArticle201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
