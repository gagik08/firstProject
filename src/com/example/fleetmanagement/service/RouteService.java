package com.example.fleetmanagement.service;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.Route;

import java.util.List;
import java.util.Optional;

public interface RouteService {
    List<Route> getAllRouts();
    boolean addRoute(Route route) throws BusinessLogicException;
    Optional<Route> getRouteById(int routeId);
    boolean removeRouteByID(int routeId) throws BusinessLogicException;

}
