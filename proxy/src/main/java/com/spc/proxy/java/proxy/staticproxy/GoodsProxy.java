package com.spc.proxy.java.proxy.staticproxy;

public class GoodsProxy implements Goods {

    private int tip = 30;

    private Goods goods;

    public GoodsProxy(Goods goods) {
        this.goods = goods;
    }

    @Override
    public int buy() {
        System.out.println("代购  一条龙服务===========");
        System.out.println("代购 质量把关");
        System.out.println("代购 交税收");
        System.out.println("送货到家");
        System.out.println("添加代购费" + tip);
        return goods.buy() + tip;
    }

}
