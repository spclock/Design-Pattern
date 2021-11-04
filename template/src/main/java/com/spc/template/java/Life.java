package com.spc.template.java;

public abstract class Life {


    public void lifeTemplate(){
        born();
        learn();
        love();
    }

    void born(){
        System.out.println("出现在一个美丽世界");
    }

    abstract  void learn();

    abstract  void love();

     void die(){
        System.out.println("离开这个美丽的世界");
    }
}
