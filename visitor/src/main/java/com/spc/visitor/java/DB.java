package com.spc.visitor.java;

public abstract class DB {

    private String name;
    private String date;

    public DB(String name,String date) {
        this.name = name;
        this.date = date;
    }
    abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
