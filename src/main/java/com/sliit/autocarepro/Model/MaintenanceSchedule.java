package com.sliit.autocarepro.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MaintenanceSchedule {
    private LocalDate date;
    private LocalTime time;
    private Long vehicle;
    private String service;
    private String status;
    private String notes;

    public MaintenanceSchedule(Long vehicle, String service, LocalDate date, LocalTime time, String status, String notes) {
        this.vehicle = vehicle;
        this.service = service;
        this.date = date;
        this.time = time;
        this.status = status;
        this.notes = notes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Long getVehicle() {
        return vehicle;
    }

    public void setVehicle(Long vehicle) {
        this.vehicle = vehicle;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void printDetails() {
        System.out.println(" Date :" + date +
                ", Time: " + time+
                ", Vehicle: " + vehicle +
                ", Service: " + service +
                ", Status: " + status +
                ", Notes: " + notes);
    }
}

