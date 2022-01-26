package com.garage.service;

import com.garage.vehicle.Vehicle;

import java.util.Comparator;

public class VehicleSpeedComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        int maxSpeed1 = v1.getMaxSpeed();
        int maxSpeed2 = v2.getMaxSpeed();

        if (maxSpeed1 > maxSpeed2) {
            return 1;
        } else if (maxSpeed1 < maxSpeed2) {
            return -1;
        } else {
            return 0;
        }
    }
}
