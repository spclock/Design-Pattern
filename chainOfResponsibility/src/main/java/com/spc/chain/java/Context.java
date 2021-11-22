package com.spc.chain.java;

public class Context {

    private String topic;
    private int cost ;

    public Context(String topic, int cost ) {
        this.topic = topic;
        this.cost  = cost ;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
