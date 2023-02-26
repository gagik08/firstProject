package com.example.fleetmanagement.models;

public class Tram extends Transport{
    private int numberOfWagons;

    public Tram(int id, String brand, String model, int passengerCapacity, Driver driver, Route route, DriverQualificationEnum skillLevel, int numberOfWagons) {
        super(id, brand, model, passengerCapacity, driver, route, skillLevel);
        this.numberOfWagons = numberOfWagons;
    }


}
