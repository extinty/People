package com.garage.vehicle;

public class SportCar extends VehicleBase {

    private String model = "now is empty";
    private int speed = 0;
    private int weight = 0;

    public SportCar (String model, int speed, int weight) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {

        return "Model is "+this.model+ " speed is " + this.speed+ " weight is "+this.weight;
    }
}
