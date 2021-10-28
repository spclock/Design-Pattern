package com.spc.adapter.java.inteface;

public abstract class AdapterHandler implements Handler {


//    @Override
//    public String handlerGet() {
//        return "AdapterHandler get请求的默认处理";
//    }

    @Override
    public String handlerPost() {
        return "AdapterHandler Post请求的默认处理";
    }

    @Override
    public String handlerPut() {
        return "AdapterHandler Put请求的默认处理";
    }

    @Override
    public String handlerDelete() {
        return "AdapterHandler Delete请求的默认处理";
    }
}
