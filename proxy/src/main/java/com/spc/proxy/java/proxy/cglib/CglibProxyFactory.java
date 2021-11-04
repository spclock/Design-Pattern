package com.spc.proxy.java.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        //创建工具类
//        Enhancer enhancer=new Enhancer();
        //设置父类
//        enhancer.setSuperclass(target.getClass());
        //设置回调函数
//        enhancer.setCallback(this);
        //创建子类对象（代理对象）
        return Enhancer.create(target.getClass(), this);
//        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理");
        Object invoke = method.invoke(target, objects);
        System.out.println("执行方法后的 cglib代理");
        return invoke;
    }
}
