package com.garage;

import com.garage.service.GarageService;
import com.garage.vehicle.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();

        Stone stone = new Stone();
        stone.lala();

        garageService.registerVehicle(stone);
        garageService.registerVehicle(new Truck());
        garageService.registerVehicle(new Plane());
        garageService.registerVehicle(new SportCar("Tesla", 300, 1500));
        garageService.registerVehicle(new SportCar("BMW", 350, 1450));
        garageService.registerVehicle(new SportCar("F1", 550, 900));
        garageService.registerStone(new TractorMonument());
        garageService.registerVehicle(new Stone());
        garageService.registerStone(new Stone());
        garageService.registerSportCars(new SportCar("Tesla-1", 300, 1500));
        garageService.registerSportCars(new SportCar("BMW-1", 350, 1450));
        garageService.registerSportCars(new SportCar("F1-1", 550, 900));


        int vehiclesCount = garageService.getVehiclesCount();
        System.out.println("registered vehicles count is " + vehiclesCount);

        int weight = garageService.getSumWeight();
        System.out.println("summary weight of the registered vehicles is " + weight);
        garageService.startAll();


        Vehicle fastestVehicle = garageService.getFastestVehicle();
        System.out.println("The fastest vehicle is " + fastestVehicle.getName()+ " Model is " + fastestVehicle.getModel());
        fastestVehicle.start();


        Stone stone1 = garageService.getWeightestStone();
        System.out.println("The weightest stone is " + stone1.getName()+ " Model is " + stone1.getModel());
        stone1.lala();

        SportCar[] sportCars = garageService.getSportCars();
        System.out.println(Arrays.toString(sportCars));
    }
}
