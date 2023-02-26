package com.example.fleetmanagement.models;

public class Driver {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private DriverQualificationEnum skillLevel;

    public Driver(int id, String firstName, String lastName, String phoneNumber, DriverQualificationEnum skillLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DriverQualificationEnum getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(DriverQualificationEnum skillLevel) {
        this.skillLevel = skillLevel;
    }

}
