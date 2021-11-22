package com.spc.strategy.java;

public class User implements Customer{
    @Override
    public int discount(int money) {
        return money * 95 ;
    }
}
