package com.spc.visitor.java;

public class TestDB extends DB{


    public TestDB(String name, String date) {
        super(name, date);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTestDB(this);
    }


}
