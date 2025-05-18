package com.sliit.autocarepro.Model;

import java.util.Date;

public class ServiceRecord {
    private Date date;
    private String customer;
    private String vehicle;
    private String service;
    private int cost;
    private String status;
    private int recordID;

    public ServiceRecord(Date date, String customer, String vehicle, String service, int cost, String status, int recordID) {
        this.date = date;
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.cost = cost;
        this.status = status;
        this.recordID = recordID;
    }

    // Get Methods
    public Date getDate() {
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

    public int getRecordID() {return recordID;}

    // Set Methods
    public void setDate(Date date) {
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
    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }
}
