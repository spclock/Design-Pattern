package com.spc.visitor.java;

public class ProduceDB extends DB{

    public ProduceDB(String name, String date) {
        super(name, date);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProduceDB(this);
    }

}
