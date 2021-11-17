package com.spc.observer.java;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
