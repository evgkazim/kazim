package ru.kazim.spring.rest.aspect;


import jakarta.servlet.http.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor;

import java.io.IOException;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class ApiLogAspectProcessor {

    private final HttpServletRequest httpServletRequest;
    private final DispatcherServlet dispatcherServlet;

    @Before(value = "@annotation(before)")
    public void before(ApiLogRequest before) {
        System.out.println(Arrays.toString(httpServletRequest.getCookies()));
//        throw new ResponseStatusException(HttpStatus.CREATED);
    }

    @AfterReturning(value = "@annotation(after)", returning = "responseEntity")
    public void after(ApiLogResponse after, ResponseEntity responseEntity) {
        System.out.println(responseEntity.getStatusCode().value());
        System.out.println(responseEntity.getHeaders());
        System.out.println(responseEntity.getBody());
        System.out.println(dispatcherServlet);
    }
}
