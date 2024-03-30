package com.project.nasa.setting.adapter.in.web;

@io.swagger.v3.oas.annotations.tags.Tag(name = "Example", description = "Example API")
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/v1/example"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Lcom/project/nasa/setting/adapter/in/web/HelloController;", "", "()V", "Hello", "", "nasa"})
public class HelloController {
    
    public HelloController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    @io.swagger.v3.oas.annotations.Operation(summary = "Example API Summary", description = "Description")
    @org.jetbrains.annotations.NotNull()
    public java.lang.String Hello() {
        return null;
    }
}