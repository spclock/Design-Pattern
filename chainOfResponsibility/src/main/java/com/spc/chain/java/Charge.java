package com.spc.chain.java;

//主管
public class Charge extends Handler{

    @Override
    public void processRequest(Context context) {
        //主管是否同意？
        System.out.println("主管处理事情 是否同意");
        //条件是否还有提交到上级
        if (context.getCost()>=10000){
            System.out.println("金额超过1w");
            nextHandler.processRequest(context);
        }


    }
}
