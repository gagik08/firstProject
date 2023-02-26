package com.example.fleetmanagement.models;

import java.util.Optional;

public class Route {
    private int id;
    private String startPoint;
    private String endPoint;
    private Reservation reservation;

    public Route(int id, String startPoint, String endPoint, Reservation reservation) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.reservation = reservation;
    }

    public Route(Optional<Route> routeById) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", reservation=" + reservation +
                '}';
    }
}
