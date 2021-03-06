package com.garage.vehicle;

public abstract class VehicleBase implements Vehicle {
    @Override
    public String getName() {
        return "VehicleBase";
    }

    @Override
    public void start() {
        System.out.println("I'm starting");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopping");
    }
}
