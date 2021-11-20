package com.spc.mediator.java;

public abstract class Country {
    protected Mediator mediator;

    public abstract void send(String message);
    public abstract void receive(String message);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
