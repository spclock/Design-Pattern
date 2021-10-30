package com.spc.bridging.java.bridging;

public class WeChat extends App {
    public WeChat(Message message) {
        super(message);
    }

    @Override
    public String sendMessage(int mills, String message) {
        System.out.println("WeChat send:");
        return this.message.sendMessage(mills, message);
    }
}
