package ru.kazim.spring.main.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/jpa", produces = "application/json")
public class JpaController {
    @PostMapping(path = "/user")
    public Object create() {
        return null;
    }
    @GetMapping(path = "/users/{id}")
    public Object read(@PathVariable(required = false) String id) {
        System.out.println(id);
        return null;
    }
    @PutMapping(path = "/user")
    public Object update() {
        return null;
    }
    @DeleteMapping(path = "/user/{id}")
    public Object delete() {
        return null;
    }
}
