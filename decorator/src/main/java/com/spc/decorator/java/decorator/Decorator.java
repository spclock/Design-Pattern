package com.spc.decorator.java.decorator;

public class Decorator extends Application {

    Application application;

    public Decorator(Application application) {
        this.application = application;
    }

    @Override
    public String getDescription() {
        return application.getDescription() + "  " + super.getDescription();
    }

    @Override
    int cost() {
        return application.cost() + this.getPrice();
    }

}
