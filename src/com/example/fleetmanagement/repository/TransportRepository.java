package com.example.fleetmanagement.repository;

import com.example.fleetmanagement.models.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TransportRepository {
    List<Transport> transportList = new ArrayList<>();

    List<Transport> getAllTransports();
    boolean addTransport(Transport transport);
    Optional<Transport> getTransportById(int transportID);
    boolean removeTransportById(int transportID);
    List<Transport> getTransportsByBrand(String brand);
    List<Transport> getTransportsWithoutDriver();
    boolean assignTransportToRoute(int transportId, int routeId);


}
