package com.spc.listener.spring;

import com.spc.listener.java.IEvent;
import com.spc.listener.java.IListener;
import org.springframework.stereotype.Component;


/**
 * 店主的监听器
 */
@Component
public class ShopKeeperListener implements IListener {

    @Override
    public void handlerEvent(IEvent event) {
        SeeGoods source = (SeeGoods)event.getSource();
        System.out.println("通知店主：" + source.toString());
    }
}
