package com.spc.decorator.java.decorator;

public class Monitor extends Decorator{
    public Monitor(Application application) {
        super(application);
        setDescription("监控功能");
        setPrice(300);
    }
}
