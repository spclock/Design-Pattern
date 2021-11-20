package com.spc.mediator.java;

public class America extends Country{
    @Override
    public void send(String message) {
        System.out.println("==============美国发送的消息:" + message);
        mediator.notifyAllCountry(this,message);
    }

    @Override
    public void receive(String message) {
        System.out.println("美国收到的消息： "+message);
    }
}
