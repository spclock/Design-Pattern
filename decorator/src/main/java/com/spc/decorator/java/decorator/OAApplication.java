package com.spc.decorator.java.decorator;


public class OAApplication extends Application {
    public OAApplication() {
//        super();
        setDescription("OA应用");
        setPrice(1000);
    }

    @Override
    int cost() {
        return getPrice();
    }

}
