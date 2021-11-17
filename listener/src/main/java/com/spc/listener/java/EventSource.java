package com.spc.listener.java;

public class EventSource {

    private IListener listener;

    public void sport(){
        System.out.println("EventSource to do something");
        // ignore doSomething
        listener.handlerEvent(new HeartbeatSpeedUpEvent(this));
        listener.handlerEvent(new SweatEvent(this));
        // ignore doOtherThing
    }

    public void addListener(IListener listener) {
        this.listener = listener;
    }
}
