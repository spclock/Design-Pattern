package com.spc.composite.java.composite;

public class Txt extends File {

    public Txt(String name,int size) {
        setName(name);
        setSize(size);
    }

    @Override
    protected void printList(String prefix) {

    }
}
