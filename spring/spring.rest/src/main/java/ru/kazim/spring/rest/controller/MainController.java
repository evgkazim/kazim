package ru.kazim.spring.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kazim.spring.rest.aspect.ApiLogRequest;
import ru.kazim.spring.rest.aspect.ApiLogResponse;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class MainController {


    @ApiLogRequest
    @ApiLogResponse
    @GetMapping(path = "/get")
    public Object get() {
        return ResponseEntity.ok("{\"id\":1, \"name\":\"name\"}");
    }
}
