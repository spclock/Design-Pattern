package com.spc.decorator.java.decorator;

public abstract class Application {

    private int price;
    private String description;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract int cost();


}
