package com.spc.bridging.java.bridging;

public abstract class App {

    protected Message message;

    public App(Message message) {
        this.message = message;
    }

    abstract public String sendMessage(int mills,String message);
}
