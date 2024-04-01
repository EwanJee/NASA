package com.project.nasa.setting.adapter.out.persistence.entity;

@jakarta.persistence.Table(name = "MEMBER")
@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/entity/MemberEntity;", "", "id", "", "nickname", "", "email", "password", "created", "Ljava/time/LocalDateTime;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "getCreated", "()Ljava/time/LocalDateTime;", "getEmail", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNickname", "setNickname", "(Ljava/lang/String;)V", "getPassword", "setPassword", "updateNickname", "", "name", "nasa"})
public final class MemberEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Column(name = "id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @jakarta.persistence.Column(name = "nickname")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickname;
    @jakarta.persistence.Column(name = "email")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @jakarta.persistence.Column(name = "password")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    @org.springframework.data.annotation.CreatedDate()
    @jakarta.persistence.Column(name = "created")
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime created = null;
    
    public MemberEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @jakarta.validation.constraints.Email()
    @org.jetbrains.annotations.NotNull()
    java.lang.String email, @jakarta.validation.constraints.Min(value = 6L)
    @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime created) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCreated() {
        return null;
    }
    
    public final void updateNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}