package com.spc.chain.java;

//主管
public class Boss extends Handler{


    @Override
    public void processRequest(Context context) {
        System.out.println("老板处理事情 是否同意");
    }
}
