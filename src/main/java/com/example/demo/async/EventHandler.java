package com.example.demo.async;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import java.util.List;

public interface EventHandler {
     void doHandle(EventModel Model);
     List<EventType> getSupportEventTypes();
}
