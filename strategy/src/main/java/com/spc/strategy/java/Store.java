package com.spc.strategy.java;

public class Store {


    public double checkOut(Customer customer,int money){
        int discount = customer.discount(money);
        return discount/100;
    }
}
