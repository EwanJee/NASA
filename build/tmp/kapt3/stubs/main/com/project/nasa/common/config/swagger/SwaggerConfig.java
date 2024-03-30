package com.project.nasa.common.config.swagger;

@io.swagger.v3.oas.annotations.OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "NASA API DOCS", description = "Description", version = "v1"))
@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/project/nasa/common/config/swagger/SwaggerConfig;", "", "()V", "BEARER_TOKEN_PREFIX", "", "openAPI", "Lio/swagger/v3/oas/models/OpenAPI;", "nasa"})
public class SwaggerConfig {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BEARER_TOKEN_PREFIX = "Bearer";
    
    public SwaggerConfig() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public io.swagger.v3.oas.models.OpenAPI openAPI() {
        return null;
    }
}