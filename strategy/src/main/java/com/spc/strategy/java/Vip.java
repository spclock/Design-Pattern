package com.spc.strategy.java;

public class Vip implements Customer{
    @Override
    public int discount(int money) {
        return money * 85;
    }
}
