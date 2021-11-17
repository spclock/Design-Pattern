package com.spc.listener.spring;

import java.util.Date;

public class SeeGoods {
    private String goodsName;
    private int goodsPrice;
    private int customerId;
    private Date watchTime;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(Date watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public String toString() {
        return "SeeGoods{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", customerId='" + customerId + '\'' +
                ", watchTime=" + watchTime +
                '}';
    }
}
