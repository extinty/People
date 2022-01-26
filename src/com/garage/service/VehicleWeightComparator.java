package com.garage.service;

import com.garage.vehicle.Vehicle;

import java.util.Comparator;

public class VehicleWeightComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        int w1 = v1.getWeight();
        int w2 = v2.getWeight();

        if (w1 > w2) {
            return 1;
        } else if (w1 < w2) {
            return -1;
        } else {
            return 0;
        }
    }
}
