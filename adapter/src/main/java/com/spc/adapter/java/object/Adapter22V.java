package com.spc.adapter.java.object;

public class Adapter22V  implements IAdapter {

    private Dian220 dian220;

    public Adapter22V(Dian220 dian220) {
        this.dian220 = dian220;
    }

    @Override
    public int change() {
        return dian220.getDian()/10;
    }
}
