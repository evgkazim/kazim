package ru.kazim.spring.websocket.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebSocketService {
    private final SimpMessageSendingOperations messageSending;

    public Object send(String to, String text) throws JsonProcessingException {
        messageSending.convertAndSend(to, text);
        return text;
    }
}
