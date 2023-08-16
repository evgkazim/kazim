package ru.kazim.spring.aspect;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Slf4j
@Aspect
@Component
public class ControllerAspect {
    @Around("@annotation(testController)")
    public Object trace(ProceedingJoinPoint joinPoint, TestController testController) throws Throwable {
        final Object[] args = joinPoint.getArgs();
        final HttpServletRequest servletRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        System.out.println(servletRequest.getCookies());
        return joinPoint.proceed(args);
    }
}
