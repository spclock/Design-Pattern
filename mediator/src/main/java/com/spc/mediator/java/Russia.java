package com.spc.mediator.java;

public class Russia extends Country{
    @Override
    public void send(String message) {
        System.out.println("==============俄罗斯发送的消息:" + message);
        mediator.notifyAllCountry(this,message);
    }

    @Override
    public void receive(String message) {
        System.out.println("俄罗斯收到的消息： "+message);
    }
}
