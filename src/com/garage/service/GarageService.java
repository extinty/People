package com.garage.service;

import com.garage.vehicle.Stone;
import com.garage.vehicle.Vehicle;

import java.util.Arrays;

public class GarageService {
    private Vehicle[] vehicles = new Vehicle[0];
    private Stone[] stones = new Stone[0];

    /**
     * create a new array to copy all existing vehicles and add a new one to {@link #vehicles}
     */
    public void registerVehicle(Vehicle vehicle) {
        Vehicle[] vehicles = new Vehicle[this.vehicles.length + 1];

        for (int i = 0; i < this.vehicles.length; i++) {
            vehicles[i] = this.vehicles[i];
        }
        vehicles[this.vehicles.length] = vehicle;

        this.vehicles = vehicles;
    }

    /**
     * create a new array to copy all existing vehicles and add a new one to {@link #vehicles}
     * and create a new array to copy all existing stones and add a new one to {@link #stones}
     */
    public void registerStone(Stone stone) {
        registerVehicle(stone);


        Stone[] stones = new Stone[this.stones.length + 1];

        for (int i = 0; i < this.stones.length; i++) {
            stones[i] = this.stones[i];
        }
        stones[this.stones.length] = stone;

        this.stones = stones;
    }

    /**
     * @return count of registered vehicles
     */
    public int getVehiclesCount() {
        return vehicles.length;
    }

    /**
     * @return the fastest vehicle based on its max speed value
     */
    public Vehicle getFastestVehicle() {
        if (vehicles.length == 0) {
            return null;
        } else {
            Vehicle[] vehicles = new Vehicle[this.vehicles.length];
            for (int i = 0; i < this.vehicles.length; i++) {
                vehicles[i] = this.vehicles[i];
            }

            VehicleSpeedComparator vehicleSpeedComparator = new VehicleSpeedComparator();
            Arrays.sort(vehicles, vehicleSpeedComparator);

            return vehicles[vehicles.length - 1];
        }
    }

    /**
     * @return the weightest stone based on its weight value
     */
    public Stone getWeightestStone() {
        if (vehicles.length == 0) {
            return null;
        } else {
            Stone[] stones = new Stone[this.stones.length];
            for (int i = 0; i < this.stones.length; i++) {
                stones[i] = this.stones[i];
            }

            VehicleWeightComparator vehicleWeightComparator = new VehicleWeightComparator();
            Arrays.sort(stones, vehicleWeightComparator);

            return stones[stones.length - 1];
        }
    }

    /**
     * @return the summary weight af all the registered vehicles
     */
    public int getSumWeight() {
        int result = 0;
        for (Vehicle vehicle : vehicles) {
            result += vehicle.getWeight();
        }
        return result;
    }

    /**
     * starts all vehicles
     */
    public void startAll() {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }


}
