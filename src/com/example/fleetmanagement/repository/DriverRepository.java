package com.example.fleetmanagement.repository;

import com.example.fleetmanagement.models.Driver;

import java.util.ArrayList;
import java.util.List;

public interface DriverRepository {
    List<Driver> drivers = new ArrayList<>();
    void addDriver(Driver driver);

}
