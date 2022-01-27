package com.garage.vehicle;

public class Plane implements Vehicle {


    @Override
    public String getModel() {
        return "Plane";
    }

    @Override
    public void start() {
        System.out.println("Plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping");
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
