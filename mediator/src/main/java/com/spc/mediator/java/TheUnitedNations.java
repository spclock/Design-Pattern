package com.spc.mediator.java;

import java.util.HashSet;
import java.util.Set;

/**
 * 联合国
 */
public class TheUnitedNations implements Mediator{
    private Set<Country> countries=new HashSet<>();

    @Override
    public void register(Country country) {
        countries.add(country);
        country.setMediator(this);
    }

    @Override
    public void notifyAllCountry(Country sender,String message) {
        for (Country country : countries) {
            if (sender.equals(country)){
                continue;
            }
            country.receive(message);
        }
    }

    @Override
    public void getEntity(String name) {

    }
}
