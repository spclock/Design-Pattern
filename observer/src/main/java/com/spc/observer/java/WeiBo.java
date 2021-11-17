package com.spc.observer.java;

public class WeiBo implements Observer{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("微博天气温度为："+weatherData.getTemperature());
        System.out.println("微博天气湿度为："+weatherData.getHumidity());

    }
}
