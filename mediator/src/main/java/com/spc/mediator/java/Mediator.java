package com.spc.mediator.java;

public interface Mediator {

    void register(Country country);
    void notifyAllCountry(Country sender,String message);
    void getEntity(String name);
}
