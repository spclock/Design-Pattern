package com.spc.facade.java.facade;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void ready() {
        System.out.println(name + "   player ready");
    }


    public void load() {
        System.out.println(name + "   loading game ...");
    }

    public void play() {
        System.out.println(name + "    the player fighting");
    }

    public void reward() {
        System.out.println(name + "    get reward");
    }
}
