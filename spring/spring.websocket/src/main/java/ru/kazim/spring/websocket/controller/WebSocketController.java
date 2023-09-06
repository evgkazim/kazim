package ru.kazim.spring.websocket.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.kazim.spring.websocket.service.WebSocketService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class WebSocketController {
    private final WebSocketService webSocketService;

    @MessageMapping("/setup")
    public void setup(@Payload String message) {}

    @MessageMapping("/message")
    public void message(@Payload String message) {}

    @ResponseBody
    @GetMapping(path = "/send", produces = "application/json")
    public Object send(@RequestParam(defaultValue = "/topic/messages") String to, @RequestParam(defaultValue = "null") String text) throws JsonProcessingException {
        return webSocketService.send(to, text);
    }
}
