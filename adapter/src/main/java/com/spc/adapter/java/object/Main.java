package com.spc.adapter.java.object;

public class Main {
    public static void main(String[] args) {

        Adapter22V adapter22V = new Adapter22V(new Dian220());
        System.out.println(adapter22V.change());

        Adapter5V adapter5V = new Adapter5V(new Dian200());
        System.out.println(adapter5V.change());
        adapter5V.setiDian(new Dian220());
        System.out.println(adapter5V.change());
    }
}
