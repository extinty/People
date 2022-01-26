package com.garage.vehicle;

public class Stone implements Vehicle {

    @Override
    public void start() {
        System.out.println("I can't");
    }

    @Override
    public void stop() {
        System.out.println("I can't");
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 50;
    }

    public int lala(){
        return 1212;
    }
}
