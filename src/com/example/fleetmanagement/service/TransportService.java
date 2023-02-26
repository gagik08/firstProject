package com.example.fleetmanagement.service;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportService {
    List<Transport> getAllTransports();
    boolean addTransport(Transport transport) throws BusinessLogicException;
    Optional<Transport> getTransportById(int transportID);
    boolean removeTransportById(int transportID) throws BusinessLogicException;
    List<Transport> getTransportsByBrand(String brand);
    List<Transport> getTransportsWithoutDriver();
    boolean assignTransportToRoute(int transportId, int routeId) throws BusinessLogicException;
//    boolean unassignTransportFromRoute(String transportId);
}
