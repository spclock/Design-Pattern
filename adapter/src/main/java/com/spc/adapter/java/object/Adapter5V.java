package com.spc.adapter.java.object;

public class Adapter5V implements IAdapter {

    private IDian iDian;

    public Adapter5V(IDian iDian) {
        this.iDian = iDian;
    }

    public void setiDian(IDian iDian) {
        this.iDian = iDian;
    }

    public int change(){
        return iDian instanceof Dian220 ? iDian.getDian()/44 : iDian.getDian()/40;
    }
}
