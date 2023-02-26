package com.example.fleetmanagement.models;

public class Transport {
    private int transportID;
    private String brand;
    private String model;
    private int passengerCapacity;
    private Driver driver;
    private Route route;
    private Reservation reservation;
    private DriverQualificationEnum skillLevel;

    public Transport(int id, String brand, String model, int passengerCapacity, Driver driver, Route route, Reservation reservation, DriverQualificationEnum skillLevel) {
        this.transportID = id;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.driver = driver;
        this.route = route;
        this.skillLevel = skillLevel;
        this.reservation = reservation;
    }

    public int getTransportID() {
        return transportID;
    }

    public void setTransportID(int transportID) {
        this.transportID = transportID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public DriverQualificationEnum getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(DriverQualificationEnum skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportID=" + transportID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", driver=" + driver +
                ", route=" + route +
                ", reservation=" + reservation +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
