package com.example.eventprocessing.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class AuditEvent<T>  extends ApplicationEvent {

    private final T data;

    public AuditEvent(T data) {
        super(data);
        this.data = data;
    }
}
