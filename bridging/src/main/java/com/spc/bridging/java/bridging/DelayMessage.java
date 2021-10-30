package com.spc.bridging.java.bridging;

public class DelayMessage implements Message {
    @Override
    public String sendMessage(int mill, String message) {
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}
