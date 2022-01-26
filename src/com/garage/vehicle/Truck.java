package com.garage.vehicle;

public class Truck extends VehicleBase {

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public int getWeight() {
        return 5000;
    }
}
