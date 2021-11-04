package com.spc.proxy.java.proxy.dynamic;

import com.spc.proxy.java.proxy.staticproxy.Goods;

/**
 * 德国牛奶
 */
public class GermanyMilk implements Goods {
    @Override
    public int buy() {
        return 100;
    }
}
