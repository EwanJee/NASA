package com.project.nasa.common.config.security;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0012@\u0012X\u0093\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/project/nasa/common/config/security/JwtTokenProvider;", "", "()V", "ACCESS_TOKEN_VALID_TIME", "", "REFRESH_TOKEN_VALID_TIME", "secretKey", "", "init", "", "nasa"})
public class JwtTokenProvider {
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.secret.key}")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String secretKey = "";
    private final long ACCESS_TOKEN_VALID_TIME = 1800000L;
    private final long REFRESH_TOKEN_VALID_TIME = 604800000L;
    
    public JwtTokenProvider() {
        super();
    }
    
    @jakarta.annotation.PostConstruct()
    @kotlin.OptIn(markerClass = {kotlin.io.encoding.ExperimentalEncodingApi.class})
    protected void init() {
    }
}