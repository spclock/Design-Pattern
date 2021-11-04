package com.spc.template.java;

public class ZhangSan extends Life{
    @Override
    void learn() {
        System.out.println(this.getClass().getName()+" 努力学习天天上上");
    }

    @Override
    void love() {
        System.out.println("单身贵族");
    }
}
