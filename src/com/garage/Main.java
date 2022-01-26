package com.garage;

import com.garage.service.GarageService;
import com.garage.vehicle.*;

public class Main {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();

        Stone stone = new Stone();
        stone.lala();

        garageService.registerVehicle(stone);
        garageService.registerVehicle(new Truck());
        garageService.registerVehicle(new Plane());
        garageService.registerVehicle(new SportCar());
        garageService.registerStone(new TractorMonument());
        garageService.registerVehicle(new Stone());
        garageService.registerStone(new Stone());


        int vehiclesCount = garageService.getVehiclesCount();
        System.out.println("registered vehicles count is " + vehiclesCount);

        int weight = garageService.getSumWeight();
        System.out.println("summary weight of the registered vehicles is " + weight);
        garageService.startAll();


        Vehicle fastestVehicle = garageService.getFastestVehicle();
        System.out.println("The fastest vehicle is " + fastestVehicle.getName());
        fastestVehicle.start();


        Stone stone1 = garageService.getWeightestStone();
        System.out.println("The weightest stone is " + stone1.getName());
        stone1.lala();


    }
}
