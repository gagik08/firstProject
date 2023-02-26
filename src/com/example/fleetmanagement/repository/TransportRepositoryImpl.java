package com.example.fleetmanagement.repository;

import com.example.fleetmanagement.models.Route;
import com.example.fleetmanagement.models.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TransportRepositoryImpl implements TransportRepository{

    @Override
    public List<Transport> getAllTransports() {
        return transportList;
    }

    @Override
    public boolean addTransport(Transport transport) {
        return transportList.add(transport);
    }

    @Override
    public Optional<Transport> getTransportById(int transportID) {
        for (Transport transport : transportList) {
            if (transport.getTransportID() == transportID) {
                return Optional.of(transport);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean removeTransportById(int transportID) {
        return transportList.remove(getTransportById(transportID).get());
    }

    @Override
    public List<Transport> getTransportsByBrand(String brand) {
        List<Transport> matchingTransports = new ArrayList<>();
        for (Transport transport : transportList) {
            if (transport.getBrand().equalsIgnoreCase(brand)) {
                matchingTransports.add(transport);
            }
        }
        return matchingTransports;
    }

    @Override
    public List<Transport> getTransportsWithoutDriver() {
        List<Transport> matchingTransports = new ArrayList<>();
        for (Transport transport : transportList) {
            if (transport.getDriver() == null) {
                matchingTransports.add(transport);
            }
        }
        return matchingTransports;
    }

    @Override
    public boolean assignTransportToRoute(int transportId, int routeId) {
        return false;
    }
}
