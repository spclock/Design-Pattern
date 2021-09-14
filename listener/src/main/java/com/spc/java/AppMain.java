package com.spc.java;

public class AppMain {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.addListener(event ->{
            EventSource source = (EventSource) event.getSource();
            System.out.println("监听到事件发生"+source);
            System.out.println("事件对象"+event.getClass());
            //to do something
        });

        //当对象 运动被调用
        eventSource.sport();
    }
}
