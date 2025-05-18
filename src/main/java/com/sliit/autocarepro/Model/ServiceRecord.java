package com.sliit.autocarepro.Model;

public class ServiceRecord {
    private int date;
    private String customer;
    private String vehicle;
    private String service;
    private int cost;
    private String status;

    public ServiceRecord(int date, String customer, String vehicle, String service, int cost, String status) {
        this.date = date;
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.cost = cost;
        this.status = status;
    }

    // Get Methods
    public int getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getService() {
        return service;
    }

    public int getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    // Set Methods
    public void setDate(int date) {
        this.date = date;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
