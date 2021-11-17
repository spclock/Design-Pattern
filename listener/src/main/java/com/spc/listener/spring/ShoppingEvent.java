package com.spc.listener.spring;

import com.spc.listener.java.IEvent;

public class ShoppingEvent implements IEvent<SeeGoods> {

    private SeeGoods seeGoods;

    public ShoppingEvent(SeeGoods seeGoods) {
        this.seeGoods = seeGoods;
    }

    @Override
    public SeeGoods getSource() {
        return seeGoods;
    }
}
