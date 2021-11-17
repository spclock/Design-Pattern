package com.spc.listener.java;


/**
 * 心跳加快事件
 */
public class HeartbeatSpeedUpEvent implements IEvent<EventSource> {


    private EventSource eventSource;

    public HeartbeatSpeedUpEvent(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    @Override
    public EventSource getSource() {
        return eventSource;
    }
}
