package com.spc.observer.java;

/**
 * 观察者模式：当一个对象被修改时，则会自动通知依赖它的对象。
 *
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new WeiBo());
        weatherData.addObserver(new XinLang());

        weatherData.updateData(27.8f,39.3f);
    }
}
