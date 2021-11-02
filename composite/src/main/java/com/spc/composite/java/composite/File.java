package com.spc.composite.java.composite;

import java.io.FileNotFoundException;

public abstract class File {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public File add(File entry) throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
