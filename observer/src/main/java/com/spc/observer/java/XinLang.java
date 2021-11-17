package com.spc.observer.java;

public class XinLang implements Observer{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("新浪天气温度为："+weatherData.getTemperature());
        System.out.println("新浪天气湿度为："+weatherData.getHumidity());

    }
}
