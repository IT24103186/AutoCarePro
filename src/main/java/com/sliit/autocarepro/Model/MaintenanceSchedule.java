package com.sliit.autocarepro.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MaintenanceSchedule {
    private int scheduleId;
    private LocalDate date;
    private LocalTime time;
    private String plateNumber;
    private String serviceType;
    private String status;
    private String notes;


    public MaintenanceSchedule(int scheduleId, LocalDate date, LocalTime time, String plateNumber, String serviceType , String status, String notes) {
        this.scheduleId = scheduleId;
        this.date = date;
        this.time = time;
        this.plateNumber = plateNumber;
        this.serviceType = serviceType;
        this.status = status;
        this.notes = notes;
    }


    public int getScheduleId() {return scheduleId; }
    public void setScheduleId(int scheduleId) {this.scheduleId = scheduleId; }

    public LocalDate getDate() {return date;}
    public void setDate(LocalDate date) { this.date = date;}


    public LocalTime getTime() {return time; }
    public void setTime(LocalTime time) { this.time = time;}


    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber;}

    public String getServiceType() { return serviceType;}
    public void setServiceType(String serviceType) {this.serviceType = serviceType; }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public String getNotes() {return notes;}
    public void setNotes(String notes) {this.notes = notes;}
}

