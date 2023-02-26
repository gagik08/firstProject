package com.example.fleetmanagement.service;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.Route;
import com.example.fleetmanagement.models.Transport;
import com.example.fleetmanagement.repository.RouteRepository;
import com.example.fleetmanagement.repository.TransportRepository;
import com.example.fleetmanagement.repository.TransportRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class TransportServiceImpl implements TransportService   {
    private TransportRepository transportRepository;
    private RouteRepository routeRepository;

    public TransportServiceImpl() {
        this.transportRepository = new TransportRepositoryImpl();
    }
    @Override
    public List<Transport> getAllTransports() {
        return transportRepository.getAllTransports();
    }

    @Override
    public boolean addTransport(Transport transport) throws BusinessLogicException {
        List<Transport> existingTransport = getAllTransports();
        for (Transport checkedTransport : existingTransport) {
            if (checkedTransport.getTransportID() == transport.getTransportID()) {
                    throw new BusinessLogicException("Transport with this ID already exists");
            }
        }
        transportRepository.addTransport(transport);
        return true;
    }

    @Override
    public Optional<Transport> getTransportById(int transportID) {
        return transportRepository.getTransportById(transportID);
    }

    @Override
    public boolean removeTransportById(int transportID) throws BusinessLogicException {
        Optional<Transport> optionalTransport = transportRepository.getTransportById(transportID);
        if (optionalTransport.isPresent()) {
            transportRepository.removeTransportById(transportID);
            return true;
        } else {
            throw new BusinessLogicException("Transport with ID " + transportID + " does not exist.");
        }
    }

    @Override
    public List<Transport> getTransportsByBrand(String brand) {
        return transportRepository.getTransportsByBrand(brand);
    }

    @Override
    public List<Transport> getTransportsWithoutDriver() {
        return transportRepository.getTransportsWithoutDriver();
    }

//    @Override
//    public boolean assignTransportToRoute(int transportId, int routeId) throws BusinessLogicException {
//        Optional<Transport> optionalTransport = transportRepository.getTransportById(transportId);
//        Optional<Route> optionalRoute = routeRepository.getRouteById(routeId);
//
//        if (optionalTransport.isEmpty()) {
//            throw new BusinessLogicException("Transport with ID " + transportId + " not found.");
//        }
//
//        if (optionalRoute.isEmpty()) {
//            throw new BusinessLogicException("Route with ID " + routeId + " not found.");
//        }
//
//        Transport transport = optionalTransport.get();
//        Route route = optionalRoute.get();
//
//        if (route.getReservation().getStatus()) { //false == not assigned, true == assigned
//            throw new BusinessLogicException("Route " + route.getId() + " already has an assigned transport");
//        }
//
//        if (transport.getReservation().getStatus()){
//            throw new BusinessLogicException("Transport " + route.getId() + " has already assigned to route.");
//        }
    }

