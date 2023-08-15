package ru.kazim.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kazim.spring.component.TestComp;

@RestController
@RequestMapping(produces = "application/json")
public class MainCont {
    @Autowired
    private TestComp testComp;
    @GetMapping(path = "/test")
    public Object test() {
        return testComp.toString();
    }
}
