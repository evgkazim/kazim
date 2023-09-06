package ru.kazim.spring.event.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.kazim.spring.event.model.Message;

@Service
public class SimpleEventService {
    @EventListener
    public void onApplicationEvent(Message event) {
        System.out.println("SimpleEventService - " + event.toString());
    }
}
