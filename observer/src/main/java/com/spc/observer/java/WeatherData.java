package com.spc.observer.java;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList=new ArrayList<>();
    private float temperature;//温度
    private float humidity;//湿度

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }



    public void updateData(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;

        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
