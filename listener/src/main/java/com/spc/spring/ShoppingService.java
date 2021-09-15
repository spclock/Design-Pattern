package com.spc.spring;

import com.spc.java.IListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShoppingService {

    @Autowired
    private List<IListener> listenerList;

    public void shopping(){
        //下面是代替数据库查询信息 或者后台组合信息
        SeeGoods seeGoods = new SeeGoods();
        seeGoods.setGoodsName("xxx book");
        seeGoods.setGoodsPrice(88);
        seeGoods.setCustomerId(1953458);
        seeGoods.setWatchTime(new Date());

        for (IListener iListener : listenerList) {
            iListener.handlerEvent(new ShoppingEvent(seeGoods));
        }
    }
}
