package com.spc.bridging.java.bridging;

public class NormalMessage implements Message {
    @Override
    public String sendMessage(int mill,String message) {
        return message;
    }
}
