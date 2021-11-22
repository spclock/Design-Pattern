package com.spc.chain.java;

//主管
public class Manager extends Handler{

    @Override
    public void processRequest(Context context) {
        //经理是否同意？
        System.out.println("经理处理事情 是否同意");
        //条件是否还有提交到上级
        if (context.getCost()>=35000){
            System.out.println("金额超过3.5w");
            nextHandler.processRequest(context);
        }
        

    }
}
