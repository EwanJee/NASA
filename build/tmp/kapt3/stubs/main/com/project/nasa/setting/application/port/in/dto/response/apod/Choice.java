package com.project.nasa.setting.application.port.in.dto.response.apod;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/project/nasa/setting/application/port/in/dto/response/apod/Choice;", "", "index", "", "message", "Lcom/project/nasa/setting/application/port/in/dto/request/apod/Message;", "(ILcom/project/nasa/setting/application/port/in/dto/request/apod/Message;)V", "getIndex", "()I", "getMessage", "()Lcom/project/nasa/setting/application/port/in/dto/request/apod/Message;", "nasa"})
public final class Choice {
    private final int index = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.application.port.in.dto.request.apod.Message message = null;
    
    public Choice(@com.fasterxml.jackson.annotation.JsonProperty(value = "index")
    int index, @com.fasterxml.jackson.annotation.JsonProperty(value = "message")
    @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.in.dto.request.apod.Message message) {
        super();
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.nasa.setting.application.port.in.dto.request.apod.Message getMessage() {
        return null;
    }
}