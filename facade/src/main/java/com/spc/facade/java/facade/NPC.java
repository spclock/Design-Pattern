package com.spc.facade.java.facade;

public class NPC {

    String name;

    public NPC(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + "   NPC walking");
    }
}
