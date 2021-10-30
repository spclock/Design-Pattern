package com.spc.builder.java.builder;

public class TestBuilder {

    private Car car=new Car();

    public static TestBuilder builder(){
        return new TestBuilder();
    }

    public TestBuilder setWheel(int wheel){
        car.setWheel(wheel);
        return this;
    }

    public TestBuilder setEngine(int engine){
        car.setEngine(engine);
        return this;
    }

    public TestBuilder setSpeaker(String speaker) {
        car.setSpeaker(speaker);
        return this;
    }

    public TestBuilder setSeat(String seat) {
        car.setSeat(seat);
        return this;
    }

    public Car build(){
        if(this.car.getWheel()<=0){
            this.car.setWheel(4);
        }
        if (this.car.getEngine()<=0){
            this.car.setEngine(5);
        }
        if ( this.car.getSeat()==null || this.car.getSeat().equals("") ){
            this.car.setSeat("BRITAX");
        }
        if (this.car.getSpeaker()==null || this.car.getSpeaker().equals("") ){
            this.car.setSpeaker("Harman");
        }
        return car;
    }
}
