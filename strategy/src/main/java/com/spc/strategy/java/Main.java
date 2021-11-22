package com.spc.strategy.java;

/**
 * 策略模式：我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 *
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 */
public class Main {
    public static void main(String[] args) {

        int product=5000;

        Store store = new Store();
        double v = store.checkOut(new SuperVip(), product);
        System.out.println(v);

        double vip = store.checkOut(new Vip(), product);
        System.out.println(vip);

        double user = store.checkOut(new User(), product);
        System.out.println(user);

    }
}
