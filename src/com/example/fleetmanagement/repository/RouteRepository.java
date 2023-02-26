package com.example.fleetmanagement.repository;

import com.example.fleetmanagement.models.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface RouteRepository {
    List <Route> routeList = new ArrayList<>();
    List <Route> getAllRouts();
    boolean addRoute(Route route);
    Optional<Route> getRouteById(int routeId);
    boolean removeRouteByID(int routeId);
}
