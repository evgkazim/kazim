package ru.kazim.spring.event.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kazim.spring.event.model.Message;

import java.util.concurrent.BlockingQueue;

@RestController
@RequestMapping(value = "/api/spring/event", produces = "application/json")
@RequiredArgsConstructor
public class SimpleEventController {
    private final BlockingQueue<String> blockingQueue;
    private final ApplicationEventPublisher applicationEventPublisher;
    private final ApplicationEventMulticaster applicationEventMulticaster;

    @GetMapping(value = "/add")
    public Object add(@RequestParam int id, @RequestParam String text) {
        Message message = new Message(this, id, text);
        applicationEventMulticaster.multicastEvent(message);
        return message;
    }
}
