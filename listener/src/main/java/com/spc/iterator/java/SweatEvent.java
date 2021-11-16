package com.spc.iterator.java;

/**
 * 流汗事件
 */
public class SweatEvent implements IEvent<EventSource> {


    private EventSource eventSource;

    public SweatEvent(EventSource eventSource) {
        this.eventSource = eventSource;
    }


    @Override
    public EventSource getSource() {
        return eventSource;
    }
}
