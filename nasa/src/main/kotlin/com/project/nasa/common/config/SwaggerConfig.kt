package com.project.nasa.common.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@OpenAPIDefinition(info = Info(title = "NASA API DOCS", description = "Description", version = "v1"))
@Configuration
class SwaggerConfig {
    private val BEARER_TOKEN_PREFIX : String = "Bearer"

    @Bean
    fun openAPI(): OpenAPI {
        val securityJwtName = "JWT"
        val securityRequirement = SecurityRequirement().addList(securityJwtName)
        val components = Components()
            .addSecuritySchemes(
                securityJwtName, SecurityScheme()
                    .name(securityJwtName)
                    .type(SecurityScheme.Type.HTTP)
                    .scheme(BEARER_TOKEN_PREFIX)
                    .bearerFormat(securityJwtName)
            )
        return OpenAPI()
            .addSecurityItem(securityRequirement)
            .components(components)
    }
}