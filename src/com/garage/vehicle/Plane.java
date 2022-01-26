package com.garage.vehicle;

public class Plane implements Vehicle {


    @Override
    public void start() {
        System.out.println("Bzzzzz");
    }

    @Override
    public void stop() {
        System.out.println("pssssss");
    }

    @Override
    public int getMaxSpeed() {
        return 1000;
    }

    @Override
    public int getWeight() {
        return 1000;
    }


}
