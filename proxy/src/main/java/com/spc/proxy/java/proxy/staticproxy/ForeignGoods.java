package com.spc.proxy.java.proxy.staticproxy;

public class ForeignGoods implements Goods{
    @Override
    public int buy() {
        return 2000;
    }
}
