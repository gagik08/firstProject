package com.example.fleetmanagement.models;

public class Reservation {
    private boolean status;

    public Reservation(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
