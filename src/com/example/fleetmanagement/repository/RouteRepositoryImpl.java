package com.example.fleetmanagement.repository;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.Route;

import java.util.List;
import java.util.Optional;

public class RouteRepositoryImpl implements RouteRepository {
    @Override
    public List<Route> getAllRouts() {
        return routeList;
    }

    @Override
    public boolean addRoute(Route route) {
        return routeList.add(route);
    }

    @Override
    public Optional<Route> getRouteById(int routeId) {
        for (Route route : routeList) {
            if (route.getId() == routeId) {
                return Optional.of(route);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean removeRouteByID(int routeId){
        return routeList.remove(getRouteById(routeId).get());
    }
}
