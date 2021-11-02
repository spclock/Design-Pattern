package com.spc.decorator.java.decorator;

public class WebSocket extends Decorator {
    public WebSocket(Application application) {
        super(application);
        setDescription("websocket功能");
        setPrice(100);
    }
}
