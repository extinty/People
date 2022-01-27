package com.garage.vehicle;

public class Truck extends VehicleBase {

    @Override
    public String getModel() {
        return "Truck";
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public int getWeight() {
        return 5000;
    }
}
