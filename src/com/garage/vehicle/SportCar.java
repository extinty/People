package com.garage.vehicle;

public class SportCar extends VehicleBase {


    @Override
    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public int getWeight() {
        return 1000;
    }
}
