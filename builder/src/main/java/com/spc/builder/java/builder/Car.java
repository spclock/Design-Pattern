package com.spc.builder.java.builder;

public class Car {

    private int wheel;//轮子

    private int engine;//发动机 缸

    /**
     * 、BOSE
     * 、Harman/Kardon （哈曼卡顿）
     * 、Dynaudio（丹拿）
     * 、Bang & Olufsen（B&O）
     * 、Merdian（英国之宝）
     * 、Burmester（柏林之声）
     * 、Bowers&Wilkins (宝华韦健)
     * 、Beats
     */
    private String Speaker;

    /**
     * 感恩/Ganen、好孩子/Goodbaby、宝贝第一/Babyfist、宝得适/BRITAX、欧颂/Osann、赛百适/CYBEX、葛莱/GRACO、猫头鹰/savile、首席官/CHIEF OFFICER、康科德/CONCORD
     */
    private String seat;

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getSpeaker() {
        return Speaker;
    }

    public void setSpeaker(String speaker) {
        Speaker = speaker;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                ", Speaker='" + Speaker + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
