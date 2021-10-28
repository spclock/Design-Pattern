package com.spc.adapter.java.inteface;

public class Main {

    public static void main(String[] args) {


        new Handler(){
            @Override
            public String handlerGet() {
                return null;
            }

            @Override
            public String handlerPost() {
                return null;
            }

            @Override
            public String handlerPut() {
                return null;
            }

            @Override
            public String handlerDelete() {
                return null;
            }
        };

        /**
         * 没有接口适配器就要所有的接口方法都实现一遍
         * 有的接口适配器 我只要实现我关心的方法，其他方法都不用关心都是默认处理
         */
        AdapterHandler adapterHandler = new AdapterHandler() {
            @Override
            public String handlerGet() {
                return "我只处理get请求";
            }
        };

        System.out.println(adapterHandler.handlerGet());
        System.out.println(adapterHandler.handlerPost());

    }
}
