package com.spc.composite.java.composite;

public class Doc extends File {

    public Doc(String name,int size) {
        setName(name);
        setSize(size);
    }

    @Override
    protected void printList(String prefix) {

    }
}
