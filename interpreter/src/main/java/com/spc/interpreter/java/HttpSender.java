package com.spc.interpreter.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HttpSender {

    private Map<String,Expression> expressionMap=new HashMap<>();

    private HttpSender() {
        expressionMap.put("GET",new GetExpression());
        expressionMap.put("POST",new PostExpression());
    }

    public void sendRequest(String ctx){
        //第一个空格分开
        String[] s = ctx.split(" ", 2);
        Expression expression = expressionMap.get(s[0]);
        if (expression==null){
            System.out.println("表达式错误：" + ctx);
            return;
        }
        expression.interpreter(s[1]);
    }

    private static final HttpSender httpSender=new HttpSender();

    public static HttpSender getInstance(){
        return httpSender;
    }
}
