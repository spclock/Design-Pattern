package com.spc.spring;

import com.spc.iterator.java.IEvent;
import com.spc.iterator.java.IListener;
import org.springframework.stereotype.Component;


/**
 * 后台的监听器
 */
@Component
public class AppListener implements IListener {

    @Override
    public void handlerEvent(IEvent event) {
        SeeGoods source = (SeeGoods)event.getSource();
        System.out.println("后台统计今天的该商品浏览次数：" + source.toString());
    }
}
