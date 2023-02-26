package com.example.fleetmanagement;

import com.example.fleetmanagement.exceptions.BusinessLogicException;
import com.example.fleetmanagement.models.*;
import com.example.fleetmanagement.service.RouteService;
import com.example.fleetmanagement.service.RouteServiceImpl;
import com.example.fleetmanagement.service.TransportService;
import com.example.fleetmanagement.service.TransportServiceImpl;


public class Main {
    public static void main(String[] args) throws BusinessLogicException {
        RouteService routeService = new RouteServiceImpl();
        Route route1 = new Route(5,"Moscow", "Tbilisi", new Reservation(false));
//        Route route2 = new Route(4,"Cair", "Tbilisi");
//        Route route3 = new Route(2,"Cai1r", "Tbilisi");
//        System.out.println(routeService.addRoute(route1));
//        System.out.println(routeService.addRoute(route2));
//        System.out.println(routeService.addRoute(route3));
//
//        System.out.println(routeService.getRouteById(5));
//        System.out.println(routeService.getRouteById(4));
//        System.out.println(routeService.getRouteById(2));
//
//        System.out.println(routeService.deleteRouteById(2));
        TransportService transportService = new TransportServiceImpl();
        Driver driver1 = new Driver(1,"gagik","kazandjyan","+995597*****1", DriverQualificationEnum.TRAM_DRIVER);
        Transport transport1 = new Transport(5,"BMW","X7",6,null, route1, new Reservation(false), DriverQualificationEnum.TRAM_DRIVER);
        Transport transport2 = new Transport(2,"AMG","C63",6,null, route1,new Reservation(true), DriverQualificationEnum.TRAM_DRIVER);
        Transport transport3 = new Transport(7,"MAZDA","CX7",6,driver1, route1, new Reservation(false), DriverQualificationEnum.TRAM_DRIVER);

        System.out.println(transportService.addTransport(transport1));
        System.out.println(transportService.addTransport(transport2));
        System.out.println(transportService.addTransport(transport3));
        System.out.println(transportService.getTransportById(3));
//        System.out.println(transportService.removeTransportById(2));
        System.out.println(transportService.getTransportsByBrand("amg"));
        System.out.println(transportService.getTransportsWithoutDriver());


    }
}
