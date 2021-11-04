package com.spc.proxy.java.proxy.dynamic;

import com.spc.proxy.java.proxy.staticproxy.Goods;

/**
 * 火鸡
 */
public class Turkey implements Goods {
    @Override
    public int buy() {
        return 200;
    }
}
