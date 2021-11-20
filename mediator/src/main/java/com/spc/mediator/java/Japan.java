package com.spc.mediator.java;

public class Japan extends Country{
    @Override
    public void send(String message) {
        System.out.println("==============日本发送的消息:" + message);
        mediator.notifyAllCountry(this,message);
    }

    @Override
    public void receive(String message) {
        System.out.println("日本收到的消息： "+message);
    }
}
