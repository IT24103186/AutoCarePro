package com.sliit.autocarepro.Model;

import java.sql.Time;
import java.util.Date;

public class MaintenanceSchedule {
    private int scheduleId;
    private Date date;
    private Time time;
    private String plateNumber;
    private String serviceType;
    private String status;

    public MaintenanceSchedule(int scheduleId, Date date, Time time, String plateNumber, String serviceType , String status) {
        this.scheduleId = scheduleId;
        this.date = date;
        this.time = time;
        this.plateNumber = plateNumber;
        this.serviceType = serviceType;
        this.status = status;
    }

    public int getScheduleId() {return scheduleId; }
    public void setScheduleId(int scheduleId) {this.scheduleId = scheduleId; }

    public Date getDate() {return date;}
    public void setDate(Date date) { this.date = date;}

    public Time getTime() {return time; }
    public void setTime(Time time) { this.time = time;}

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber;}

    public String getServiceType() { return serviceType;}
    public void setServiceType(String serviceType) {this.serviceType = serviceType; }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

}

