package com.spc.bridging.java.bridging;

public class Phone extends App {
    public Phone(Message message) {
        super(message);
    }

    @Override
    public String sendMessage(int mills, String message) {
        System.out.println("phone send:");
        return this.message.sendMessage(mills, message);
    }

}
