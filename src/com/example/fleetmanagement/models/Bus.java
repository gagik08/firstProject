package com.example.fleetmanagement.models;

public class Bus extends Transport{
    private String type;
    private int numberOfDoors;

    public Bus(int id, String brand, String model, int passengerCapacity, Driver driver, Route route, DriverQualificationEnum skillLevel, String type, int numberOfDoors) {
        super(id, brand, model, passengerCapacity, driver, route, skillLevel);
        this.type = type;
        this.numberOfDoors = numberOfDoors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
