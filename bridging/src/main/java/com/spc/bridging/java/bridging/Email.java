package com.spc.bridging.java.bridging;

public class Email extends App {
    public Email(Message message) {
        super(message);
    }

    @Override
    public String sendMessage(int mills, String message) {
        System.out.println("email send:");
        return this.message.sendMessage(mills, message);
    }
}
