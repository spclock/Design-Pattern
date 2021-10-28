package com.spc.adapter.java.clazz;

public class Adapter22V extends Dian220 implements IAdapter {
    @Override
    public int change() {
        return getDian()/10;
    }
}
