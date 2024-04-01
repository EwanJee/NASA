package com.project.nasa.setting.application.port.in.dto.request.apod;

/**
 * 예시 :
 * {
 *  "model": "gpt-3.5-turbo",
 *    "messages": [
 *      {
 *        "role": "system",
 *        "content": "You are an expert at translating English into Korean."
 *      },
 *      {
 *        "role": "user",
 *        "content": "Translate the following English-written paragraph into Korean : Hello my name is Ewan"
 *      }
 *    ]
 * }
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/project/nasa/setting/application/port/in/dto/request/apod/Message;", "", "role", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getRole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "updateContent", "", "paragraph", "nasa"})
public final class Message {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String role = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String content;
    
    public Message(@com.fasterxml.jackson.annotation.JsonProperty(value = "role")
    @org.jetbrains.annotations.NotNull()
    java.lang.String role, @com.fasterxml.jackson.annotation.JsonProperty(value = "content")
    @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void updateContent(@org.jetbrains.annotations.Nullable()
    java.lang.String paragraph) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.nasa.setting.application.port.in.dto.request.apod.Message copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "role")
    @org.jetbrains.annotations.NotNull()
    java.lang.String role, @com.fasterxml.jackson.annotation.JsonProperty(value = "content")
    @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}