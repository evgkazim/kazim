package ru.kazim.spring.event.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
@ToString
public class Message extends ApplicationEvent {
    private int id;
    private String text;

    public Message(Object source, int id, String text) {
        super(source);
        this.id = id;
        this.text = text;
    }
}
