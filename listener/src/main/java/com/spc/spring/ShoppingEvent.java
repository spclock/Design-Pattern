package com.spc.spring;

import com.spc.iterator.java.IEvent;

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
