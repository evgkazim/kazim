package ru.kazim.spring.component;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestComp {
    private String name = "admin";
    private String pass = "admin";
}
