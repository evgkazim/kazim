package ru.kazim.spring.main.service;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WebSocketService {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public String send(String message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return time;
    }
}
