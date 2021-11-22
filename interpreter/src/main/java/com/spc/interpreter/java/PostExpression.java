package com.spc.interpreter.java;

public class PostExpression implements Expression {
    @Override
    public void interpreter(String ctx) {
        String[] s = ctx.split(" ");
        System.out.println("POST 发送请求url：" + s[0] + " 发送的内容" + s[1]);
    }
}
