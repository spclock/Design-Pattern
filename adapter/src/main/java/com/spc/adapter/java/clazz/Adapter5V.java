package com.spc.adapter.java.clazz;

public class Adapter5V extends Dian220 implements IAdapter {

    public int change(){
        return this.getDian()/44;
    }
}
