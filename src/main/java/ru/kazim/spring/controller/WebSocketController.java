package ru.kazim.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketController {
    @Autowired
    private SimpMessageSendingOperations simpMessageSendingOperations;

    @MessageMapping("/setup")
    public void setup(@Payload String message) {
        System.out.println("/setup " + message);
    }
    @MessageMapping("/message")
    public void message(@Payload String message) {
        System.out.println("/message " + message);
    }
    @GetMapping(path = "/send")
    public String send() {
        simpMessageSendingOperations.convertAndSend("/topic/messages", "{\"from\":\"1\",\"text\":\"1\"}");
        return "String.valueOf(simpUserRegistry.getUserCount());";
    }
}
