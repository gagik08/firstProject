package com.example.fleetmanagement.service;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.Route;
import com.example.fleetmanagement.repository.RouteRepository;
import com.example.fleetmanagement.repository.RouteRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class RouteServiceImpl implements RouteService {
    private RouteRepository routeRepository;

    public RouteServiceImpl() {
        this.routeRepository = new RouteRepositoryImpl(); // or any other implementation of RouteRepository
    }

    @Override
    public List<Route> getAllRouts() {
        return routeRepository.getAllRouts();
    }

    @Override
    public boolean addRoute(Route route) throws BusinessLogicException {
        List<Route> existingRoute = getAllRouts();
        for (Route allRoutes : existingRoute) {
            if (allRoutes.getId() == route.getId()) {
                throw new BusinessLogicException("Route with this ID already exists");
            }
        }
        routeRepository.addRoute(route);
        return true;
    }

    @Override
    public Optional<Route> getRouteById(int routeId) {
        return routeRepository.getRouteById(routeId);
    }

    @Override
    public boolean removeRouteByID(int routeId) throws BusinessLogicException {
        Optional<Route> optionalRoute = routeRepository.getRouteById(routeId);
        if (optionalRoute.isPresent()) {
            routeRepository.removeRouteByID(routeId);
            return true;
        } else {
            throw new BusinessLogicException("Route with ID " + routeId + " does not exist.");
        }
    }
}

