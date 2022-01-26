package com.garage.vehicle;

public interface Vehicle {


    void start();

    void stop();

    int getMaxSpeed();

    int getWeight();

    default String getName() {
        return getClass().getName() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight();
    }


}
