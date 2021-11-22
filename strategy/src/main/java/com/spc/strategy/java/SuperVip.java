package com.spc.strategy.java;

public class SuperVip implements Customer{
    @Override
    public int discount(int money) {
        return money* 65;
    }
}
